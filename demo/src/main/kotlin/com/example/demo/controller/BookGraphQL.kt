package com.example.demo.controller

import com.example.demo.entity.Book
import com.example.demo.repository.BookRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class BookGraphQL(private val bookRepository: BookRepository) {

    @QueryMapping
    fun books(): List<Book> = bookRepository.findAll()

    @MutationMapping
    fun createBook(@Argument title: String, @Argument author: String): Book {
        return bookRepository.save(Book(title = title, author = author))
    }
}