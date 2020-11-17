package creational.abstractfactory;

public class Main {
    /**
     * Abstract Factory Design Pattern cũng như Factory Design Pattern đều tuân thủ Close-Open principle
     * Sự khác nhau nằm ở chỗ Abstract Factory cho phép tạo đối tượng mà k cần truyền vào type
     *      Mỗi đối tượng PC/Server đều có 1 Factory của riêng nó với 1 method Create Object được implement từ AbstractFactory
     *      Có 1 class Factory cũng để quyết định sẽ khởi tạo và trả về đối tượng nào
     *          Nhưng khác nằm ở chỗ nó nhận vào 1 AbstractFactory (getComputer) chứ k dùng statement IF-ELSE để filter và trả về
     *              Điều này sau khi thiết kế xong pattern việc mở rộng thực hiện dễ dàng hơn . Không cần sửa đổi code trong Factory
     *                  Mà nó phụ thuộc vào khi khai báo input của ComputerFactory
     */
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("PC", "8Gb"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("Server", "32Gb"));

        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
