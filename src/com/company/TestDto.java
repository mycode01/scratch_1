package com.company;

public class TestDto {
    @TestAnnotation(temp = "test")
    private String name;
    @TestAnnotation
    private String age;

    @Override
    public String toString() {
        return "name: "+name +" age: "+age;
    }
}
