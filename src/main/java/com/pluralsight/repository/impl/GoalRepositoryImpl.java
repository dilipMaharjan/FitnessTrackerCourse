/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.repository.impl;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dmaharjan
 */
@Repository
public class GoalRepositoryImpl implements GoalRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Goal save(Goal goal) {
        entityManager.persist(goal);
        entityManager.flush();
        return goal;
    }

    public List<Goal> loadAll() {
        // Query query = entityManager.createQuery("SELECT g FROM Goal g");
        TypedQuery<Goal> query = entityManager.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);
        return query.getResultList();
    }

    public List<GoalReport> findAllGoalReports() {
//        Query query = entityManager.createQuery("SELECT new com.pluralsight.model.GoalReport(g.minutes,e.minutes,e.activity) "
//                + "FROM Goal g, Exercise e where g.id = e.goal.id");
        TypedQuery<GoalReport> query = entityManager.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);
        return query.getResultList();
    }

}
