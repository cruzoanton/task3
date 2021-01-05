package com.company;

public class Main {
    public static void main(String[] args) {
        Human tinder = new Human(false, "Регистратор", "Тиндера", 160, 90); //Используем для обращения за методами в другом классе
        Human scanned1 = Human.scanHuman(); //сканируемый объект
        Human human2 = new Human(true, "Иван", "Костенко", 180, 95); //тут наши готовые варианты
        Human human3 = new Human(false, "Лариса", "Петренко", 170, 57);

        System.out.println("1. " + scanned1.toString());
        System.out.println("2. " + human2.toString()); //вывести наших людей на экран
        System.out.println("3. " + human3.toString());

        System.out.println("Сверяем 1 и 2:");
        tinder.makeBaby(scanned1, human2);
        System.out.println("Сверяем 1 и 3:");
        tinder.makeBaby(scanned1, human3);
        System.out.println("Сверяем 2 и 3:");
        tinder.makeBaby(human2, human3);

//        tinder.talk(human2,human3);        //методы отдельно по желанию
//        tinder.company(human2,human3);
//        tinder.together(human2,human3);
    }
}


