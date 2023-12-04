public class Obstacle {

    private int position;
    private int effectType;

    public Obstacle(int position, int effectType) {
        this.position = position;
        this.effectType = effectType;
    }

    public void applyEffect(Car car) {
        if (effectType == 1) {
            car.currentSpeed -= 20;
        } else if (effectType == 2) {
            car.currentSpeed -= 50;
            try {
                Thread.sleep(5000); // Simulate temporary stoppage
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (effectType == 3) {
            // Completely stop the car
            car.currentSpeed = 0;
            try {
                Thread.sleep(7000); // Simulate longer stoppage
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}