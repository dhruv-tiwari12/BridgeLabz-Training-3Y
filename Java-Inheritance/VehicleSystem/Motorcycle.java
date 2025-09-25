class Motorcycle extends Vehicle {
    private boolean hasCarrier;
    Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed,fuelType); this.hasCarrier = hasCarrier;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Carrier: " + hasCarrier);
    }
}
