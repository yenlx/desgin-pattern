package creational.abstractfactory;

public class ComputerFactory {
    static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
