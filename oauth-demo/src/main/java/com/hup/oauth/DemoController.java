package com.hup.oauth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hupeng on 2018/11/8
 * @version 1.0
 * @Description
 */
@RestController
@RequestMapping("/api/test")
@Slf4j
public class DemoController {

    @GetMapping("/user1")
    public Authentication getUser(Authentication authentication) {
        log.info("resource: user {}", authentication);
        return authentication;
    }
}
