/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.repository.impl;

import com.pluralsight.model.Exercise;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.pluralsight.repository.ExerciseRepository;

/**
 *
 * @author dmaharjan
 */
@Repository
public class ExerciseRepositoryImpl implements ExerciseRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Exercise save(Exercise exercise) {
        entityManager.persist(exercise);
        entityManager.flush();
        return exercise;
    }

}
