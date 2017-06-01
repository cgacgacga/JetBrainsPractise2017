package com.company;

/**
 * Created by Артём on 01.06.2017.
 */
public class LibCard {
    String Name;
    String Surname;
    int Age;
    String Adress;


    public LibCard(String name, String surname, int age, String adress) {
        String Name = name;
        String Surname = surname;
        int Age = age;
        String Adress = adress;
    }
    @Override
    public String toString() {
        return "LibCard{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                ", Adress='" + Adress + '\'' +
                '}';
    }
    public void IncAge( int diff ) {
        this.Age+= diff;
    }
    public void ChangeAdress( String Adress ) {
        this.Adress = Adress;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }

    public String getAdress() {
        return Adress;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }
}
