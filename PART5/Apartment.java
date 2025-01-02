package PART5;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return this.rooms;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPricePerSquare() {
        return this.pricePerSquare;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setSquares(int squares) {
        this.squares = squares;
    }

    public void setPricePerSquare(int pricePerSquare) {
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        int selfTotalArea = this.calculateTotalArea(this);
        int comparedTotalArea = this.calculateTotalArea(compared);

        return selfTotalArea > comparedTotalArea;
    }

    public int priceDifference(Apartment compared) {
        int selfTotalPrice = this.calculateTotalPrice(this);
        int comparedTotalPrice = this.calculateTotalPrice(compared);

        return Math.abs(selfTotalPrice - comparedTotalPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int selfTotalPrice = this.calculateTotalPrice(this);
        int comparedTotalPrice = this.calculateTotalPrice(compared);

        return selfTotalPrice > comparedTotalPrice;
    }

    public int calculateTotalArea(Apartment apartment) {
        return apartment.getSquares();
    }

    public int calculateTotalPrice(Apartment apartment) {
        int totalArea = this.calculateTotalArea(apartment);
        return totalArea * apartment.getPricePerSquare();
    }
}
