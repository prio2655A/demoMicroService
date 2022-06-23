package com.MicroService.demoMicroService.Bean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/name")
    public NameSender displayName()
    {
        return  new NameSender("Priobrata","Malik");
    }

}
