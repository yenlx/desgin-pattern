package creational.factory;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(ComputerType.PC, "PC", "8Gb");
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "Server", "32Gb");

        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
