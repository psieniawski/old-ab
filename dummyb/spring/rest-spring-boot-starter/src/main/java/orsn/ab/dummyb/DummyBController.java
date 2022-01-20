package orsn.ab.dummyb;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${dummyb.rest.base:}")
@RequiredArgsConstructor
public class DummyBController {
    private final DummyB service;

    @GetMapping("/getB")
    public String getB() {
        return service.getB();
    }

}
