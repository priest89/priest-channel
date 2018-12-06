package com.priest.channel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.priest.channel.dto.ChannelDto;
import com.priest.channel.repository.ChannelRepository;

@Service
public class ChannelService {
	private Logger LOGGER = LoggerFactory.getLogger(ChannelService.class);
	@Autowired
	private ChannelRepository channelRepository;

	public ChannelDto getChannel() {
		LOGGER.info("Calling channel service");
		return new ChannelDto("HBO", 1l);
	}
	
	@HystrixCommand(fallbackMethod="getChannel")
	public ChannelDto getChannelException(Long channelId) {
		LOGGER.error("throw error when get channel");
		throw new RuntimeException("channel exception");
	}
}
