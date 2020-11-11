package creational.abstractfactory;


public class Server extends Computer {
    public String name;
    public String memory;

    public Server(String name, String memory) {
        this.name = name;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public String getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Name = " + getName() + "; Mem = " + getMemory();
    }
}
