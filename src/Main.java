import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;

        while (true) {
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ KHÁCH SẠN-----");
            System.out.println("1. Xem danh sách khách hàng");
            System.out.println("2. Thêm mới khách hàng");
            System.out.println("3. Xóa khách hàng");
            System.out.println("4. Xem danh sách phòng");
            System.out.println("5. Thêm mới phòng");
            System.out.println("6. Cho thuê phòng");
            System.out.println("7. Tính tiền thuê phòng");
            System.out.println("0. Thoát");
            System.out.println("Mời chọn chức năng: ");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    Hotel.showHuman();
                    System.out.println("\n");
                    break;
                case 2:
                    Hotel.addCustomer();
                    System.out.println("Đã thêm khách hàng!" + "\n");
                    break;
                case 3:
                    id = Hotel.inputId();
                    Hotel.delCustomer(id);
                    System.out.println("Đã xóa khách hàng!" + "\n");
                    break;
                case 4:
                    Hotel.showRoom();
                    System.out.println("\n");
                    break;
                case 5:
                    Hotel.addRoom();
                    System.out.println("Đã thêm phòng!" + "\n");
                    break;
                case 6:
                    id = Hotel.inputId();
                    String name = Hotel.inputRoomName();
                    Hotel.rent(name, id);
                    System.out.println("Đã cho thuê phòng!" + "\n");
                    break;
                case 7:
                    Room room = new Room();
                    int days = Hotel.inputDays();
                    int price = room.getPrice();
                    Hotel.getAmount(days, price);
                    System.out.println("\n");
                    break;
                case 0:
                    System.out.println("Đã thoát!");
                    System.exit(0);
                    break;
            }
        }
    }
}
