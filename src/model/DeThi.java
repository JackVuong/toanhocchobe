package model;
/*
 * Ngay tao: 1-5-2016
 * Nguoi Tao : Luan
 * Lop De thi
 */

public class DeThi {
	private String maDT;
	private int lop;
	public String getMaDT() {
		return maDT;
	}
	public void setMaDT(String maDT) {
		this.maDT = maDT;
	}
	public int getLop() {
		return lop;
	}
	public void setLop(int lop) {
		this.lop = lop;
	}
	public DeThi(String maDT, int lop) {
		super();
		this.maDT = maDT;
		this.lop = lop;
	}

}
