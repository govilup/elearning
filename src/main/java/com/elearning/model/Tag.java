package com.elearning.model;

import lombok.Builder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Entity
@Table(name = "TAG")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String tagName;
    private LocalDateTime createdDateTime;

    @ManyToOne
    @JoinColumn(name = "id")
    private Instructor instructor;
}
