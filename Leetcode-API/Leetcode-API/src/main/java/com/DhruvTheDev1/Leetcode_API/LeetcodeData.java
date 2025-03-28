package com.DhruvTheDev1.Leetcode_API;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeetcodeData {
  private int easy;
  private int medium;
  private int hard;
  private int total;

  // testing
  public LeetcodeData(int easy, int medium, int hard, int total) {
    this.easy = easy;
    this.medium = medium;
    this.hard = hard;
    this.total = total;
  }

  @JsonProperty("Easy")  
  public int getEasy() {
    return easy;
  }

  public void setEasy(int easy) {
    this.easy = easy;
  }

  @JsonProperty("Medium")  
  public int getMedium() {
    return medium;
  }

  public void setMedium(int medium) {
    this.medium = medium;
  }
  
  @JsonProperty("Hard")  
  public int getHard() {
    return hard;
  }

  public void setHard(int hard) {
    this.hard = hard;
  }

  @JsonProperty("Total")  
  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "Easy: " + this.easy + " Medium: " + this.medium + " Hard: " + this.hard + " Total: " + this.total;
  }
}
