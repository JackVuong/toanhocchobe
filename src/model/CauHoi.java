package model;
/*
 * Ngay tao: 1-5-2016
 * Nguoi Tao : Luan
 * Lop Cau Hoi
 */
public class CauHoi {
	private String maCauHoi;
	private String cauHoi;
	private String DapAn1;
	private String DapAn2;
	private String DapAn3;
	private String DapAn4;
	private int DapAn;
	public CauHoi(String maCauHoi, String cauHoi, String dapAn1, String dapAn2,
			String dapAn3, String dapAn4, int dapAn) {
		super();
		this.maCauHoi = maCauHoi;
		this.cauHoi = cauHoi;
		DapAn1 = dapAn1;
		DapAn2 = dapAn2;
		DapAn3 = dapAn3;
		DapAn4 = dapAn4;
		DapAn = dapAn;
	}
	public String getMaCauHoi() {
		return maCauHoi;
	}
	public void setMaCauHoi(String maCauHoi) {
		this.maCauHoi = maCauHoi;
	}
	public String getCauHoi() {
		return cauHoi;
	}
	public void setCauHoi(String cauHoi) {
		this.cauHoi = cauHoi;
	}
	public String getDapAn1() {
		return DapAn1;
	}
	public void setDapAn1(String dapAn1) {
		DapAn1 = dapAn1;
	}
	public String getDapAn2() {
		return DapAn2;
	}
	public void setDapAn2(String dapAn2) {
		DapAn2 = dapAn2;
	}
	public String getDapAn3() {
		return DapAn3;
	}
	public void setDapAn3(String dapAn3) {
		DapAn3 = dapAn3;
	}
	public String getDapAn4() {
		return DapAn4;
	}
	public void setDapAn4(String dapAn4) {
		DapAn4 = dapAn4;
	}
	public int getDapAn() {
		return DapAn;
	}
	public void setDapAn(int dapAn) {
		DapAn = dapAn;
	}
	
	

}
