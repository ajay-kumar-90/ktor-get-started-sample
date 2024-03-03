package com.example.plugins

import com.example.TimeInfo
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/timeInfo"){
            call.respond(TimeInfo())

        }
    }
}
