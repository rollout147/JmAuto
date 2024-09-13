package com.oracle.jmAuto.dao.main;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MainDao {
	private final SqlSession session;
	
	public int selectUser() {
		System.out.println("MainDao selectUser Start...");
		
		int result2 = 0;
		result2 = session.selectOne("selectUser");
		System.out.println("MainDao selectUser result2->"+result2);
		
		return result2;
	}
}
