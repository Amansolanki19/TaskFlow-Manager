package com.example.todoList.repository;

import com.example.todoList.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {


    List<Task> findByCompletedTrue();
    List<Task> findByCompletedFalse();

    List<Task> findByTaskContaining(String task);
}
