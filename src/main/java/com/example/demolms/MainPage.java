package com.example.demolms;

// MainPage 클래스 만든 목적
// 매핑하기 위해서
// 주소와 (논리적 주소, 인터넷 주소) 물리적 파일(프로그래밍을 위한) 매핑

// 하나의 주소에 대해서
// 어디서 매핑? 누가 매핑?
// 후보군? 1. 클래스 2. 속성 3. 메소드

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    @RequestMapping("/")
    public String index(){
        return "Index Page";
    }
    @RequestMapping
    public String hello(){
        String msg = "<p>hello</p> <p>demolms website!!!</p>";
        return "hello";
    }
}
