package com.priest.channel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priest.channel.dto.ChannelDto;
import com.priest.channel.repository.ChannelRepository;

@Service
public class ChannelService {
	@Autowired
	private ChannelRepository channelRepository;

	public ChannelDto getChannel(Long channelId) {
		return new ChannelDto("HBO", 1l);
	}
}
