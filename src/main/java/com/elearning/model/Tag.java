package com.elearning.model;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Builder
@Entity
@Table(name = "TAG")
public class Tag {

    private int id;
    private String tagName;
    private LocalDateTime createdDateTime;

    @ManyToOne
    @JoinColumn(name = "id")
    private Instructor instructor;
}
