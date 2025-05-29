package com.example.project.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {
  private int biNum;
  private int uiNum;
  private String biTitle;
  private String biContent;
  private int biViewCnt;
  private String credat;
  private String cretim;
  private String lmodat;
  private String lmotim;
  private int commentCount;

  // 사용자 닉네임 포함 (조인용)
  private String uiNickName;
}
