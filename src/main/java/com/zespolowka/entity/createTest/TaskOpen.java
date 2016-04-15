package com.zespolowka.entity.createTest;

import javax.persistence.Entity;

@Entity
public class TaskOpen extends Task {
    private String answer;

    private Boolean caseSens;

    public TaskOpen(String question, Float max_points, String answer) {
        super(question, max_points);
        this.answer = answer;
    }

    public TaskOpen() {
        this.answer = "";
    }

    public TaskOpen(String question, Float max_points) {
        super(question, max_points);
        this.answer = "";
        this.caseSens = false;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getCaseSens() {
        return caseSens;
    }

    public void setCaseSens(Boolean caseSens) {
        this.caseSens = caseSens;
    }

    @Override
    public String toString() {
        return "TaskOpen{" +
                "Task='" + super.toString() + '\'' +
                "question='" + super.getQuestion() + '\'' +
                "caseSens=" + caseSens + '\'' +
                "answer='" + answer + '\'' +
                '}';
    }
}
