package Controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.ThirdName;

public class ThirdNameController {
	private List<ThirdNameController> thirdNames;
	private final String filePathString = "C:\\Users\\ASUS\\Documents\\file";
//	private static IThirdNameService service = new ThirdNameService();
//    public List<ThirdName> getAll() {
//        List<ThirdName> students = service.getAll();
//        return students;
//    }
	
	public void readThirdName() {
		List<ThirdName> thirdNames = readFromFile();
		if (thirdNames == null) {
			thirdNames = new ArrayList<>();
		}
	}

	public void saveToFIle() {
		try (ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(filePathString))) {
			ooStream.writeObject(thirdNames);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private List<ThirdName> readFromFile() {
		try (ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream(filePathString))) {
			return (List<ThirdName>) oiStream.readObject();

		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
	}

	public void addThirdName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện thoại: ");
		String phoneNumber = scanner.nextLine();
		if (!phoneNumber.matches("\\d{10}")) {
			System.out.println("Số điện thoại không hợp lệ!");
			return;
		}

		System.out.print("Nhập họ tên: ");
		String name = scanner.nextLine();

		System.out.print("Nhập giới tính: ");
		String gender = scanner.nextLine();

		System.out.print("Nhập địa chỉ: ");
		String address = scanner.nextLine();

		System.out.print("Nhập email: ");
		String email = scanner.nextLine();
		if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			System.out.println("Email không hợp lệ!");
			return;
		}
	}

	public void updateThirdName() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập họ và tên để cập nhật: ");
		String hoVaTen = scanner.nextLine();
		ThirdName thirdName = new ThirdName();
			if (hoVaTen != null && hoVaTen.equals(thirdName.getHoVaTen())) {
				System.out.println("Nhập tên mới: ");
				String name = scanner.nextLine();
				
				System.out.println("Nhập số điện thoại mới: ");
				int phoneNumber = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Nhập giới tính:");
				String gender = scanner.nextLine();
				
				System.out.print("Nhập địa chỉ: ");
				String address = scanner.nextLine();
				
				System.out.print("Nhập email: ");
				String email = scanner.nextLine();
				
				thirdName.setHoVaTen(name);
				thirdName.setGioiTinh(name);
				thirdName.setDiaChi(name);
				thirdName.setNgaySinh(name);
				thirdName.setEmail(name);
				System.out.println("Danh bạ cập nhật thành công");
				
				return;
			
		}
	}
	public void deleteThirdName(ThirdName thirdNames) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện thoại cần xóa: ");
		String sdt = scanner.nextLine();
		//thirdNames.
		//thirdNames.removeIf(ThirdName ->ThirdName.getSoDienThoai().equals(id));
		saveToFIle();
		System.out.println("Xóa số điện thoại danh bạ thành công :");
	}
	public void searchThirdName(List<ThirdNameController> thirdNameControllers) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Nhập số điện thoại hoặc họ tên cần tìm: ");
	    String keyword = scanner.nextLine();


	  
	}
	
	

	


}
