package model;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String sex;
    private double [] score ;
    private static int idEcrement =0 ;

    public Student( String name, String sex, double[] score) {
        this.id = idEcrement;
        this.name = name;
        this.sex = sex;
        this.score = score;
        idEcrement++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + Arrays.toString(score) +
                '}';
    }
}
