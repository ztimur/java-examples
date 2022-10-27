package kg.knu.java.learn;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
        this.voice = "Мяу...";
    }

    @Override
    public String getName() {
        return name;
    }
}
