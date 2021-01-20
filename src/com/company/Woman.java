package com.company;

import java.util.Random;

public class Woman extends Human {
    public Woman(String name, String surName, float height, float weight) {
        super(false, name, surName, height, weight);
    }

    public void makeBaby(Object a, Object b) {
        Human first = (Human) a;
        Human second = (Human) b;
        if (talk(first, second) &&  //сравниваем условия методов
                company(first, second) &&
                together(first, second)) {
            System.out.println("Поздравляем!");
            Random r = new Random();

            if (first.gender != second.gender) { //проверка на разность полов
                System.out.println("У Вас родился малыш!");
                if (r.nextInt(100) < 50) {
                    System.out.print("Мальчик, будет ");
                    if (first.gender) {             //присваиваем вес и рост
                        rost = (float) (first.height + second.height * 0.1); //если первый родитель отец
                        ves = (float) (first.weight + second.weight * 0.1);
                    } else {
                        rost = (float) (second.height + first.height * 0.1); //если второй родитель отец
                        ves = (float) (second.weight + first.weight * 0.1);
                    }


                } else {
                    System.out.print("Девочка, будет "); //то же самое но с девочкой, если первый родитель мать
                    if (!first.gender) {
                        rost = (float) (first.height + second.height * 0.1);
                        ves = (float) (first.weight + second.weight * 0.1);
                    } else {
                        rost = (float) (second.height + first.height * 0.1);
                        ves = (float) (second.weight + first.weight * 0.1);
                    }
                }

                if (first.gender) {            //присваиваем Фамилию и закидываем рост и вес ребенка
                    System.out.println(first.surName + " " + "ростом " + rost + " и весом " + ves);
                } else
                    System.out.println(second.surName + " " + "ростом " + rost + " и весом " + ves);
            }
        } else System.out.println("Ничего не вышло");
    }

}


