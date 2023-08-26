package laveberry.typeconverter.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        //모든 데이터 String으로 넘어옴
        String data = request.getParameter("data");
        //다른타입으로 변환과정 거쳐야함
        Integer intValue = Integer.valueOf(data);
        System.out.println("intValue = " + intValue);
        return "ok";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data) {
        // 스프링이 String을 중간에서 타입변환 해줌
        System.out.println("data = " + data);
        return "ok";
    }

}
