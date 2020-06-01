package com.myjava.ocp.lab12;

public class Exam {
    private String subject;
    private Integer score;

    public Exam() {
    }

    public Exam(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
}
