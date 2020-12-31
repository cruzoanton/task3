package com.company;

public class Main {
    //в своем ДЗ я не стал использовать сканер, т.к. это очень замедляет подбор различных вариантов
    public static void main(String[] args) {
        Human tinder = new Human(false, "Регистратор", "Тиндера", 160, 90); //Используем для обращения за методами в другом классе
        Human human1 = new Human(true, "Иван", "Костенко", 180, 95); //тут вводим наши варианты
        Human human2 = new Human(false, "Лариса", "Петренко", 170, 57);

        System.out.println(human1.toString()); //вывести наших людей на экран
        System.out.println(human2.toString());
//        tinder.talk(human1,human2);  //каждый метод по отдельности
//        tinder.company(human1,human2);
//        tinder.together(human1,human2);
        tinder.makeBaby(human1, human2); //все методы вместе
    }
}

