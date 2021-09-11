package com.example.demolms;

// MainPage 클래스 만든 목적
// 매핑하기 위해서
// 주소와 (논리적 주소, 인터넷 주소) 물리적 파일(프로그래밍을 위한) 매핑

// 하나의 주소에 대해서
// 어디서 매핑? 누가 매핑?
// 후보군? 1. 클래스 2. 속성 3. 메소드

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MainPage {

    @RequestMapping("/")
    public String index() {
        return "Index Page";
    }

    // 스프링 -> MVC (View -> 템플릿 엔진 화면에 내용 출력(html))
    // .NET -> MVC (View -> 출력)
    // python django -> MTV (Template -> 화면 출력)
    // 백엔드 과정 -> V(화면에 보여진 부분) -> 프론트엔드 과정
    // V -> HTML -> 웹페이지가
    // V -> json -> API

    // request -> WEB -> SERVER
    // response -> SERVER -> WEB
    @RequestMapping("/hello")
    public void hello(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = res.getWriter();

        String msg = "<html>" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "</head>" +
                "<body>" +
                "<p>hello</p>" +
                "<p>demolms website!!!</p>" +
                "<p> 안녕하세요 ====> </p>" +
                "</body>" +
                "</html>";

        printWriter.write(msg);
        printWriter.close();
    }
}
