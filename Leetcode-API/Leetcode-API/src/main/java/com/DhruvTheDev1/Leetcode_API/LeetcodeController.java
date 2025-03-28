package com.DhruvTheDev1.Leetcode_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leetcode")
public class LeetcodeController {

  private final LeetcodeService leetcodeService;

  public LeetcodeController(LeetcodeService leetcodeService) {
    this.leetcodeService = leetcodeService;
  }

  @GetMapping("/stats/{username}")
  public LeetcodeData getLeetcodeStats(@PathVariable String username) {
    LeetcodeData data = leetcodeService.getStats(username);
    return data;
  }
}
