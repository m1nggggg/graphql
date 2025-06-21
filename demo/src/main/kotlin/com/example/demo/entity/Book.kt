package com.example.demo.entity

import jakarta.persistence.*

@Entity
data class Book(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String,
    val author: String
)
