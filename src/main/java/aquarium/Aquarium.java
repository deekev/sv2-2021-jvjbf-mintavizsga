package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    public static final int CAPACITY = 20;
    private List<Fish> fishes = new ArrayList<>();

    public void addFish(Fish fish) {
        if (fishes.size() != 0 && CAPACITY / (fishes.size() + 1) < 5) {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
        fishes.add(fish);
    }

    public List<String> getFishes() {
        return getStatus();
    }

    public void feed() {
        for (Fish actual: fishes) {
            actual.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> fishOverWeight = new ArrayList<>();
        for (Fish actual: fishes) {
            if (actual.getWeight() > maxWeight) {
                fishOverWeight.add(actual);
            }
        }
        fishes.removeAll(fishOverWeight);
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for (Fish actual: fishes) {
            status.add(actual.getStatus());
        }
        return status;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int count = 0;
        for (Fish actual : fishes) {
            if (actual.hasMemoryLoss()) {
                count++;
            }
        }
        return count;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish actual : fishes) {
            if (color.equals(actual.getColor())) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallest = fishes.get(0);
        for (Fish actual : fishes) {
            if (actual.getWeight() < smallest.getWeight()) {
                smallest = actual;
            }
        }
        return smallest;
    }
}