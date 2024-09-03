package com.javaex.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AttachService {

	public void upload(MultipartFile file) {
		System.out.println("AttachService.upload");
		System.out.println(file.getOriginalFilename());
	
		//사진에 기본정보로 우리가 관리할 정보를 뽑아내야한다
		//사진을 서버에 복사해야한다
		//오리지날 파일명
		String orgName =file.getOriginalFilename();
		System.out.println("orgName: "+ orgName);
		
		//확장자
		String exeName=orgName.substring(orgName.lastIndexOf("."));
		
		System.out.println(exeName); 
		
		//파일 사이즈
		long FileSize=file.getSize();
		System.out.println(FileSize);
		
		//사진을 서버(강남)에 하드디스크에 복사해야한다
	}
}
