package com.oracle.jmAuto.dao.main;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CsDaoImpl implements CsDao {
	private final SqlSession session;
	
	@Override
	public int CsFaqList() {
		int result = 0;
		System.out.println("CsDaoImpl CsFaqList start...");
		
		result = session.selectOne("faq");
		System.out.println("CsDaoImpl CsFaqList result->"+result);
		
		return result;
	}

}
