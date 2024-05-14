package com.likelion12.workout.repository;

import com.likelion12.workout.model.Workout;
import com.likelion12.workout.service.WorkoutService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}
