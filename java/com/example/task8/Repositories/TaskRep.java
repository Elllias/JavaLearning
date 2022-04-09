package com.example.task8.Repositories;

import com.example.task8.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRep extends JpaRepository<Task, Long> {
}
