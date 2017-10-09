package com.velware.echo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoController {

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Echo> echo(@RequestParam(name = "content") String content){
        return new ResponseEntity<Echo>(new Echo(content), HttpStatus.OK);
    }

}
