package ru.job4j.btcmp.roboTask;

import java.io.IOException;

/**
 * Created by bondarenko.n on 03.08.2018.
 */
public class RightRobConnection {
    public RobotConnectionManager robotConnectionManagerMake(boolean exeption) {
        return new RobotConnectionManager() {
            @Override
            public RobotConnection getConnection() {
                return new RealConnection().realConnectionMake(exeption);
            }
        };

    }
}
