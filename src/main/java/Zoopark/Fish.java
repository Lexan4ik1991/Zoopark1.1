package Zoopark;

public class Fish extends Herbivores implements Swimable {
    public Fish(String nickname) {
        super(nickname);

    }

    public String toString() {
        return "I'm fish. " + super.toString() + " speed of swim " + speedOfSwim();
    }
    @Override
    public String say() {
        return "Bul-Bul";
    }

    @Override
    public int speedOfSwim() {
        return 15;
    }
}
