package ra.bt5;

import java.util.Scanner;
// BÀI TẬP LỚN, CÒN CHƯA HOÀN THÀNH
public class Main {
    static Student[] studentList = new Student[100];
    static byte choice;
    static int maHS;
    static String tenHS;
    static byte tuoiHS;
    static boolean gioiTinh;
    static String diaChi;
    static int soDienThoai;

    public static void main(String[] args) {

//        Tạo menu chức năng
//        Cần trả lời câu hỏi là khi khởi tạo một danh sách gồm 100 đối tượng Student mặc định như thế này thì cái gì chứa trong mảng kia
//        Hỏi chatGPT: what will happen when i create an array includes  user-defined class's objects
        hienThiMenu();

    }

    public static void hienThiMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lựa chọn thao tác muốn thực hiện từ menu dưới đây");
        System.out.println("1. Hiển thị danh sách tất cả học sinh\n2. Thêm mới học sinh\n3. Sửa đổi thông tin học sinh dựa vào mã học sinh\n4. Xóa học sinh\n5. Thoát");
        byte choice = sc.nextByte();
        sc.nextLine();
        switch (choice) {
            case 1:
                hienThiDanhSachTatCaHocSinh(studentList);
                break;
            case 2:
                themMoiHocSinh();
                break;
            case 3:
                suaThongTinHocSinh();
                break;
            case 4:
                xoaHocSinh();
                break;
            case 5:
                System.exit(0);
                break;

        }
        if (choice < 1 || choice > 5) {
            System.out.println("Vui lòng nhập vào số trong khoảng từ 1 đến 5");
        }
    }

    public static boolean kiemTraDanhSachTrong(Student[] studentList) {
//        nếu tất cả các phần tử trong studentList đều là null thì danh sách là danh sách trống
//        chỉ cần một phần từ khác null thôi thì danh sách sẽ không trống
//        trả về true là danh sách trống

        boolean flag = true;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int timViTriHocSinhTrongDanhSach(Student[] studentList, int maHS) {
        int index = -1;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].maHS == maHS) {
                index = i;
            }
        }
        return index;
    }

    public static void quayLaiDanhSach() {
        System.out.println("Tiếp theo bạn muốn làm gì?");
        System.out.println("1. Quay lại menu ban đầu\n2. Thoát.");
        Scanner sc = new Scanner(System.in);
        byte choice = sc.nextByte();
        switch (choice) {
            case 1:
                hienThiMenu();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }

    public static void quayLaiDanhSachSua() {
        System.out.println("Tiếp theo bạn muốn làm gì?");
        System.out.println("1. Quay lại menu ban đầu\n2. Quay lại menu sửa thông tin\n3. Thoát.");
        Scanner sc = new Scanner(System.in);
        byte choice = sc.nextByte();
        sc.nextLine();
        switch (choice) {
            case 1:
                hienThiMenu();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }

    public static void hienThiDanhSachTatCaHocSinh(Student[] studentList) {
//        Hiển thị danh sách tất cả học sinh đòi hỏi phải:
//        + Gọi đến studentList lưu trữ thông tin về tất cả các học sinh
//        + Chạy vòng lặp để lấy ra thông tin về tên học sinh studentList[i].getTenHS() và in ra
//        + => có vấn đề là nếu khai báo mảng studentList ở trong phương thức main() thì sẽ không thể truy cập được
//        + => cần truyền studentList làm đối số vào hàm này
        byte count = 1;
        if (kiemTraDanhSachTrong(studentList)) {
            System.out.println("Danh sách học sinh đang trống!");
            quayLaiDanhSach();
        } else {
            System.out.println("Các học sinh hiện trong danh sách bao gồm: ");

            for (int i = 0; i < studentList.length; i++) {
                if (studentList[i] != null) {
                    System.out.println(count + ". " + studentList[i].tenHS);
                    count++;
                }
            }
            quayLaiDanhSach();
        }
    }

    public static void themMoiHocSinh() {
        //                    logic thêm mới học sinh
//                    cần sử dụng tới phương thức khởi tạo
//                    cần lấy các thông tin tương ứng từ phía người dùng
//                    cần sử dụng thông tin nhận được từ người dùng, khởi tạo đối tượng và gán vào vị trí còn trống
//                    LẤY THÔNG TIN TỪ NGƯỜI DÙNG
//        TODO: Cần kiểm tra mã học sinh nhập vào đã tồn tại hay chưa trước khi quyết định cho thêm
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn đã lựa chọn thêm mới học sinh.");
        System.out.println("Vui lòng nhập vào các thông tin theo yêu cầu bên dưới: ");
        System.out.print("Nhập vào mã học sinh: ");
        maHS = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập vào tên học sinh: ");
        tenHS = sc.nextLine();
        System.out.print("Nhập vào tuổi học sinh: ");
        tuoiHS = sc.nextByte();
        System.out.print("Nhập vào giới tính (Nhập Nam nếu là Nam): ");
        gioiTinh = sc.nextLine() == "Nam";
        sc.nextLine();
        System.out.print("Nhập vào địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập vào số điện thoại: ");
        soDienThoai = sc.nextInt();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = new Student(maHS, tenHS, tuoiHS, gioiTinh, diaChi, soDienThoai);
                System.out.println("Bạn đã thêm mới học sinh thành công.\n");
                break;
            }
        }
        quayLaiDanhSach();
    }

    public static void suaThongTinHocSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào mã học sinh muốn sửa thông tin: ");
        int suaMaHS = sc.nextInt();
        int index = timViTriHocSinhTrongDanhSach(studentList, suaMaHS);
        if(index == -1){
            System.out.println("Không tồn tại mã học sinh này!");
            quayLaiDanhSach();
        } else {
            System.out.println("Lựa chọn loại thông tin muốn sửa:");
            System.out.println("1. Tên học sinh\n2. Tuổi\n3. Giới tính\n4. Địa chỉ\n5. Số điện thoại\n6. Quay lại menu\n7. Thoát");
            byte choice = sc.nextByte();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập vào tên mới: ");
                    String tenMoiHS = sc.nextLine();
                    studentList[index].setTenHS(tenMoiHS);
                    quayLaiDanhSachSua();
                    break;
                case 2:
                    System.out.print("Nhập vào tuổi mới: ");
                    byte tuoiMoiHS = sc.nextByte();
                    sc.nextLine();
                    studentList[index].setTuoiHS(tuoiMoiHS);
                    quayLaiDanhSachSua();
                    break;
                case 3:
                    System.out.print("Nhập vào giới tính mới (Nhập vào Nam nếu là nam): ");
                    String str = sc.nextLine();
                    boolean gioiTinhMoi = str == "Nam" ? true : false;
                    studentList[index].setGioiTinh(gioiTinhMoi);
                    quayLaiDanhSachSua();
                    break;
                case 4:
                    System.out.print("Nhập vào địa chỉ mới: ");
                    String diaChiMoi = sc.nextLine();
                    studentList[index].setDiaChi(diaChiMoi);
                    quayLaiDanhSachSua();
                    break;
                case 5:
                    System.out.print("Nhập vào số điện thoại mới: ");
                    int soDienThoaiMoi = sc.nextInt();
                    studentList[index].setSoDienThoai(soDienThoaiMoi);
                    quayLaiDanhSachSua();
                    break;
            }
        }


    }

    public static void xoaHocSinh() {
    }


}
