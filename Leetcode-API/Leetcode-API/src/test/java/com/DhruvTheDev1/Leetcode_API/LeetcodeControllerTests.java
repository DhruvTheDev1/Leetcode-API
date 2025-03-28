package com.DhruvTheDev1.Leetcode_API;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

// @GraphQlTest(.class)
public class LeetcodeControllerTests {

  @Autowired
  private GraphQlTester graphQlTester;

  @Test
  void getLeetcodeStats() {
    // graphql query
    this.graphQlTester
        .document("""
                query GetLeetcodeStats($username: String!) {
                    leetcodeStats(username: $username) {
                        easy
                        medium
                        hard
                        total
                    }
                }
            """)
        .variable("username", "TestUsername")
        .execute() 
        .path("leetcodeStats") 
        .matchesJson("""
                {
                    "easy": 100,
                    "medium": 100,
                    "hard": 20,
                    "total": 220
                }
            """);
  }
}
