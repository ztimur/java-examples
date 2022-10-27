package kg.knu.java.learn;

public class Cow extends Animal {

    public Cow(String name) {
        this.name = name;
        this.voice = "Муу...";
    }


    @Override
    public String getName() {
        return this.name;
    }
}
