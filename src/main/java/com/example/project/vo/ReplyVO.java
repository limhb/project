package com.example.project.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReplyVO {
	private int bcNum;
  private int biNum;
  private int uiNum;
  private String bcContent;
  private String credat;
  private String cretim;
  private String lmodat;
  private String lmotim;

  // 작성자 닉네임
  private String uiNickName;
}
