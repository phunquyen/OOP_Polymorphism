import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap so luong nhan vien: ");
        int tongNhanVien = Integer.parseInt(scanner.nextLine());

        NhanVien[] mangNhanVien = new NhanVien[tongNhanVien];
        for (int i = 0; i < tongNhanVien; i++) {
            System.out.print("Ten nhan vien " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Nhan vien (1-Toan thoi gian; 2-Ban thoi gian): ");
            int laNhanVien = Integer.parseInt(scanner.nextLine());
            if (laNhanVien == 1) {
                System.out.print("Chuc vu nhan vien (1-Sep; 2-Linh): ");
                int chucVu = Integer.parseInt(scanner.nextLine());
                System.out.print("Ngay lam them: ");
                int ngayLamThem = Integer.parseInt(scanner.nextLine());
                mangNhanVien[i] = new NhanVienFullTime(ten, ngayLamThem, chucVu);
            } else {
                System.out.print("Gio lam: ");
                int gioLamViec = Integer.parseInt(scanner.nextLine());
                mangNhanVien[i] = new NhanVienPartTime(ten, gioLamViec);
            }
        }

        System.out.println("Ket qua tinh luong");

        for (NhanVien nhanVien : mangNhanVien) {
            nhanVien.tinhLuong();
            nhanVien.xuatThongTin();
        }
    }

}
