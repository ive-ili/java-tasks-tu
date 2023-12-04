public class Car implements Runnable {

    private String name;
    private int currentPosition;
    private int currentSpeed;
    private RaceTrack track;

    public Car(String name, int currentPosition, int currentSpeed) {
        this.name = name;
        this.currentPosition = currentPosition;
        this.currentSpeed = currentSpeed;
        isInObstacle = false;
    }

    @Override
    public void run() {
        while (!isFinished()) {
            move();
            checkObstacles();
        }
    }

    private void move() {
        currentPosition += currentSpeed;
    }

    private void checkObstacles() {
        for (Obstacle obstacle : track.getTrackLayout()) {
            if (obstacle.position == currentPosition) {
                encounterObstacle(obstacle);
            }
        }
    }

    public void encounterObstacle(Obstacle obstacle) {
        obstacle.applyEffect(this);
        // Temporarily suspend the thread to simulate obstacle effect
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isFinished() {
        return currentPosition >= track.trackLength;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}