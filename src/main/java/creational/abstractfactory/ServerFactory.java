package creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {
    String name;
    String memory;

    public ServerFactory(String name, String memory) {
        this.name = name;
        this.memory = memory;
    }

    public Computer createComputer() {
        return new Server(name, memory);
    }
}
