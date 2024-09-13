package com.oracle.jmAuto.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class Car_General_Info {
	private long 	sell_num; 			// 매물번호
	private int 	car_type;			// 차종
	private String 	brand;				// 제조사
	private String 	model;				// 모델
	private String 	car_num;			// 차량번호
	private String 	manu_date;			// 제조일
	private String 	mileage;			// 주행거리
	private String 	color;				// 색상
	private String 	fuel;				// 연료
	private String 	transmission; 		// 변속기
	private String 	accident;			// 사고유무
	private String 	repossession;		// 압류유무
	private long 	price;				// 가격
	private String 	sell_regi;			// 자동차등록증경로
	private String 	sell_certi_tax;		// 자동차세완납증명서경로
	private String 	sell_shinbun;		// 신분증사본경로
	private String 	user_id;			// 판매자아이디
	private int 	sale;				// 판매여부
	private Date 	reg_date;			// 등록일자
	private int 	del_state; 			// 삭제여부
}