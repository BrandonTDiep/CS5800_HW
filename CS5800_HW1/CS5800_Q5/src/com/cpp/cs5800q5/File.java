package com.cpp.cs5800q5;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(String currentFileDirectory) {
        System.out.println(currentFileDirectory + this.name);
    }

}

