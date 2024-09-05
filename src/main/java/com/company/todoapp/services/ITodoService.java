package com.company.todoapp.services;

import com.company.todoapp.models.Todo;

import java.util.List;

public interface ITodoService {


  List<Todo> getAllTodos();

  Todo getById(int id);

  List<Todo> getByTitle(String title);

  Todo addTodo(Todo todo);

  Todo updateTodo(int id, Todo todo);

  Todo deleteTodo(int id);

}
