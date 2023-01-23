package com.serenitydojo;

public class Dog {
    public static String dog_noise = "loud Woof";
    public String name;
    public String favoriteToy;
    public int age;

    public  static boolean isfed = true;


    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;

    }

    public void makeNoise() {
        System.out.println(dog_noise);
    }

    public static boolean feed(boolean isfed) {
 return true;
 
    }

}
