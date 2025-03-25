package com.DhruvTheDev1.Leetcode_API;

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

  public int getEasy() {
    return easy;
  }

  public void setEasy(int easy) {
    this.easy = easy;
  }

  public int getMedium() {
    return medium;
  }

  public void setMedium(int medium) {
    this.medium = medium;
  }

  public int getHard() {
    return hard;
  }

  public void setHard(int hard) {
    this.hard = hard;
  }

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
