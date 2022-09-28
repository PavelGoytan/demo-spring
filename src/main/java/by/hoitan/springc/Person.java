package by.hoitan.springc;

public class Person {
    private Pet pet;
    private String firstName;
    private int age;

//    public Person(Pet pet) {
//        this.pet = pet;
//    }


    public Person() {
    }

    public Pet getPet() {
        return pet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my Pet");
        pet.say();
    }


}
