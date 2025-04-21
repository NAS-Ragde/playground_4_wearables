package com.example.wearables_demo

import org.springframework.stereotype.Service

@Service
open class WearablesService(private val repo: WearablesRepository) {

    open fun save(data: DataModelWearable): WearablesEntity {
        val entity = WearablesEntity(
            type = data.type,
            dataValue =  data.value,
            timestamp = data.timestamp,
        )
        return repo.save(entity)
    }

    open fun getAll(): List<WearablesEntity> = repo.findAll()

    open fun getByType(type: String): List<WearablesEntity> = repo.findByType(type)
}