public class RaceTrack {

    private ArrayList<Obstacle> trackLayout;
    public int trackLength;

    public RaceTrack(int trackLength) {
        this.trackLength = trackLength;
        this.trackLayout = new ArrayList<>();
    }

    public void generateTrackLayout() {
        // Randomly generate obstacles and add them to the trackLayout
        for (int i = 0; i < trackLength; i++) {
            int randomObstacleType = random.nextInt(4);
            if (randomObstacleType != 0) {
                Obstacle obstacle = new Obstacle(i, randomObstacleType);
                trackLayout.add(obstacle);
            }
        }
    }

    public ArrayList<Obstacle> getTrackLayout() {
        return trackLayout;
    }
}