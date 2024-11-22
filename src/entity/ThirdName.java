package entity;

public class ThirdName {
	private int soDienThoai;
	private String nhom;
	private String hoVaTen;
	private String gioiTinh;
	private String diaChi;
	private String ngaySinh;
	private String email;

	public ThirdName() {
		super();
	}

	public ThirdName(int soDienThoai, String nhom, String hoVaTen, String gioiTinh, String diaChi, String ngaySinh,
			String email) {
		super();
		this.soDienThoai = soDienThoai;
		this.nhom = nhom;
		this.hoVaTen = hoVaTen;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.email = email;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getNhom() {
		return nhom;
	}

	public void setNhom(String nhom) {
		this.nhom = nhom;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "DanhBa [soDienThoai=" + soDienThoai + ", nhom=" + nhom + ", hoVaTen=" + hoVaTen + ", gioiTinh="
				+ gioiTinh + ", diaChi=" + diaChi + ", ngaySinh=" + ngaySinh + ", email=" + email + "]";
	}

}
