package com.DhruvTheDev1.Leetcode_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LeetcodeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeetcodeApiApplication.class, args);
	}

	@GetMapping("/Leetcode")
    public String leetcode() {
      return "Hello";
    }

}
