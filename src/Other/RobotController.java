package Other;

public class RobotController {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int dx = toX - robot.getX();
        int dy = toY - robot.getY();
        Direction dirX = dx < 0 ? Direction.LEFT : Direction.RIGHT;
        Direction dirY = dy < 0 ? Direction.DOWN : Direction.UP;

        dx = Math.abs(dx);
        dy = Math.abs(dy);

        while (robot.getDirection() != dirX) robot.turnRight();
        while (dx-- > 0) robot.stepForward();
        while (robot.getDirection() != dirY) robot.turnRight();
        while (dy-- > 0) robot.stepForward();
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, -3, -10);
        System.out.println(robot.getcGet());
        System.out.println(robot.getcAction());
        System.out.println(robot.getX());
        System.out.println(robot.getY());
    }

    static class Robot {
        int x = 10, y = 10;
        Direction direction = Direction.UP;
        int cGet = 0;
        int cAction = 0;

        public Direction getDirection() {
            cGet++;
            return direction;
        }

        public int getX() {
            cGet++;
            return x;
        }

        public int getY() {
            cGet++;
            return y;
        }

        public void turnLeft() {
            cAction++;
            switch (direction) {
                case UP:
                    direction = Direction.LEFT;
                    break;
                case LEFT:
                    direction = Direction.DOWN;
                    break;
                case DOWN:
                    direction = Direction.RIGHT;
                    break;
                case RIGHT:
                    direction = Direction.UP;
                    break;
            }
        }

        public void turnRight() {
            cAction++;
            switch (direction) {
                case UP:
                    direction = Direction.RIGHT;
                    break;
                case RIGHT:
                    direction = Direction.DOWN;
                    break;
                case DOWN:
                    direction = Direction.LEFT;
                    break;
                case LEFT:
                    direction = Direction.UP;
                    break;
            }
        }

        public void stepForward() {
            cAction++;
            switch (direction) {
                case UP:
                    y++;
                    break;
                case RIGHT:
                    x++;
                    break;
                case DOWN:
                    y--;
                    break;
                case LEFT:
                    x--;
                    break;
            }
            System.out.printf("x=%d y=%d\n", x, y);
        }

        public int getcGet() {
            return cGet;
        }

        public int getcAction() {
            return cAction;
        }
    }
}
