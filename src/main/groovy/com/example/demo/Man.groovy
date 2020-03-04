package com.example.demo

import lombok.Data

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

/**
 * ClassName: Man
 * Description: DOTO
 * date: 2020/3/2 10:11
 * @author shiyawei* @version 1.0
 */

class Man {
    @NotNull(message = "用户名不能为空")
    Long id
    String name
    @NotBlank(message = "手机号码不能为空")
    String phone;
    Man() {

    }

    Man(Long id, String name, String phone) {
        this.id = id
        this.name = name
        this.phone = phone
    }
}
