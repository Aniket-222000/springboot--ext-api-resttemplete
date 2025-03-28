package com.ust.Springboot_docker_app.service;




import com.ust.Springboot_docker_app.model.Todo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {
    private final RestTemplate restTemplate;

    public TodoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Todo> getTodos() {
        String url = "https://jsonplaceholder.typicode.com/todos";
        Todo[] todos = restTemplate.getForObject(url, Todo[].class);
        return Arrays.asList(todos);
    }

    public Todo getTodoById(int id) {
        String url = "https://jsonplaceholder.typicode.com/todos/" + id;
        return restTemplate.getForObject(url, Todo.class);
    }
}

