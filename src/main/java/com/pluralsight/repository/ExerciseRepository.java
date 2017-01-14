/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.repository;

import com.pluralsight.model.Exercise;

/**
 *
 * @author dmaharjan
 */
public interface ExerciseRepository {

    Exercise save(Exercise exercise);
}
