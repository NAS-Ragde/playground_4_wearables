package com.example.wearables_demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/health")
class WearablesController(private val service: WearablesService) {

    @PostMapping
    fun receive(@RequestBody data: DataModelWearable): ResponseEntity<String> {
        service.save(data)
        return ResponseEntity.ok("Data received successfully")
    }

    @GetMapping
    fun getAll() = service.getAll()

    @GetMapping("/{type}")
    fun getDataByType(@PathVariable type: String) = service.getByType(type)

    // optional: only to test endpoint
    @GetMapping("/hello")
    fun hello(): String = "Hello from Wearables Demo Controller :D!"
}
