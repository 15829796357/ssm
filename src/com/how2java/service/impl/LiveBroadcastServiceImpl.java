package com.how2java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.LiveBroadcastMapper;
import com.how2java.pojo.LiveBroadcastPojo;
import com.how2java.service.LiveBroadcastService;

@Service
public class LiveBroadcastServiceImpl implements LiveBroadcastService{

	@Autowired
	LiveBroadcastMapper liveBroadcastMapper;
	
	public LiveBroadcastPojo get(int lb_id) {
		return liveBroadcastMapper.get(lb_id);
	}

}
