package com.goel.projectboard.service;

import com.goel.projectboard.domain.ProjectTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.goel.projectboard.repository.ProjectTaskRepository;

import java.util.List;

@Service
public class ProjectTaskService {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask) {
        if (projectTask.getStatus() == null || "".equals(projectTask.getStatus())) {
            projectTask.setStatus("TO_DO");
        }
        return projectTaskRepository.save(projectTask);
    }

    public Iterable<ProjectTask> findAllProjectTasks() {
        return projectTaskRepository.findAll();
    }
}
