package com.DhruvTheDev1.Leetcode_API;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class LeetcodeGraphQLController  {
  @QueryMapping
  public LeetcodeData leetcodeStats(@Argument String username) {

    if ("TestUsername".equals(username)) {
      return new LeetcodeData(100, 100, 20, 220);
    }
    return new LeetcodeData(0, 0, 0, 0);
  }
}
