package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

//    요즘 방식
    @GetMapping(path = "/hello")
    public String getHello(){
        return "get hello~";
    }

//    옛날 방식, GET, POST, PUT, DELETE 모두 가능
    @RequestMapping(path="hi", method = RequestMethod.GET) // GET 지정
    public String hi(){
        return "hi~";
    }

//    http://localhost:9090/api/get/path-variable/name/{name}
    @GetMapping("path-variable/name/{name}") // 변수를 파라미터로 넘겨주는 방식
    public String  pathVariable(@PathVariable String name){ //위의 URL이랑 똑같이 맞쳐줘야 한다.

        System.out.println("path-variable : "+name);
        return name;
    }

    @GetMapping("path-variable/un-name/{un-name}") // 변수를 파라미터로 넘겨주는 방식
    public String  pathVariableUnName(@PathVariable(name = "un-name") String pathName){ //변수 이름 다르게 써야할 때

        System.out.println("path-variable-un-name : "+pathName);
        return pathName;
    }

//    http://localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com@age=30
    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String,String> queryParam){

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+ " = "+ entry.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name + " "+ email + " " + age;
    }


}
