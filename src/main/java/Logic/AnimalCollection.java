package Logic;

import Dal.AnimalMySQLContext;
import Dal.DTO.AnimalDTO;
import Logic.Interfaces.IAnimalCollection;

import javax.persistence.Convert;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.sql.SQLException;
import java.util.ArrayList;

public class AnimalCollection implements IAnimalCollection {
    private ArrayList<Animal> allAnimals = new ArrayList<Animal>();
    private final PropertyChangeSupport PCS;

    public AnimalCollection() {
        PCS = new PropertyChangeSupport(this);
    }

    public void addAnimal(Animal animal){
        if (animal instanceof Dog){
            allAnimals.add(animal);
            PCS.firePropertyChange("addDog", null, animal);
        }
        if(animal instanceof Cat) {
            allAnimals.add(animal);
            PCS.firePropertyChange("addCat", null, animal);
        }
        allAnimals.add(animal);
    }


    public ArrayList<Animal> getAllAnimals(){
        AnimalMySQLContext animalMySQLContext = new AnimalMySQLContext();

        ArrayList<AnimalDTO> animalDTOS = animalMySQLContext.GetAllAnimals();
        ArrayList<Animal> allAnimals = new ArrayList<>();

        for (AnimalDTO animalDTO: animalDTOS
             ) {
            Animal animal = new Animal(animalDTO.Name, Gender.valueOf(animalDTO.Gender));
            allAnimals.add(animal);
        }
        return allAnimals;
    }

    public void addListener(String propertyName, PropertyChangeListener propertyChangeListener){
        PCS.addPropertyChangeListener(propertyName, propertyChangeListener);
    }


    public int calcDogPrice(){
        int price = 500;
        for (Animal animal : allAnimals
        ) {
            if (animal instanceof Dog){
                if (price - 50 < 50){
                    return price;
                }
                price = price - 50;
            }
        }

        return price;
    }
}
