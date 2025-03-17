package com.app.todoapp.repository;

import com.app.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}


// what JpaRepository does is give us already defined methods of CRUD, and we can implement it to our use case in TaskRepository
// with <Task, Long>. First param being the entity on which the operations are performed and second being the associated primary key