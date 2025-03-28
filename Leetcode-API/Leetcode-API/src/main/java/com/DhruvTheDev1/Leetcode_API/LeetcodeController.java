package com.DhruvTheDev1.Leetcode_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leetcode")
public class LeetcodeController {

  private final LeetcodeService leetcodeService;

  public LeetcodeController(LeetcodeService leetcodeService) {
    this.leetcodeService = leetcodeService;
  }

  @GetMapping("/stats")
  public String getLeetcodeStats() {
    LeetcodeData data = leetcodeService.getStats();
    return data.toString(); // Return as string instead of JSON
  }
}
