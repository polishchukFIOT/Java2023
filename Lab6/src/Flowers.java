public class Flowers {
    private final String type;
    private final Boolean isBuy;
    private final int price;
    private final int freshness;
    private final int lengthFlower;

    public Flowers(String type, Boolean isBuy, int price, int freshness, int lengthFlower) {
        this.type = type;
        this.isBuy = isBuy;
        this.price = price;
        this.freshness = freshness;
        this.lengthFlower = lengthFlower;
    }

    public String getType() {
        return type;
    }

    public Boolean getIsPlugged() {
        return isBuy;
    }

    public int getPrice() {
        return price;
    }

    public int getFreshness() {
        return freshness;

    }
    public int getLengthFlower() {
        return lengthFlower;

    }
    @Override
    public String toString() {
        return String.format("%s -> isBuy: %b, price: %d, freshness: %d; lengthFlower: %d, ", type, isBuy, price, freshness, lengthFlower);
    }
}