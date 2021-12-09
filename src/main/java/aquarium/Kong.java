package aquarium;

public class Kong extends Fish {

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
        setMemoryLoss(false);
    }

    @Override
    public void feed() {
        super.feed();
        super.feed();
    }
}