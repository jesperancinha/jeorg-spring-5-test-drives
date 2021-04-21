package org.jesperancinha.std.flash20.cors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flash20Controller {

    @GetMapping("/cors")
    @CrossOrigin(origins = "http://jeorg-spring-flash-20:8081")
    public String sentence() {
        return "When accessing from jeorg-spring-flash-20, there should be no blocking to visualization";
    }

    @GetMapping("/always")
    public String sentenceAlways() {
        return "This should be blocked from the opposite url.";
    }

    @GetMapping("/protected")
    public String sentenceProtected() {
        return "When accessing from jeorg-spring-flash-20, there should be no blocking to visualization";
    }


}