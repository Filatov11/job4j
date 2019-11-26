package ru.job4j.tracker;

import java.util.Date;

public class CodeProject {
    String project;
    Date startProject;
    Date finishProject;
    public  CodeProject(String project, Date startProject, Date finishProject) {
        this.project = project;
        this.finishProject = finishProject;
        this.startProject = startProject;
    }

}
