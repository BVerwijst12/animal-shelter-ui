package Logic;

public class Webshop {

    public Webshop(){
        AnimalCollection animalCollection = new AnimalCollection();
        animalCollection.addListener("addDog", new AddAnimalListener(this));
        animalCollection.addListener("addCat", new AddAnimalListener(this));
        animalCollection.addAnimal(new Dog("jsn", Gender.Male, animalCollection.calcDogPrice()));
        animalCollection.addAnimal(new Cat("jsn", Gender.Male, "ddd"));
    }

    public void dogHasBeenAddedEvent(Dog dog) {
        System.out.println("dogHasBeenAddedEvent");
    }
    public void catHasBeenAddedEvent(Cat cat){
        System.out.println("CatHasBeenAdded");
    }

}
