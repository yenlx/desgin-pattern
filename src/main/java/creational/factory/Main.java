package creational.factory;

public class Main {
    /**
     * Factory Design Pattern áp dụng nguyên tắc Close-Open principle
     * Áp dụng chỉ khi có 2 đối tượng có cùng 1 loại phương thức , sự dụng tính chất trừu tượng của OOP
     * Áp dụng Design Pattern này thay thế câu statement IF-ELSE
     *      Thay vì biểu diễn mỗi block code của if hay else cùng trên 1 class xử lý thì tách nó ra những class con
     *      Design Pattern này có 1 interface để biểu diễn những method cần thể hiện lại cho lớp đối tượng con khác nhau (Computer)
     *          Class PC/Server sẽ kế thừa và thể hiện lại nó
     *      Nhiệm vụ quyết định class trả về theo mong muốn của ng dùng là do Class Factory(trung gian). Nó quyết định khởi tạo đối tượng  nào và sẽ trả về đối tượng nào
     * Việc mở rộng thêm 1 đối tượng(ví dụ : thêm đối tượng Laptop) ta chỉ cần implement lại class Computer và thể hiện lại những thuộc tính phù hợp của đối tượng đó
     *      Sau đó thì khai báo thêm điều kiện để thỏa mãn điều kiện trả về Laptop ở class Factory
     */
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(ComputerType.PC, "PC", "8Gb");
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "Server", "32Gb");

        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
