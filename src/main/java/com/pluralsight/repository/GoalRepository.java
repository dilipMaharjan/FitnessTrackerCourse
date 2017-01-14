/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("goalRepository")
public interface GoalRepository extends JpaRepository<Goal, Long> {

    @Query("SELECT new com.pluralsight.model.GoalReport(g.minutes,e.minutes,e.activity)"
            + "FROM Goal g,Exercise e where g.id=e.goal.id")
    List<GoalReport> findAllGoalReports();
}
