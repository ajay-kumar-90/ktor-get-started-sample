package com.example

import kotlinx.serialization.Serializable
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

@Serializable
class TimeInfo {
    private var formatted: String
    private var epoch: Long

    constructor() {
        val dateTime = LocalDateTime.now()
        this.formatted = dateTime.format(DateTimeFormatter.ISO_DATE_TIME)
        this.epoch = dateTime.toEpochSecond(ZoneOffset.UTC)
    }


}