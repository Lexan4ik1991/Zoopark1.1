package Zoopark;

public class Cat extends Predator implements Runable,Swimable{
    public Cat(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm cat. " + super.toString() + ". My speed is " + speedOfRun()
                + ". My speed of swim " + speedOfSwim();
    }
    public String say(){
        return "meow-meow";
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfSwim() {
        return 9;
    }
}