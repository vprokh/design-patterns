package headfirst.designpatterns.structure.adapter.ducks;

import java.util.Random;

public class DuckAdapter implements Turkey {
    private final Duck duck;
    private final Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
