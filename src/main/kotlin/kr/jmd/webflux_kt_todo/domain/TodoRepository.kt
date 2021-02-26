package kr.jmd.webflux_kt_todo.domain

import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository: JpaRepository<Todo, Long>