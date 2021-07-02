package com.shenhua.server.spring.demo.controller

import com.shenhua.server.spring.demo.ApiResponse
import com.shenhua.server.spring.demo.entry.User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class IndexController {

    @RequestMapping(value = ["/"], method = [RequestMethod.GET])
    @ResponseBody
    fun index(): ApiResponse<User> {
        val user = User("Spring", 10, false)
        return ApiResponse.success(user)
    }
}