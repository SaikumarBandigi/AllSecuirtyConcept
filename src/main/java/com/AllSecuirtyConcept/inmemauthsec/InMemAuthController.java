package com.AllSecuirtyConcept.inmemauthsec;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inmem")
public class InMemAuthController {

    @GetMapping("/getEmployees")
    public String getEmployees() {
        return "Employees....";
    }


}
