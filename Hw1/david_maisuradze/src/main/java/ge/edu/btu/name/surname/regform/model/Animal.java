package ge.edu.btu.name.surname.regform.model;

public class Animal {
    public Animal() {
    }
    private String name;
    private String breed;
    private String sex;
    private int age;

    public Animal(String name, String breed, String sex, int age) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.printf("Name: %s\nBreed: %s\nSex: %s\nAge: %d\n", this.name, this.breed, this.sex, this.age);
    }
}
