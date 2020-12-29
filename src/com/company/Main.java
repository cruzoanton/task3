package com.company;

import java.util.Random;

public class Main {
//в своем ДЗ я не стал использовать сканер, т.к. это очень замедляет подбор различных вариантов
    public static void main(String[] args) {
        float rost, ves; //переменные для ребенка
        Human human1 = new Human(true, "Иван", "Костенко", 180, 95); //тут вводим наши варианты
        Human human2 = new Human(false, "Лариса", "Петренко", 180, 57);

        System.out.println(human1.toString()); //вывести наших людей на экран
        System.out.println(human2.toString());
//        System.out.println(human1.talk(human2.gender)); // выводить отдельно каждый метод
//        System.out.println(human1.company(human2.gender));
//        System.out.println(human1.together(human2.height));

        if (human1.talk(human2.gender) &&  //сравниваем условия методов
                human1.company(human2.gender) &&
                human1.together(human2.height)) {
            System.out.println("Поздравляем!");
            Random r = new Random();

            if (human1.gender != human2.gender) { //проверка на разность полов
                System.out.println("У Вас родился малыш!");
                if (r.nextInt(100) < 50) {
                    System.out.print("Мальчик, будет ");
                    if (human1.gender) {             //присваиваем вес и рост
                        rost = (float) (human1.height + human2.height * 0.1); //если первый родитель отец
                        ves = (float) (human1.weight + human2.weight * 0.1);
                    } else {
                        rost = (float) (human2.height + human1.height * 0.1); //если второй родитель отец
                        ves = (float) (human2.weight + human1.weight * 0.1);
                    }


                } else {
                    System.out.print("Девочка, будет "); //то же самое но с девочкой, если первый родитель мать
                    if (!human1.gender) {
                        rost = (float) (human1.height + human2.height * 0.1);
                        ves = (float) (human1.weight + human2.weight * 0.1);
                    } else {
                        rost = (float) (human2.height + human1.height * 0.1);
                        ves = (float) (human2.weight + human1.weight * 0.1);
                    }
                }

                if (human1.gender) {            //присваиваем Фамилию и закидываем рост и вес ребенка
                    System.out.print(human1.surName + " " + "ростом " + rost + " и весом " + ves);
                } else
                    System.out.print(human2.surName + " " + "ростом " + rost + " и весом " + ves);
            }


        } else System.out.println("Ничего не вышло");

    }
}

