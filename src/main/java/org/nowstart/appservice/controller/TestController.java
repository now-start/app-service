package org.nowstart.appservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(HttpServletRequest request) {
        return request.getLocalAddr() + ":" + request.getServerPort();
    }
}
