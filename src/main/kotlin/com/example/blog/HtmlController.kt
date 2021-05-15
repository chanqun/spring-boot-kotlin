package com.example.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class HtmlController {
    @GetMapping
    fun controllerName(model: Model): String {

        return "view"
    }

    @PostMapping("/")
    fun (model: Model): String {

        return "view"
    }
}