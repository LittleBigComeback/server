package net.littlebigcomeback.server.handlers;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("*")
    public String printReqGet(RequestEntity<String> req) {
        //we should switch to log4j at some point
        System.out.println("Got a "+ req.getMethod() +" request: " + req.getUrl() + " : " + req.getBody() + " : \n\n" + req.getHeaders() + "\n");
        return "test";
    }

    @PutMapping("*")
    public String printReqPut(RequestEntity<String> req) {
        //we should switch to log4j at some point
        System.out.println("Got a "+ req.getMethod() +" request: " + req.getUrl() + " : " + req.getBody() + " : \n\n" + req.getHeaders() + "\n");
        return "test";
    }

    @PostMapping("*")
    public String printReqPost(RequestEntity<String> req) {
        //we should switch to log4j at some point
        System.out.println("Got a "+ req.getMethod() +" request: " + req.getUrl() + " : " + req.getBody() + " : \n\n" + req.getHeaders() + "\n");
        return "test";
    }

    @PatchMapping("*")
    public String printReqPatch(RequestEntity<String> req) {
        //we should switch to log4j at some point
        System.out.println("Got a "+ req.getMethod() +" request: " + req.getUrl() + " : " + req.getBody() + " : \n\n" + req.getHeaders() + "\n");
        return "test";
    }

    @DeleteMapping("*")
    public String printReqDelete(RequestEntity<String> req) {
        //we should switch to log4j at some point
        System.out.println("Got a "+ req.getMethod() +" request: " + req.getUrl() + " : " + req.getBody() + " : \n\n" + req.getHeaders() + "\n");
        return "test";
    }
}
