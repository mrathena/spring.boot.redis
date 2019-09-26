package com.mrathena;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author mrathena on 2019/8/2 16:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisTest {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	public void test() {
		redisTemplate.opsForValue().set("key", "我是你爸爸");
		System.out.println(redisTemplate.opsForValue().get("key"));
	}

}
