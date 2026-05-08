package net.littlebigcomeback.server.handlers;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @PostMapping("*")
    @DeleteMapping("*")
    @PatchMapping("*")
    @GetMapping("*")
    public String printReq(RequestEntity<String> req) {
        //we should switch to log4j at some point
        System.out.println("Got a "+ req.getMethod() +" request: " + req.getUrl());
        return "test";
    }
}
