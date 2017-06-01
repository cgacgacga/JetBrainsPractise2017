package com.company;



public class Main {

    public static void main(String[] args) {
        LibCard Mine = new LibCard("Artem", "Kuzminov", 16, "Saint-Petersburg");
        System.out.println(Mine.getAdress());
        System.out.println(Mine.getAge());
        System.out.println(Mine.getName());
        Mine.setAge(18);
        Mine.IncAge(2);
        System.out.println(Mine.getAge());

    }
}