package com.sampson.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount,"flavio","Learn AWS", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todosCount,"flavio","Learn Devops", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todosCount,"flavio","Learn Kafka", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todosCount,"flavio","Learn Jenkins", LocalDate.now().plusYears(1),false));
    }

    public List<Todo> findByUsername(String username){
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public Todo addTodo(String username, String description, LocalDate targetDate, boolean done){
        Todo todo = new Todo(++todosCount,username,description,targetDate,done);
        todos.add(todo);
        return todo;
    }

    public void deleteById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public void updateTodo(Todo todo){
        deleteById(todo.getId());
        todos.add(todo);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }


}
