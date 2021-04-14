import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Human> humanList = new ArrayList<>();
    private static ArrayList<Room> roomList = new ArrayList<>();

    static {
        Human human1 = new Human(1, "aaa", "14/4");
        humanList.add(human1);
    }

    static {
        Room room1 = new Room(500000, "Phòng 1" ,"Vip");
        Room room2 = new Room(500000, "Phòng 2" ,"Vip");
        Room room3 = new Room(500000, "Phòng 3" ,"Vip");
        Room room4 = new Room(200000, "Phòng 4" ,"Bình dân");
        Room room5 = new Room(200000, "Phòng 5" ,"Bình dân");
        Room room6 = new Room(200000, "Phòng 6" ,"Bình dân");
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);
        roomList.add(room6);
    }

    public static void showHuman() {
        for (Human human : humanList) {
            System.out.println(human.toString());
        }
    }

    public static void addCustomer() {
        int id = inputId();
        String name = inputName();
        String birth = inputBirth();

        Human human = new Human(id, name, birth);
        humanList.add(human);
    }

    public static Human getCustomerById(int id) {
        Human human = null;
        for (Human human1 : humanList) {
            if (human1.getId() == id) {
                human = human1;
                break;
            }
        }
        return human;
    }

    public static void delCustomer(int id) {
        if (humanList != null) {
            humanList.remove(getCustomerById(id));
        } else {
            System.out.println("Không tìm được khách hàng với id trên!");
        }
    }

    public static void showRoom() {
        for (Room room : roomList) {
            System.out.println(room.toString());
        }
    }

    public static void addRoom() {
        String name = inputRoomName();
        String kind = inputKind();
        int price = inputPrice();

        Room room = new Room(price, name, kind);
        roomList.add(room);
    }

    public static Room getRoomByName(String name) {
        Room room = null;
        for (Room room1 : roomList) {
            if (room1.getName() == name) {
                room = room1;
            }
        }
        return room;
    }

    public static void rent(String nameRoom, int id) {
        Room room = Hotel.getRoomByName(nameRoom);

        if (room != null) {
            if (room.getHuman() == null) {
                Human human = Hotel.getCustomerById(id);
                room.setHuman(human);
            } else {
                System.out.println("Phòng đã có người thuê!");
            }
        } else {
            System.out.println("Phòng không tồn tại!");
        }
    }

    public static int getAmount(int days, int price) {
        int amount = days * price;
        return amount;
    }

    public static int inputId() {
        System.out.print("Nhập id khách hàng: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static String inputName() {
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        return name;
    }

    public static String inputBirth() {
        System.out.print("Nhập ngày sinh: ");
        String birth = scanner.nextLine();
        return birth;
    }

    public static String inputRoomName() {
        System.out.print("Nhập tên phòng: ");
        String name = scanner.nextLine();
        return name;
    }

    public static String inputKind() {
        System.out.print("Nhập kiểu phòng: ");
        String kind = scanner.nextLine();
        return kind;
    }

    public static int inputDays() {
        System.out.print("Nhập số ngày thuê phòng: ");
        int days = scanner.nextInt();
        return days;
    }

    public static int inputPrice() {
        System.out.print("Nhập giá tiền thuê phòng: ");
        int price = scanner.nextInt();
        return price;
    }
}
