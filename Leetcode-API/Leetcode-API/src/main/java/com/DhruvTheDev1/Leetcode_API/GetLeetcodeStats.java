package com.DhruvTheDev1.Leetcode_API;

import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

public class GetLeetcodeStats {

  public static String getLeetcodeStats() {

    // constructing webClient with GraphQL server base URL
    WebClient webClient = WebClient.builder()
        .baseUrl("https://leetcode.com/graphql/")
        .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json") 
        .build();

    // query - POST request
    String query = "{\r\n" + //
        "    \"query\": \"query getUserProfile($username: String!) { matchedUser(username: $username) { submitStats { acSubmissionNum { difficulty count } } } }\",\r\n"
        + //
        "    \"variables\": {\r\n" + //
        "        \"username\": \"\"\r\n" + //
        "    }\r\n" + //
        "}";

    // returns JSON response with requested data
    String response = webClient.post()
    .bodyValue(query)
    .retrieve()
    .bodyToMono(String.class)
    .block();
    
    return response;
  }

  public static void main(String[] args) {
    String response = getLeetcodeStats();
    System.out.println(response);
  }
}
