package creational.builder;

public class Main {
    /**
     * Builder Design Pattern
     * Áp dụng để khởi tạo 1 Object với agrs required và nhiều args như là optional
     *      Việc khởi tạo Object expect sẽ thông qua 1 class trung gian của nó (prefix + Builder)
     *      Nếu chúng ta khởi tạo đối tượng gốc luôn với những args optional không cần thiết bằng NULL thì điều này khiến code rất khó đọc.
     *      Thay vì việc đó thì hãy để cho class trung gian đảm nhận việc này thông qua method tương tự SETTER()
     * Kết thúc việc khởi tạo đối tượng gốc thì class trung gian cung cấp 1 method build() để khởi tạo nó với đầu vào là những args cần thiết
     */
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500Gb", "8Gb")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(false)
                .build();

        System.out.println(computer.toString());
    }
}
