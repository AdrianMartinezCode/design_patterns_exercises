package exercise3_abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        Application windowsApp = new Application(new WindowsFactory());
        Application linuxApp = new Application(new LinuxFactory());

        windowsApp.initialize();
        linuxApp.initialize();
    }
}
