package cc.example.rookie.controller.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("test")
class TestController{

    @GetMapping("index")
    fun index() : String{
        return "rookie-example project start."
    }
}

