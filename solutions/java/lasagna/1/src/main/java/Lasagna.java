public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int elapsedTime) {
        return this.expectedMinutesInOven() - elapsedTime;
    }
    public int preparationTimeInMinutes(int numLayers) {
        return 2 * numLayers;
    }
    public int totalTimeInMinutes(int numLayers) {
        return this.expectedMinutesInOven() + preparationTimeInMinutes(numLayers);
    }
}
