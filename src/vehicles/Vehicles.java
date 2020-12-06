package vehicles;

public enum Vehicles {
    V1, V2, V3;

    private int cost;
    private String color;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  this.name() + " " +
                "cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
