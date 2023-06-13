package com.mikavee.Todoproject.services;

import com.mikavee.Todoproject.models.TodoItem;
import com.mikavee.Todoproject.repositories.TodoItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class TodoItemService {

    @Autowired
    private TodoItemRepo todoItemRepo;


    // READ
    public Iterable<TodoItem> getall(){

        return todoItemRepo.findAll();
    }


    public Optional<TodoItem> getByid(Long id){

        return todoItemRepo.findById(id);
    }

    //CREATE or UPDATE
    public TodoItem save(TodoItem saveableTodoItem){
        // if we are creating NOW todoitem
        if(saveableTodoItem.getId() == null){
            saveableTodoItem.setCreatedAt(Instant.now());
        }
        // else we update the setUpdateAT
        saveableTodoItem.setUpdatedAt(Instant.now());
        return todoItemRepo.save(saveableTodoItem);
    }

    // DELETE
    public void delete(TodoItem deletableItem){
        todoItemRepo.delete(deletableItem);
    }
}
