package com.mikavee.Todoproject.repositories;

import com.mikavee.Todoproject.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TodoItemRepo extends JpaRepository<TodoItem, Long> {
}

