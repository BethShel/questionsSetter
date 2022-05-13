package com.example.mvc_demo.repos;

import com.example.mvc_demo.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<Task, Integer> {

}
