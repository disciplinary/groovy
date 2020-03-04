package com.example.demo

import org.springframework.stereotype.Service

/**
 * ClassName: ManService
 * Description: DOTO
 * date: 2020/3/2 10:12
 * @author shiyawei* @version 1.0
 */
@Service("manService")
class ManService {
    Man getInfoByName(String name) {
        return new Man(100,name,"10000")
    }
}