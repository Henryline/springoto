package com.imooc.o20.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.o20.dao.AreaDao;
import com.imooc.o20.entity.Area;
import com.imooc.o20.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{
	
	@Autowired
	private AreaDao areaDao;

	@Override
	public List<Area> getAreaList() {
		return areaDao.queryArea();
	}
	
}
