package database;

/*
 * Ngay tao: 1-5-2016
 * Nguoi Tao : Luan
 * Lop DbManager ket noi co so du lieu
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.CauHoi;

public class DbManager {

	public Connection connection;

	public void openConnection() {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager
					.getConnection("jdbc:sqlserver://LUAN\\VUONGGIA;user=sa;password=laptophpi5;databaseName=ToanHocChoBe");
		} catch (ClassNotFoundException e) {
			System.out.println("loi");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("loi");
			e.printStackTrace();
		}

	}

	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Ham lay danh sach cau hoi bang ma de thi level1
	public List<CauHoi> getDSCauHoi1(String maDeThi) {
		this.openConnection();
		List<CauHoi> list = new ArrayList<CauHoi>();

		String sql = "Select CauHoi.MaCauHoi,CauHoi.CauHoi,CauHoi.DapAn1,CauHoi.DapAn2,CauHoi.DapAn3,CauHoi.DapAn4,CauHoi.DapAn from DeThi_CauHoi,CauHoi where DeThi_CauHoi.MaDeThi = 'DT001' and DeThi_CauHoi.MaCauHoi = CauHoi.MaCauHoi";
		try {
			Statement stm = connection.createStatement();
			ResultSet data = stm.executeQuery(sql);

			while (data.next()) {

				String  maCH = data.getString(1);
				String cauHoi = data.getString(2);
				String dapAn1 = data.getString(3);
				String dapAn2 = data.getString(4);
				String dapAn3 = data.getString(5);
				String dapAn4 = data.getString(6);
				int dapAn = data.getInt(7);

				CauHoi ch = new CauHoi(maCH,cauHoi,dapAn1,dapAn2,dapAn3,dapAn4,dapAn);
				list.add(ch);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.closeConnection();

		return list;
	}
	
	//Ham lay danh sach cau hoi level2
	public List<CauHoi> getDSCauHoi2(String maDeThi) {
		this.openConnection();
		List<CauHoi> list = new ArrayList<CauHoi>();

		String sql = "Select CauHoi.MaCauHoi,CauHoi.CauHoi,CauHoi.DapAn1,CauHoi.DapAn2,CauHoi.DapAn3,CauHoi.DapAn4,CauHoi.DapAn from DeThi_CauHoi,CauHoi where DeThi_CauHoi.MaDeThi = 'DT002' and DeThi_CauHoi.MaCauHoi = CauHoi.MaCauHoi";
		try {
			Statement stm = connection.createStatement();
			ResultSet data = stm.executeQuery(sql);

			while (data.next()) {

				String  maCH = data.getString(1);
				String cauHoi = data.getString(2);
				String dapAn1 = data.getString(3);
				String dapAn2 = data.getString(4);
				String dapAn3 = data.getString(5);
				String dapAn4 = data.getString(6);
				int dapAn = data.getInt(7);

				CauHoi ch = new CauHoi(maCH,cauHoi,dapAn1,dapAn2,dapAn3,dapAn4,dapAn);
				list.add(ch);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.closeConnection();

		return list;
	}
	/*public static void main(String[] args) {
		DbManager d = new DbManager();
		//d.openConnection();
		List<CauHoi> l = d.getDSCauHoi("1");
		System.out.println(l.size());
	}
	/*
	 * private boolean addProduct(Product s, String table) {
	 * 
	 * String sql = "insert into " + table + " values(?,?)"; PreparedStatement
	 * stm; try { stm = connection.prepareStatement(sql); stm.setString(1,
	 * s.getName()); stm.setDouble(2, s.getPrice());
	 * 
	 * int rows = stm.executeUpdate();
	 * 
	 * stm.close();
	 * 
	 * return rows == 1; } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * return false; }
	 * 
	 * public boolean addPhone(Phone s) { return this.addProduct(s,
	 * "DIENTHOAI"); }
	 * 
	 * public boolean addAccessory(Accessory s) { return this.addProduct(s,
	 * "PHUKIEN"); }
	 * 
	 * public List<Phone> getAllPhone() {
	 * 
	 * List<Phone> list = new ArrayList<Phone>();
	 * 
	 * String sql = "select * from DIENTHOAI"; try { Statement stm =
	 * connection.createStatement(); ResultSet data = stm.executeQuery(sql);
	 * 
	 * while (data.next()) {
	 * 
	 * int id = data.getInt(1); String name = data.getString(2); double price =
	 * data.getDouble(3);
	 * 
	 * Phone p = new Phone(id, name, price); list.add(p); }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * return list; }
	 * 
	 * public List<Accessory> getAllAccessory() {
	 * 
	 * List<Accessory> list = new ArrayList<Accessory>();
	 * 
	 * String sql = "select * from PHUKIEN"; try { Statement stm =
	 * connection.createStatement(); ResultSet data = stm.executeQuery(sql);
	 * 
	 * while (data.next()) {
	 * 
	 * int id = data.getInt(1); String name = data.getString(2); double price =
	 * data.getDouble(3);
	 * 
	 * Accessory p = new Accessory(id, name, price); list.add(p); }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * return list; } public Phone getPhone(int id) {
	 * 
	 * Phone p = null;
	 * 
	 * String sql = "select * from DIENTHOAI where id = ?"; try {
	 * PreparedStatement stm = connection.prepareStatement(sql); stm.setInt(1,
	 * id);
	 * 
	 * ResultSet data = stm.executeQuery();
	 * 
	 * if (data.next()) {
	 * 
	 * String name = data.getString(2); double price = data.getDouble(3);
	 * 
	 * p = new Phone(id, name, price); }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * return p; }
	 * 
	 * public Accessory getAccessory(int id) {
	 * 
	 * Accessory p = null;
	 * 
	 * String sql = "select * from PHUKIEN where id = ?"; try {
	 * PreparedStatement stm = connection.prepareStatement(sql); stm.setInt(1,
	 * id);
	 * 
	 * ResultSet data = stm.executeQuery();
	 * 
	 * if (data.next()) {
	 * 
	 * String name = data.getString(2); double price = data.getDouble(3);
	 * 
	 * p = new Accessory(id, name, price); }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * return p; }
	 */

}
