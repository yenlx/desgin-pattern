package creational.factory;

public class Server extends Computer {
    public String name;
    public String memory;

    public Server(String name, String memory) {
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
