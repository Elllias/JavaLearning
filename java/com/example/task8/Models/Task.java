package com.example.task8.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Task {

    @Id
    private Long Id;

    private String task;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private BusinessList BList;
}
