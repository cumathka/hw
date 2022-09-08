package com.todolist.demo.controller;

import com.sun.istack.NotNull;
import com.todolist.demo.model.TodoItem;
import com.todolist.demo.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoRepo todoRepo;
    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@Valid @NotNull @RequestBody TodoItem todoItem){
       return todoRepo.save(todoItem);
    }

    @PutMapping
    public TodoItem update(@Valid @NotNull @RequestBody TodoItem todoItem){
       return  todoRepo.save(todoItem);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }
}
