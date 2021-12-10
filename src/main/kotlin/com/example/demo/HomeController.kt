package com.example.demo

import com.mongodb.WriteConcern
import org.litote.kmongo.getCollection
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController
import java.time.Clock
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

@Controller
class HomeController() {
    @GetMapping("/")
    fun getHelloString(
        @RequestHeader(value = "User-Agent") userAgent: String,
        model: Model
    ): String {
        return "index"
    }
}