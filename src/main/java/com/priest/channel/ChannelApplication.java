package com.priest.channel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableConfigurationProperties
@EnableTransactionManagement
@ComponentScan(basePackages = { 
	"com.priest.channel.service",
	"com.priest.channel.controller" 
})
@EntityScan(basePackages = { "com.priest.channel.entity" })
@EnableJpaRepositories(basePackages = { "com.priest.channel.repository" })
@EnableDiscoveryClient
public class ChannelApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChannelApplication.class, args);
	}
}
