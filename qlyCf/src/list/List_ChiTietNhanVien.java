package list;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import constraint.CRUD;
import model.ChiTietNhanVien;
import model.NhanVien;
import service.ChiTietNhanVien_DAO;
import service.NhanVien_DAO;

public class List_ChiTietNhanVien{
	private ChiTietNhanVien_DAO ctnv_dao;

	public List_ChiTietNhanVien() {
		ctnv_dao = new ChiTietNhanVien_DAO();
	}
	
	public List<ChiTietNhanVien> getAll() throws SQLException {
		return ctnv_dao.getAll();
	}
	
	public ChiTietNhanVien get(int id) throws SQLException {
		return ctnv_dao.get(id);
	}
	
	public boolean add(ChiTietNhanVien t) throws SQLException {
		if(ctnv_dao.getAll().contains(t)) {
			return false;
		}
		ctnv_dao.save(t);
		return true;
	}
	
	public boolean update(ChiTietNhanVien t) throws SQLException {
		try {
			ctnv_dao.update(t);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean remove(ChiTietNhanVien t) {
		try {
			ctnv_dao.delete(t);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean removeById(int id) {
		try {
			ctnv_dao.deleteById(id);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
