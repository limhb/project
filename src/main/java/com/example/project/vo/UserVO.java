package com.example.project.vo;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {
	private int uiNum;
	@NotBlank(message = "아이디는 필수입니다.")
	@Size(min=4, max=30, message="아이디는 4글자 이상 30글자 이하 입니다.")
	private String uiId;
	@NotBlank(message = "비밀번호는 필수입니다.")//null 체크
	@Size(min=8, max=30, message="비밀번호는 8글자 이상 30글자 이하 입니다.")
	private String uiPwd;
	@NotEmpty(message = "이름은 필수입니다.")//null , 빈문자열 체크
	@NotBlank//null, 빈문자열, space공백
	private String uiName;
	private String uiNickName;
	private String uiTrans;
	private String uiEmail;
	private int uiPoint;
	private String uiGrade;
	private String uiImgName;
	private MultipartFile uiImg;
	private String uiImgPath;
	@NotBlank(message="우편번호는 필수입니다.")
	private String uiZip;
	@NotBlank(message="주소는 필수입니다.")
	private String uiAddr1;
	private String uiAddr2;
	@NotBlank
	@Pattern(regexp = "^\\d{3}\\d{4}\\d{4}$", message = "올바른 전화번호 형식이 아닙니다.")
	private String uiPhone;
	private String uiDesc;
	private String credat;
	private String cretim;
	private String lmodat;
	private String lmotim;
	private String token;
}
