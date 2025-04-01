package com.DhruvTheDev1.Leetcode_API;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/leetcode")
public class LeetcodeController {

  private final LeetcodeService leetcodeService;

  public LeetcodeController(LeetcodeService leetcodeService) {
    this.leetcodeService = leetcodeService;
  }

  @GetMapping("/stats")
  public String form() {
    return "form";
  }

  @PostMapping("/stats")
  public String getLeetcodeStats(@RequestParam String username, Model model) {
    LeetcodeData data = leetcodeService.getStats(username);
    model.addAttribute("data", data);
    model.addAttribute("username", username);
    return "form";
  }
}
