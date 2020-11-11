package creational.abstractfactory;

public abstract class Computer {
     abstract String getName();

    abstract String getMemory();

    @Override
    public String toString() {
        return "Name = " + getName() + "; Mem = " + getMemory();
    }

}
