package Zoopark;

public class Dog extends Predator implements Runable,Swimable{
    public Dog(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm dog. " + super.toString() + ". My speed is " + speedOfRun()
                + ". My speed of swim " + speedOfSwim();
    }
    public String say(){
        return "gav-gav";
    }

    @Override
    public int speedOfRun() {
        return 20;
    }

    @Override
    public int speedOfSwim() {
        return 8;
    }
}
