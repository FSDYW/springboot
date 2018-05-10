package com.viyoung.springboot.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30) //设置session失效时间,此处设置的session失效时间为30天.
public class SessionConfig {
}