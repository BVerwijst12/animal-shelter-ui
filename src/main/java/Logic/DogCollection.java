package Logic;

import java.util.ArrayList;

public class DogCollection {
    public ArrayList<Dog> allDogs;

    public DogCollection(){
        allDogs = new ArrayList<Dog>();
    }

    public int calcDogPrice(){
        int price = 500;
        for (Dog dog: allDogs
        ) {
            if (price - 50 > 50){
                price = price - 50;
            }
        }

        return price;
    }

    public void addDog(String name, Gender gender){
        Dog dog = new Dog(name, gender);

        allDogs.add(dog);
    }
}
