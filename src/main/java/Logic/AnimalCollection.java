package Logic;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {
    private ArrayList<Animal> allAnimals = new ArrayList<Animal>();
    private CatCollection catCollection = new CatCollection();
    private DogCollection dogCollection = new DogCollection();

    public void addAnimal(String badHabits, Animal animal){
        if (badHabits == ""){
            dogCollection.addDog(animal.getName(), animal.getGender());
        }
        else {
            catCollection.addCat(animal.getName(), animal.getGender(), badHabits);
        }
        allAnimals.add(animal);
    }

    private void setAllAnimals(){
        for (Cat cat: catCollection.getAllCats()
             ) {
            allAnimals.add(cat);
        }
        for (Dog dog : dogCollection.getAllDogs()){
            allAnimals.add(dog);
        }
    }
    public ArrayList<Animal> getAllAnimals(){
        return allAnimals;
    }

}
