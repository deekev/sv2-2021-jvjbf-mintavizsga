package aquarium;

public class Fish {

    private String name;
    private int weight;
    private String color;
    private boolean memoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setMemoryLoss(boolean memoryLoss) {
        this.memoryLoss = memoryLoss;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    public String getStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(", weight: ").append(weight).append(", color: ")
                .append(color).append(", short-term memory loss: ").append(memoryLoss);
        return sb.toString();
    }

    public void feed() {
        weight += 1;
    }
}