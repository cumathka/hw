package com.todolist.demo.repo;

import com.todolist.demo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepo  extends JpaRepository<TodoItem,Long>{

}
