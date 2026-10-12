package com.youngkim.portfolio.presentation.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class PresentationViewController {

    @GetMapping("/test")
    fun test(): String{
        return "test" //test 의 view 파일찾아서 리턴
    }
}