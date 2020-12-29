package DzGB;

public class Cats extends Animal {
    public Cats(String name) {
        super(name, 200, 0);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s неумею, там сыро!!!%n", getName());
    }
}





