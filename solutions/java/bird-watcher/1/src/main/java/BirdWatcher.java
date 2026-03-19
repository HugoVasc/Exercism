
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        int lastElementIndex = birdsPerDay.length - 1;
        return this.birdsPerDay[lastElementIndex];
    }

    public void incrementTodaysCount() {
        int lastElementIndex = birdsPerDay.length - 1;
        int todayCount = this.birdsPerDay[lastElementIndex];
        this.birdsPerDay[lastElementIndex] = todayCount + 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int dayCount : this.birdsPerDay){
            if(dayCount == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays >= this.birdsPerDay.length){
            numberOfDays = this.birdsPerDay.length;
        }
        int sumOfBirdsVistsPerDay = 0;
        for(int i = 0; i < numberOfDays; i++){
            sumOfBirdsVistsPerDay += this.birdsPerDay[i];
        }
        return sumOfBirdsVistsPerDay;
    }

    public int getBusyDays() {
        int countOfBusyDays = 0;
        for(int dayCount : this.birdsPerDay){
            if(dayCount >= 5){
                countOfBusyDays += 1;
            }
        }
        return countOfBusyDays;
    }
}
