package com.zespolowka.entity.createTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class TaskSql extends Task {
    @Lob
    @Column(length = 1000)
    private String sqlAnswer;

    @Lob
    @Column(length = 10000)
    private String preparations;

    public TaskSql() {
    }

    public TaskSql(String question, Float max_points) {
        super(question, max_points);
    }

    public TaskSql(String question, Float max_points, String sqlAnswer, String preparations) {
        super(question, max_points);
        this.sqlAnswer = sqlAnswer;
        this.preparations = preparations;
    }

    public String getPreparations() {
        return preparations;
    }

    public void setPreparations(String preparations) {
        this.preparations = preparations;
    }

    public String getSqlAnswer() {
        return sqlAnswer;
    }

    public void setSqlAnswer(String sqlAnswer) {
        this.sqlAnswer = sqlAnswer;
    }

    @Override
    public String toString() {
        return "TaskSql{" +
                "Task='" + super.toString() + '\'' +
                "preparations='" + preparations + '\'' +
                ", sqlAnswer='" + sqlAnswer + '\'' +
                '}';
    }
}
