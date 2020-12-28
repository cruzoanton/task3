package com.company;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human(true, "Иван", "Костенко", 180, 95);
        Human human2 = new Human(false, "Лариса", "Петренко", 160, 57);


        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human1.talk(human2.gender)); //берем только пол
        System.out.println(human1.company(human2.gender));
        System.out.println(human1.together(human2.height)); //здесь сравниваем рост



    }
}
