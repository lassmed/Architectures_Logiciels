package com.directi.training.lsp.exercise_refactored;

public class Pool
{
    public void run() throws Exception {
        Duck donaldDuck = new NormalDuck();
        Duck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck... ducks) throws Exception {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks) throws Exception {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) throws Exception {
        Pool pool = new Pool();
        pool.run();
    }
}
