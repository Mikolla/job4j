package ru.job4j.btcmp.firstLogger;

import java.util.logging.*;

public class LogConfig {

    private static void configureLogging() {
        // your implementation here

   Logger LOGGERa = Logger.getLogger("org.stepic.java.logging.ClassA");
   Logger LOGGERb = Logger.getLogger("org.stepic.java.logging.ClassB");
   Logger LOGGERl = Logger.getLogger("org.stepic.java");

   LOGGERa.setLevel(Level.ALL);
   LOGGERb.setLevel(Level.WARNING);
   LOGGERl.setLevel(Level.ALL);

   LOGGERl.setUseParentHandlers(false);

   Handler handler = new ConsoleHandler();
   handler.setLevel(Level.ALL);
   LOGGERl.addHandler(handler);

   XMLFormatter xmlFormatter = new XMLFormatter();
   handler.setFormatter(xmlFormatter);

}


    public static void main(String[] args) {
        configureLogging();
    }


}
