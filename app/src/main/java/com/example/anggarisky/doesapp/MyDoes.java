package com.example.anggarisky.doesapp;

public class MyDoes {

    String titledoes;
    String datedoes;
    String descdoes;

    public MyDoes() {
    }

    public MyDoes(String titledoes, String datedoes, String descdoes) {
        this.titledoes = titledoes;
        this.datedoes = datedoes;
        this.descdoes = descdoes;
    }

    public String getTitledoes() {
        return titledoes;
    }

    public void setTitledoes(String titledoes) {
        this.titledoes = titledoes;
    }

    public String getDatedoes() {
        return datedoes;
    }

    public void setDatedoes(String datedoes) {
        this.datedoes = datedoes;
    }

    public String getDescdoes() {
        return descdoes;
    }

    public void setDescdoes(String descdoes) {
        this.descdoes = descdoes;
    }
}
