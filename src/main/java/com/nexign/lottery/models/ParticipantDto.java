package com.nexign.lottery.models;

public class ParticipantDto {
    private String name;
    private int age;
    private String city;

    public ParticipantDto(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return "ParticipantDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
