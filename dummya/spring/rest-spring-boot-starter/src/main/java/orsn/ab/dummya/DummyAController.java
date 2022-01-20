package orsn.ab.dummya;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${dummya.rest.base:}")
@RequiredArgsConstructor
public class DummyAController {

    private final DummyA service;

    @GetMapping("/getA")
    public String getA() {
        return service.getA();
    }

}
