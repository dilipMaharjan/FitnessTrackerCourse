/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dmaharjan
 */
@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
