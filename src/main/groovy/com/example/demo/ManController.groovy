package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import javax.validation.Valid

/**
 * ClassName: ManController
 * Description: DOTO
 * date: 2020/3/2 10:12
 * @author shiyawei* @version 1.0
 */
@RestController
class ManController {
    @Autowired
    private ManService manService;

    @GetMapping("/ok")
    String home() {
        Man man = manService.getInfoByName("tom")
        return "<h1>hello " + man.name + "</h1>"
    }

    @PostMapping("/okPost")
    String home(@Valid  @RequestBody Man man, BindingResult bindingResult) {
        //若不符合约束
        if (bindingResult.hasErrors()){
            //获取不符合约束时，自定义的异常信息
            throw new Exception(bindingResult.getFieldError().getDefaultMessage());
        }

        return "<h1>hello " + man.name + "</h1>"
    }
}