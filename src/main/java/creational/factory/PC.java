package creational.factory;

public class PC extends Computer {
    public String name;
    public String memory;

    public PC(String name, String memory) {
        this.name = name;
        this.memory = memory;
    }

    String getName() {
        return name;
    }

    String getMemory() {
        return memory;
    }
}
