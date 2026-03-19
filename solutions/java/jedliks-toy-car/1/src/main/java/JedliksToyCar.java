public class JedliksToyCar {
    private int battery = 100;
    private int distance = 0;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return("Driven " + this.distance + " meters");
    }

    public String batteryDisplay() {
        return(
            this.battery > 0 ?
            "Battery at " + this.battery + "%":
            "Battery empty" 
        );
    }

    public void drive() {
        if (battery > 0){
            this.distance += 20;
            this.battery -= 1;
        }
    }
}
