package creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("PC", "8Gb"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("Server", "32Gb"));

        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
