**Objective:**

Create a Java program that simulates a car race involving multiple cars, incorporating threads for efficient and concurrent movement, obstacles for added challenge and realism, and appropriate data structures for managing the race's progression.

**Core Components:**

1. **Car Class:**

The `Car` class represents each individual car participating in the race. It should encapsulate all relevant information about the car's state and behavior:

Attributes:

- `name`: The unique identifier of the car.
- `currentPosition`: The current position of the car along the race track.
- `currentSpeed`: The current speed of the car.

Methods:

- `run()`: Implements the car's movement logic, including updating its position, checking for obstacles, and applying obstacle effects.
- `encounterObstacle(Obstacle obstacle)`: Handles the car's interaction with an obstacle, applying the obstacle's effect (speed reduction, temporary stoppage).

2. **RaceTrack Class:**

The `RaceTrack` class represents the race track upon which the cars will compete. It is responsible for generating the randomized race track layout, including the placement and properties of obstacles:

Attributes:

- `trackLayout`: An `ArrayList` of `Obstacle` objects representing the randomized race track layout.

Methods:

- `generateTrackLayout()`: Generates a randomized race track layout with varying obstacle positions and effects.

3. **Race Simulation:**

The race simulation logic manages the overall progression of the race, including creating car threads, monitoring car movements, handling obstacle interactions, and determining the race outcome:

Steps:

1. Create a `RaceTrack` object to represent the race track.
2. Generate the race track layout using the `generateTrackLayout()` method of the `RaceTrack` object.
3. Create multiple `Car` objects, each representing a car participating in the race.
4. Implement the `Runnable` interface in the `Car` class to provide the car's movement logic.
5. Create separate threads for each car and start them.
6. Within the `run()` method of the `Runnable` implementation, each car thread should continuously:
    - Read the car's current position and speed.
    - Move the car's position based on its current speed.
    - Check if the car's position coincides with an obstacle.
    - If an obstacle is encountered, handle the interaction by applying the obstacle's effect (speed reduction, temporary stoppage).
7. Track the progress of each car and determine the race winner based on completion time or other relevant criteria.

4. **Obstacle Class:**

The `Obstacle` class represents the obstacles that can slow down or temporarily stop the cars, adding an element of challenge and realism to the simulation:

Attributes:

- `position`: The position of the obstacle along the race track.
- `effect`: The effect of the obstacle on cars, such as speed reduction or temporary stoppage.

Methods:

- `applyEffect(Car car)`: Applies the obstacle's effect to the affected car.
