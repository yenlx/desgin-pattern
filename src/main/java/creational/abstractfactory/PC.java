package creational.abstractfactory;

public class PC extends Computer {

    String name;
    String memory;

    PC(String name, String memory) {
        this.name = name;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public String getMemory() {
        return memory;
    }


}
