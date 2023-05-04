package br.com.ychat.messeger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ychat/api")
public class ychatController {

    @GetMapping("/")
    public String runnigApp(){
        return "Hello Ychat!!";
    }
}
