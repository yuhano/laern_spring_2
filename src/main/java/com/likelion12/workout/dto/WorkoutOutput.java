package com.likelion12.workout.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class WorkoutOutput {
    public Long id;
    public String exerciseName;
    public String duration;
    public LocalDateTime date;
    public String content;

    public WorkoutOutput(Long id, String exerciseName, String duration, LocalDateTime date, String content) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.duration = duration;
        this.date = date;
        this.content = content;
    }
}

