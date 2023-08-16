package test;

public class TestSpacecraft {
    @Test
    public void testInitialization() {
        Spacecraft spacecraft = new Spacecraft(new int[] { 0, 0, 0 }, "N");
        assertArrayEquals(spacecraft.getPosition(), new int[] { 0, 0, 0 });
        assertEquals(spacecraft.getDirection(), "N");
    }

    @Test
    public void testMoveForward() {
        Spacecraft spacecraft = new Spacecraft(new int[] { 0, 0, 0 }, "N");
        spacecraft.moveForward();
        assertArrayEquals(spacecraft.getPosition(), new int[] { 0, 1, 0 });
    }

    @Test
    public void testTurnLeft() {
        Spacecraft spacecraft = new Spacecraft(new int[] { 0, 0, 0 }, "N");
        spacecraft.turnLeft();
        assertEquals(spacecraft.getDirection(), "W");
    }

    // Add more tests for other commands and sequences
}
