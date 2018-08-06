package ru.job4j.btcmp.roboTask;

/**
 * Created by bondarenko.n on 03.08.2018.
 */
public class RoboMover  {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {


      /*  for (int i = 0; i < 3; i++) {
            try(RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                i = 4;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException("Not connected:" + " " + e.getMessage());
                }
            }
        }*/



     /*   boolean connectedMoved = false;
        for (int i = 0; i < 3; i++) {
            RobotConnection connection = robotConnectionManager.getConnection();
            try {
                connection.moveRobotTo(toX, toY);
                connectedMoved = true;
                i = 4;
            } catch (RobotConnectionException e) {}
            finally{
          if (connection!=null) {
              connection.close();
          }
            }

            if ( i == 2 && !connectedMoved) {
                throw new RobotConnectionException("Not connected");
            }
        } */



        RobotConnection connection = null;
        for(int i = 0; i < 3; i++) {
            try{
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                i = 3;
            }
            catch (RobotConnectionException exception) {

                if(i == 2) throw new RobotConnectionException("Error");
                else continue;
            }
            finally {
                try {
                    connection.close();
                }
                catch (Exception e) {

                }
            }
            // your implementation here
        }



     /*
     finally{
  if(connection!=null)
  {
    try{
      connection.close();
    }
    catch(Exception e)
    {
      //Ignore
    }
  }
}
      */




    }


    public static void main(String[] args) {
        moveRobot(new RightRobConnection().robotConnectionManagerMake(false),2,2);
        moveRobot(new RightRobConnection().robotConnectionManagerMake(true),2,2);
    }



}
