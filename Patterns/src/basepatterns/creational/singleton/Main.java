package basepatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log");
        ProgramLogger.getProgramLogger().addLogInfo("Second log");
        ProgramLogger.getProgramLogger().addLogInfo("Third log");
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
