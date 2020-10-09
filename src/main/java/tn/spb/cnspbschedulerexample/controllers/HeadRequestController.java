package tn.spb.cnspbschedulerexample.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HeadRequestController {

    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getHeaderInfo(){
        log.info("Inside controller...");
        return "Header info";
    }
}
