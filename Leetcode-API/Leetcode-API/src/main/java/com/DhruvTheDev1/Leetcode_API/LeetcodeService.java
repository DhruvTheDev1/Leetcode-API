package com.DhruvTheDev1.Leetcode_API;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class LeetcodeService {

  private final WebClient webClient;

  public LeetcodeService(WebClient.Builder webClientBuilder) {
    this.webClient = webClientBuilder
        .baseUrl("https://leetcode.com/graphql/")
        .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
        .build();
  }

  public LeetcodeData getStats(String username) {
    // query - POST request
    String query = "{\r\n" + //
        "    \"query\": \"query getUserProfile($username: String!) { matchedUser(username: $username) { submitStats { acSubmissionNum { difficulty count } } } }\",\r\n"
        + //
        "    \"variables\": {\r\n" + //
        "        \"username\": \"" + username + "\"\r\n" +
        "    }\r\n" + //
        "}";

    try {
      String response = webClient.post()
          .bodyValue(query)
          .retrieve()
          .bodyToMono(String.class)
          .block();

      return leetcodeData(response);

    } catch (Exception e) {
      // not valid username
      return new LeetcodeData(0, 0, 0, 0);
    }

  }

  public LeetcodeData leetcodeData(String response) {
    JSONObject jsonObj = new JSONObject(response);

    // getting acSubmissionNum array in response
    JSONArray acSubmissionNum = jsonObj.getJSONObject("data")
        .getJSONObject("matchedUser")
        .getJSONObject("submitStats")
        .getJSONArray("acSubmissionNum");

    int easy = 0, medium = 0, hard = 0, total = 0;

    for (int i = 0; i < acSubmissionNum.length(); i++) {
      JSONObject stats = acSubmissionNum.getJSONObject(i);
      String difficulty = stats.getString("difficulty");
      int count = stats.getInt("count");

      if (difficulty.equals("All")) {
        total = count;
      } else if (difficulty.equals("Easy")) {
        easy = count;
      } else if (difficulty.equals("Medium")) {
        medium = count;
      } else if (difficulty.equals("Hard")) {
        hard = count;
      }
    }

    return new LeetcodeData(easy, medium, hard, total);
  }

  // testing
  // public static void main(String[] args) {
  // LeetcodeService service = new LeetcodeService(WebClient.builder());
  // LeetcodeData stats = service.getStats();
  // System.out.println("Total: ");
  // System.out.println(stats.getTotal());
  // }
}
