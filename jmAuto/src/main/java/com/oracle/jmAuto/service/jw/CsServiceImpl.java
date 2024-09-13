package com.oracle.jmAuto.service.jw;

import org.springframework.stereotype.Service;

import com.oracle.jmAuto.dao.main.CsDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CsServiceImpl implements CsService {
	private final CsDao cd;
	
	@Override
	public int FaqPage() {
		System.out.println("CsServiceImpl FaqPage start...");
		
		int FaqList  = cd.CsFaqList();
		System.out.println("CsServiceImpl FaqPage totalCsCnt->"+FaqList);
		
		return FaqList;
	}

}
