package com.jitu.DockerSpringTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JituController {

    @RequestMapping("/")
    public String show(){
        return "Web to Jitu's Docker Packing";
    }
}
