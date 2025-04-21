package com.example.wearables_demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WearablesRepository : JpaRepository<WearablesEntity, Long> {
    fun findByType(type: String): List<WearablesEntity>
}