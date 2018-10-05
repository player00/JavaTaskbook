package Other.Exceptions.L3;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Logging {
    private final static Logger ClassA = Logger.getLogger("org.stepic.java.logging.ClassA");
    private final static Logger ClassB = Logger.getLogger("org.stepic.java.logging.ClassB");

    private static void configureLogging() {
        ClassA.setLevel(Level.ALL);
        ClassB.setLevel(Level.WARNING);

        ConsoleHandler ch = new ConsoleHandler();
        Logger parent = Logger.getLogger("org.stepic.java");

        parent.addHandler(ch);
        parent.setUseParentHandlers(false);

        XMLFormatter formatter = new XMLFormatter();
        ch.setLevel(Level.ALL);
        ch.setFormatter(formatter);
    }

    public static void main(String[] args) {
        configureLogging();
    }

}
