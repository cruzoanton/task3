package com.company;

public class Main {
    public static void main(String[] args) {
        Human scanned1 = Human.scanHuman(); //сканируемый объект
        Man man = new Man("Чувак", "Мужиковский", 185, 88);
        Woman woman = new Woman("Клава", "Бабина", 160, 60);//Используем для обращения за методом рождения

        System.out.println("1. " + scanned1.toString());
        System.out.println("2. " + man.toString()); //вывести наших людей на экран
        System.out.println("3. " + woman.toString());

        System.out.println("Сверяем 1 и 2:");
        woman.makeBaby(scanned1, man);
        System.out.println("Сверяем 1 и 3:");
        woman.makeBaby(scanned1, woman);
        System.out.println("Сверяем 2 и 3:");
        woman.makeBaby(man, woman);

//        man.talk(man,woman);        //методы отдельно по желанию
//        man.company(man,woman);
//        man.together(man,woman);
    }
}


