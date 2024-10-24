import java.util.ArrayList;
import java.util.List;


interface AnimalInteraction {
    void feed(String food);
    void play();
    void showInteractionHistory();
}


abstract class SimpleAnimal implements AnimalInteraction {
    protected List<String> interactionHistory;

    public SimpleAnimal() {
        this.interactionHistory = new ArrayList<>();
    }

    @Override
    public void feed(String food) {
        interactionHistory.add("Fed with " + food);
    }

    @Override
    public void play() {
        interactionHistory.add("Played interaction");
    }


    @Override
    public void showInteractionHistory() {
        System.out.println("Interaction History:");
        for (String interaction : interactionHistory) {
            System.out.println(interaction);
        }
    }


    public void sleep(int hours) {
        interactionHistory.add("Slept for " + hours + " hours");
    }
}


class Dog extends SimpleAnimal {


    public void bark() {
        System.out.println("The dog is barking!");
    }
}


class Cat extends SimpleAnimal {


    public void meow() {
        System.out.println("The cat is meowing!");
    }
}


public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();


        dog.feed("bone");
        dog.play();
        dog.bark();
        dog.sleep(4);


        cat.feed("fish");
        cat.play();
        cat.meow();
        cat.sleep(3);


        System.out.println("\nDog's Interaction History:");
        dog.showInteractionHistory();


        System.out.println("\nCat's Interaction History:");
        cat.showInteractionHistory();
    }
}
