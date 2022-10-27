package kg.knu.java.learn;

public class AnimalsMain {
    public static void main(String[] args) {
        Animal cat = new Cat("Барсик");
//        cat.say();

        Animal dog = new Dog("Тимон");
        Animal dog2 = new Dog("Димон");
//        dog.say();

        Cow cow = new Cow("Маша");
        Animal[] myAnimals = new Animal[4];
        myAnimals[0] = cat;
        myAnimals[1] = dog;
        myAnimals[2] = cow;
        myAnimals[3] = dog2;

        for (int i = 0; i < myAnimals.length; i++) {
            myAnimals[i].voice();
        }
    }
}
