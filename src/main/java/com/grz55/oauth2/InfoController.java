package com.grz55.oauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InfoController {

    @GetMapping("/public")
    public String getPublicInfo(){
        return "public info";
    }

    @GetMapping("/secret")
    public String getSecretInfo(){
        return "secret info after oauth2 sign in";
    }

}
