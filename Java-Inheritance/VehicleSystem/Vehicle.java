class Vehicle {
    private int maxSpeed;
    private String fuelType;
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed; this.fuelType = fuelType;
    }
    void displayInfo() {
        System.out.println("Speed:" + maxSpeed + " Fuel:" + fuelType);
    }
}
