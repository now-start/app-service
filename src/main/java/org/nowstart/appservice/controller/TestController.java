package org.nowstart.appservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Thread.sleep;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(HttpServletRequest request) throws InterruptedException {
        return request.getLocalAddr() + ":" + request.getServerPort();
    }
}
