package com.demo.api.Controller;

import com.demo.api.Utils.response.sequenceResponse;
import com.demo.api.method.SequenceMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sequence")
public class Controller {

    @GetMapping(value = "/collatz/{input}")
    public ResponseEntity<sequenceResponse> sequenceCollatz(@PathVariable int input){
        SequenceMethod collatz = new SequenceMethod();
        String collatzSequence = collatz.sequenceCollatz(input);
        sequenceResponse response = new sequenceResponse(input, collatzSequence);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/fizzbuzz")
    public ResponseEntity<sequenceResponse> sequenceFizzBuzz(@RequestParam(value = "input") Integer input){
        SequenceMethod fizzBuzz = new SequenceMethod();
        var fizzBuzzSequence = fizzBuzz.sequenceFizzBuzz(input);
        var response = new sequenceResponse(input, fizzBuzzSequence);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
