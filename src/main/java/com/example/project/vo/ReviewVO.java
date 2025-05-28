package com.example.project.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReviewVO {
	private Integer rvNum;
	private Integer rsNum;
	private Integer uiNum;
	private String rvContent;
	private Integer rvStar;
	private Integer rvLike;
	private String rvImgName;
	private String rvImgPath;
	private String credat;
	private String cretim;
	private String lmodat;
	private String lmotim;
	private String uiNickName; // 사용자 닉네임 조회용
	private String rsName;     // 식당 이름 조회용

}
