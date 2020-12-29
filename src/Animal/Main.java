package Animal;

import DzGB.Animal;
import DzGB.Cats;
import DzGB.Dogs;

public class Main {
    public static void main(String[] args){
        Cats kitty = new Cats("Kitty");
        Dogs doggy = new Dogs("Doggy");
//        int a = (int) Math.random() * 600;
//        int b = (int) Math.random() * 20;
        kitty.run((int) (Math.random() * 600));
        kitty.swim((int) (Math.random() * 20));
        doggy.run((int) (Math.random() * 600));
        doggy.swim((int) (Math.random() * 20));
    }
}
