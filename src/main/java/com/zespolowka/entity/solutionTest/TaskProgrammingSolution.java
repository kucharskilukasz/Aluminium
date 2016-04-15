package com.zespolowka.entity.solutionTest;


import com.zespolowka.entity.createTest.Task;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TaskProgrammingSolution extends TaskSolution {
    @Column(length = 10000)
    private String answerCode;

    public TaskProgrammingSolution() {
    }

    public TaskProgrammingSolution(Task task) {
        super(task);
        this.answerCode = "";
    }

    public TaskProgrammingSolution(Task task, String answerCode) {
        super(task);
        this.answerCode = answerCode;
    }

    public String getAnswerCode() {
        return answerCode;
    }

    public void setAnswerCode(String answerCode) {
        this.answerCode = answerCode;
    }

    @Override
    public String toString() {
        return "TaskProgrammingSolution{" +
                "TaskSolution='" + super.toString() + '\'' +
                "answerCode='" + answerCode + '\'' +
                '}';
    }
}
