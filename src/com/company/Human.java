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
            return true;
        } else if (!gender && gend) {
            return true;
        } else if (gender && !gend) {
            return true;
        } else if (gender && gend) {
            Random r = new Random();
            if (r.nextInt(100) < 50) {
                return true;
            } else
                return false;
        }
        return false;
    }

    public Boolean company(boolean gend) {
        System.out.print("Будут ли терпеть общество друг друга?  ");
        if (!gender && !gend) {
            Random r = new Random();
            if (r.nextInt(100) < 5) {
                return true;
            }
        } else if (!gender && gend) {
            Random r = new Random();
            if (r.nextInt(100) < 70) {
                return true;
            }
        } else if (gender && !gend) {
            Random r = new Random();
            if (r.nextInt(100) < 70) {
                return true;
            }
        } else if (gender && gend) {
            Random r = new Random();
            if (r.nextInt(100) < 5.6) {
                return true;
            }
        }
        {
            return false;
        }
    }

    public Boolean together(float h) {
        System.out.print("Будут тусить вместе?  ");
        if (Math.abs(height - h) < height / 10) {    //разница в росте до 10%
            Random rTog1 = new Random();
            if (rTog1.nextInt(100) < 95) {
                return true;
            }
        } else {//разница более 10%
            Random rTog2 = new Random();
            if (rTog2.nextInt(100) < 85) {
                return true;
            }
            return false;
        }
        return false;
    }


    @Override
    public String toString() {
        String pol = gender ? "Мужчина " : "Женщина ";
        return pol + name + " " + surName + " Ростом= " + height + "см и Весом= " + weight + "кг";
    }
}