package com.company;

import java.util.Random;

public class Human {
    Boolean gender;
    String name;
    String surName;
    float height;
    float weight;

    public Human(Boolean gender, String name, String surName, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.surName = surName;
        this.height = height;
        this.weight = weight;
    }

    public Boolean talk(boolean gend) {  //сверяем только пол, остальные параметры не имеют значение
        System.out.print("Будут ли говорить?  ");
        if (!gender && !gend) {
            System.out.println("Да!");
            return true;
        } else if (!gender && gend) {
            System.out.println("Да!");
            return true;
        } else if (gender && !gend) {
            System.out.println("Да!");
            return true;
        } else if (gender && gend) {
            Random r = new Random();
            if (r.nextInt(100) < 50) {
                System.out.println("Да!");
                return true;
            } else {
                System.out.println("Нет!");
                return false;
            }
        }
        System.out.println("Нет!");
        return false;

    }

    public Boolean company(boolean gend) { //сверка терпения по половым признакам
        System.out.print("Будут ли терпеть общество друг друга?  ");
        if (!gender && !gend) {
            Random r = new Random();
            if (r.nextInt(100) < 5) {
                System.out.println("Да!");
                return true;
            }
        } else if (!gender && gend) {
            Random r = new Random();
            if (r.nextInt(100) < 70) {
                System.out.println("Да!");
                return true;
            }
        } else if (gender && !gend) {
            Random r = new Random();
            if (r.nextInt(100) < 70) {
                System.out.println("Да!");
                return true;
            }
        } else if (gender && gend) {
            Random r = new Random();
            if (r.nextInt(100) < 5.6) {
                System.out.println("Да!");
                return true;
            }
        }
        {
            System.out.println("Нет!");
            return false;
        }
    }

    public Boolean together(float h) { //тут вместо полового признака сверяем рост
        System.out.print("Будут тусить вместе?  ");
        if (Math.abs(height - h) < height / 10) {    //разница в росте до 10%
            Random r = new Random();
            if (r.nextInt(100) < 95) {
                System.out.println("Да, вероятность была 95%");
                return true;
            }
        } else {                                        //разница более 10%
            Random r = new Random();
            if (r.nextInt(100) < 85) {
                System.out.println("Да, вероятность была 85%");
                return true;
            }
            System.out.println("Нет, вероятность была 15%");
            return false;
        }
        System.out.println("Нет, вероятность была 5% (");
        return false;
    }


    @Override
    public String toString() {
        String pol = gender ? "Мужчина " : "Женщина ";
        return pol + name + " " + surName + " Ростом= " + height + "см и Весом= " + weight + "кг";
    }
}