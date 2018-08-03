package ru.job4j.btcmp.roboTask;

/**
 * Created by bondarenko.n on 03.08.2018.
 */
public class RealConnection {
    public RobotConnection realConnectionMake(boolean exeption) {
        if (exeption) {
            return new RobotConnection() {
                @Override
                public void moveRobotTo(int x, int y) {
                    throw new RuntimeException("Bot move error!!!");
                }

                @Override
                public void close() {
                    throw new RobotConnectionException("Bot connection close error!!!");
                }
            };
        }
        else {
            return new RobotConnection() {
                @Override
                public void moveRobotTo(int x, int y) {

                }

                @Override
                public void close() {

                }
            };
        }
    }

}
