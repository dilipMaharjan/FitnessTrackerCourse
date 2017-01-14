/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.service.impl;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;
import com.pluralsight.service.GoalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dmaharjan
 */
@Service("goalService")
public class GoalServiceImpl implements GoalService{

    @Autowired
    GoalRepository goalRepository;

    @Transactional
    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }

    public List<Goal> findAll() {
        return goalRepository.findAll();
    }

    public List<GoalReport> findAllGoalReports() {
        return goalRepository.findAllGoalReports();
    }

}
