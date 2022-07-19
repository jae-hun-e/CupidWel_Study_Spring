package com.example.put.controller;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutController {

    @PutMapping("/put/{user-id}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable("user-id") String id){
        System.out.println(id);

        return requestDto;



    }
}
