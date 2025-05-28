package com.example.project.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {

	public static final String ROOT = "C:\\works\\files\\";
	
	public static String saveFile(MultipartFile file) {
		String originFileName = file.getOriginalFilename();
		int idx = originFileName.lastIndexOf(".");
		String extName = originFileName.substring(idx); //확장자명 가져오기 ex).jpg
		String fileName = UUID.randomUUID().toString() + extName; //중복이 거-의 안나는 아이디 생성
		File targetFile = new File(ROOT + fileName);
		try {
			file.transferTo(targetFile);
			return fileName;
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
