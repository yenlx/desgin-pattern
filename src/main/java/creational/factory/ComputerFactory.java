package creational.factory;

public class ComputerFactory {
    static Computer getComputer(ComputerType type, String name, String memory) {
        if (type == ComputerType.SERVER) return new Server(name, memory);
        return new PC(name, memory);
    }
}
