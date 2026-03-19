public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int cars_produced;
        cars_produced = speed * 221;
        if (speed == 0){
            return 0;
        }else if (speed > 0 && speed < 5) {
            return cars_produced;
        } else if (speed < 9){
            return cars_produced * 0.9;
        } else if (speed < 10) {
            return cars_produced * 0.8;
        } else if (speed == 10) {
            return cars_produced * 0.77;
        }else {
            return -1;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(this.productionRatePerHour(speed) / 60);
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
    }
}
