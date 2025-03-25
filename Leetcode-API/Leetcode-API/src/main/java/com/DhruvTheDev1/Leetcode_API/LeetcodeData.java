package com.DhruvTheDev1.Leetcode_API;

public class LeetcodeData {
  private Integer easy;
  private Integer medium;
  private Integer hard;
  private Integer total;

  public LeetcodeData() {

  }

  public Integer getEasy() {
    return easy;
  }

  public void setEasy(Integer easy) {
    this.easy = easy;
  }

  public Integer getMedium() {
    return medium;
  }

  public void setMedium(Integer medium) {
    this.medium = medium;
  }

  public Integer getHard() {
    return hard;
  }

  public void setHard(Integer hard) {
    this.hard = hard;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "Easy: " + this.easy + " Medium: " + this.medium + " Hard: " + this.hard + " Total: " + this.total;
  }
}
