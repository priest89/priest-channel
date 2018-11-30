package com.priest.channel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priest.channel.dto.ChannelDto;
import com.priest.channel.service.ChannelService;

@RestController
@RequestMapping("/channels")
public class ChannelController {
	@Autowired
	private ChannelService channelService;

	@GetMapping("/{channelId}")
	public ChannelDto getChannel(Long channelId) {
		return channelService.getChannel(channelId);
	}
}
