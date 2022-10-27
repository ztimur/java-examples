package kg.knu.java.learn;

abstract public class Animal {
    protected String name;
    protected String voice;

    public void voice() {
        System.out.println(this.name + " " + this.voice);
    }

    abstract public String getName();

}
