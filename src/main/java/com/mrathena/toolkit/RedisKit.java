package com.mrathena.toolkit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author mrathena on 2019/9/26 10:54
 */
@Component
public class RedisKit {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;



}
