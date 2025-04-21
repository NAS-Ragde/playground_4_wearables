package com.example.wearables_demo

import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.LocalDateTime

data class DataModelWearable(
    @Id @GeneratedValue val id: Long = 0,
    val type: String,
    val value: Double,
    val timestamp: LocalDateTime
)

