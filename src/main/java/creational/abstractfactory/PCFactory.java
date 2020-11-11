package creational.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {
    String name;
    String memory;

    public PCFactory(String name, String memory) {
        this.name = name;
        this.memory = memory;
    }

    public Computer createComputer() {
        return new PC(name, memory);
    }
}
