package com.yxm.sso.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yexinming
 * @date 2020/3/9
 **/
@SpringBootApplication
@RestController
@EnableOAuth2Sso //应用端SSO登录需要添加此注解
public class SsoClientApplication {

    @GetMapping("/user")
    public Object user(Authentication user){
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(SsoClientApplication.class,args);
    }
}
