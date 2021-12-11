package aquarium;

public abstract class Fish {

    private String name;
    protected int weight;
    private String color;

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

    public abstract boolean hasMemoryLoss();

    public abstract void feed();

    public String getStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(", weight: ").append(weight).append(", color: ")
                .append(color).append(", short-term memory loss: ").append(hasMemoryLoss());
        return sb.toString();
    }
}