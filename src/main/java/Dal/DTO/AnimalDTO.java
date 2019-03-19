package Dal.DTO;

public class AnimalDTO {
    public int AnimalId;
    public String Name;
    public String Gender;

    public AnimalDTO(int animalId, String name, String gender){
        AnimalId = animalId;
        Name = name;
        Gender = gender;
    }
}
