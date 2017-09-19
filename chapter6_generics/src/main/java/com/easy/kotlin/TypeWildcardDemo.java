package com.easy.kotlin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2017/6/30.
 */
public class TypeWildcardDemo {

    public static void main(String[] args) {
        Animal animal = new Animal();

        //
        //List<Dog> list2 = new ArrayList<>();
        //list2.add(new Animal());

        List<? extends Animal> list1 = new ArrayList<>();

        //list1.add(new Dog());
        //list1.add(new Animal());

        List<Animal> list3 = new ArrayList<>();
        list3.add(new Dog());
        list3.add(new Cat());
        animal.act(list3);

        List<Dog> list4 = new ArrayList<>();

        list4.add(new Dog());
        list4.add(new Dog());
        animal.act(list4);

        list1 = list4;
        animal.act(list1);

        List<Cat> list5 = new ArrayList<>();
        list5.add(new Cat());
        list5.add(new Cat());
        animal.act(list5);

        List<ShepherdDog> list6 = new ArrayList<>();
        list6.add(new ShepherdDog());
        animal.aboutShepherdDog(list6);

        List<Dog> list7 = new ArrayList<>();
        list7.add(new Dog());
        animal.aboutShepherdDog(list7);

        List<Animal> list8 = new ArrayList<>();
        list8.add(new Animal());
        animal.aboutShepherdDog(list8);

        List<Cat> list9 = new ArrayList<>();
        list9.add(new Cat());
        //animal.aboutShepherdDog(list9);

    }

}

class Animal {

    public void act(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }

    public void aboutShepherdDog(List<? super ShepherdDog> list) {
        System.out.println("About ShepherdDog");
    }

    public void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal {}

class Cat extends Animal {}

class ShepherdDog extends Dog {}
