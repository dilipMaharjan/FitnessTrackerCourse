package com.pluralsight.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.model.Goal;
import com.pluralsight.service.ExerciseService;
import com.pluralsight.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.pluralsight.repository.ExerciseRepository;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    ExerciseRepository excerciseRepository;

    public List<Activity> findAllActivities() {

        List<Activity> activities = new ArrayList<Activity>();

        Activity run = new Activity();
        run.setDesc("Run");
        activities.add(run);

        Activity bike = new Activity();
        bike.setDesc("Bike");
        activities.add(bike);

        Activity swim = new Activity();
        swim.setDesc("Swim");
        activities.add(swim);

        return activities;
    }

    @Transactional
    public Exercise save(Exercise exercise) {
        return excerciseRepository.save(exercise);
    }

}
