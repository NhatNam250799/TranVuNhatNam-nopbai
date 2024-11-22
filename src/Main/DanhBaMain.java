package Main;

import java.util.List;
import java.util.Scanner;

import Controller.ThirdNameController;
import entity.ThirdName;

public class DanhBaMain {
	public static void main(String[] args) {
		ThirdNameController thirdNamecontroller = new ThirdNameController();
		int choice;
		List<ThirdName> thirdNames;
		while (true) {
			System.out.println("---- CHUONG TRINH QUAN LY DANH BA ----");
			System.out.println("1. Xem danh sach");
			System.out.println("2. Thêm mới");
			System.out.println("3. Cập nhật");
			System.out.println("4. Xóa");
			System.out.println("5. Tìm kiếm");
			System.out.println("6. Đọc từ file");
			System.out.println("7. Ghi vào file");
			System.out.print("Chọn chức năng: ");
			Scanner scanner = new Scanner(System.in);
			choice = inputChoice();
			switch (choice) {
			case 1:

				break;
			case 2:
				thirdNamecontroller.addThirdName();
				System.out.println("Thêm mới thành công");
				break;
			case 3:
				thirdNamecontroller.updateThirdName();
				System.out.println("Sửa thông tin học sinh");
				break;
			case 4:
				System.out.print("Nhập id cần xóa: ");
                int id = Integer.parseInt(scanner.nextLine());
                //thirdNamecontroller.deleteThirdName(id);
				break;
			case 5:

				break;
			case 6:
				thirdNamecontroller.readThirdName();
				break;
			case 7:
				thirdNamecontroller.saveToFIle();
				return;
			}
		}

	}
    
    private static int inputChoice() {
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai lựa chọn. Mời bạn nhập lại");
        } catch (Exception e) {
            System.out.println("Lỗi khác");
        }
        return 0;
    }
}
