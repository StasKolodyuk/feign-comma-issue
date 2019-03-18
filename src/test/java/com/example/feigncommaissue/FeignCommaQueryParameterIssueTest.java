package com.example.feigncommaissue;

import com.example.feigncommaissue.client.PostmanEchoClient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FeignCommaQueryParameterIssueTest {

    @Autowired
    PostmanEchoClient postmanEchoClient;

    @Test
    public void test() {
        // Request genereated: https://postman-echo.com/get?param=first&param=second
        postmanEchoClient.echo("first,second");
    }
}
