public class Spacecraft {
    private int[] position;
    private String direction;

    public Spacecraft(int[] position, String direction) {
        this.position = position;
        this.direction = direction;
    }

    public int[] getPosition() {
        return position;
    }

    public String getDirection() {
        return direction;
    }

    public void moveForward() {
        int x = position[0];
        int y = position[1];
        int z = position[2];
        if (direction.equals("N")) {
            position = new int[] { x, y + 1, z };
        }
        // Implement similar logic for other directions
    }

    public void turnLeft() {
        String[] directions = { "N", "W", "S", "E" };
        int currentIndex = Arrays.asList(directions).indexOf(direction);
        int newIndex = (currentIndex + 1) % directions.length;
        direction = directions[newIndex];
    }

    // Add methods for other commands and sequences
}
