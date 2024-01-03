package com.AllSecuirtyConcept.defaultsec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/default")
public class DefaultController {


    @GetMapping("/getHello")
    public String getString() {
        return "HelloWorld";
    }

}

