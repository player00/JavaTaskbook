package Other.Exceptions.L2;

public class RobotController {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int tries = 3;
        RobotConnection rc = null;

        while (tries-- > 0) {
            try {
                System.out.println(tries);
                rc = robotConnectionManager.getConnection();
                rc.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException exception) {
                if (tries == 0) {
                    throw exception;
                }
            } finally {
                if (rc != null) {
                    try {
                        rc.close();
                    } catch (RuntimeException e) {
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        RobotConnectionManager robotConnectionManager = new RobotConnectionManagerClass();
        moveRobot(robotConnectionManager, 10, 10);
    }

}

interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);

    @Override
    void close();
}

interface RobotConnectionManager {
    RobotConnection getConnection();
}

class RobotConnectionManagerClass implements RobotConnectionManager {
    @Override
    public RobotConnection getConnection() {
        if (false) {
            throw new RobotConnectionException("Connection");
        }
        return new RobotConnection() {
            @Override
            public void moveRobotTo(int x, int y) {
            }

            @Override
            public void close() {
                if (true) {
                    throw new RobotConnectionException("Close");
                }
            }
        };
    }
}

class RobotConnectionException extends RuntimeException {

    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
