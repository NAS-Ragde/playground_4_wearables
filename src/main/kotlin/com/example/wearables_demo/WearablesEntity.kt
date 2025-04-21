package com.example.wearables_demo

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "wearable_data")
data class WearablesEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val type: String,
    val dataValue: Double,
    val timestamp: LocalDateTime
)