class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven = 0;
    private int battery = 100;

    public int getBattery() {
        return battery;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getSpeed() {
        return speed;
    }
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()){
            this.distanceDriven += speed;
            this.battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return (int)(100/car.getBatteryDrain()) * car.getSpeed() >= this.distance;
    }
}
