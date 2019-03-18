package com.example.feigncommaissue.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "postman", url = "https://postman-echo.com")
public interface PostmanEchoClient {

    @GetMapping("/get")
    void echo(@RequestParam String param);

}
