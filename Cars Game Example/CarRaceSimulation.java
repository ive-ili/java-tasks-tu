public class CarRaceSimulation {

    public static void main(String[] args) {
        int trackLength = 100; 
        RaceTrack raceTrack = new RaceTrack(trackLength);

        // Create multiple Car objects representing participants in the race
        Car car1 = new Car("Red car", 0, 10, raceTrack);
        Car car2 = new Car("Green car", 50, 15, raceTrack);
        Car car3 = new Car("Blue car", 20, 20, raceTrack);

        // Start the threads for each car to initiate their movement
        Thread car1Thread = new Thread(car1);
        Thread car2Thread = new Thread(car2);
        Thread car3Thread = new Thread(car3);

        car1Thread.start();
        car2Thread.start();
        car3Thread.start();

        while (true) {
            if (car1.isFinished() && car2.isFinished() && car3.isFinished()) {
                if (car1.getCurrentPosition() >= car2.getCurrentPosition() && car1.getCurrentPosition() >= car3.getCurrentPosition()) {
                    System.out.println("Red car wins!");
                } else if (car2.getCurrentPosition() >= car1.getCurrentPosition() && car2.getCurrentPosition() >= car3.getCurrentPosition()) {
                    System.out.println("Green car wins!");
                } else {
                    System.out.println("Blue car wins!");
                }
                break;
            }
        }
    }
}