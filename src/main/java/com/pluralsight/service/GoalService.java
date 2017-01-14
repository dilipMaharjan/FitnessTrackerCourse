/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import java.util.List;

/**
 *
 * @author dmaharjan
 */
public interface GoalService {

    Goal save(Goal goal);

    public List<Goal> findAll();

    public List<GoalReport> findAllGoalReports();
}
