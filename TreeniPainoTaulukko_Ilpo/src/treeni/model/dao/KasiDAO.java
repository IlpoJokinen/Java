package treeni.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import treeni.model.OlatKadet;

public class KasiDAO extends DataAccessObject {

	public void addOlatKadet(OlatKadet kasitreeni) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			String SqlInsert = "INSERT INTO kasitreeni(id, pystPunnerTulos, takaolatTulos, vipariSivTulos, ojentajaTaljaTulos, hauisScottTulos, ojentajaPunnerTulos,"
					+ " hauisKPTulos) VALUES (?,?,?,?,?,?,?,?)";
			stmt = conn.prepareStatement(SqlInsert);
			stmt.setInt(1, kasitreeni.getId());
			stmt.setDouble(2, kasitreeni.getPystPunnerTulos());
			stmt.setDouble(3, kasitreeni.getTakaolatTulos());
			stmt.setDouble(4, kasitreeni.getVipariSivTulos());
			stmt.setDouble(5, kasitreeni.getOjentajaTaljaTulos());
			stmt.setDouble(6, kasitreeni.getHauisScottTulos());
			stmt.setDouble(7, kasitreeni.getOjentajaPunnerTulos());
			stmt.setDouble(8, kasitreeni.getHauisKPTulos());
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmt, conn);
		}
	}
	public ArrayList<OlatKadet> findAll() {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<OlatKadet> kasitreenit = new ArrayList<OlatKadet>();
		OlatKadet kasitreeni = null;
		try {
			conn = getConnection();
			String SqlSelect = "SELECT id, pystPunnerTulos, takaolatTulos, vipariSivTulos, ojentajaTaljaTulos, hauisScottTulos, ojentajaPunnerTulos, hauisKPTulos FROM kasitreeni;";
			stmt = conn.prepareStatement(SqlSelect);
			rs = stmt.executeQuery();
			while(rs.next()) {
				kasitreeni = readOlatKadet(rs);
				kasitreenit.add(kasitreeni);
			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, stmt, conn);
		}
		return kasitreenit;
	}
	private OlatKadet readOlatKadet(ResultSet rs) {
	
	try {
		int id = rs.getInt("id");
		double pystPunnerTulos = rs.getDouble("pystPunnerTulos");
		double takaolatTulos = rs.getDouble("takaolatTulos");
		double vipariSivTulos = rs.getDouble("vipariSivTulos");
		double ojentajaTaljaTulos = rs.getDouble("ojentajaTaljaTulos");
		double hauisScottTulos = rs.getDouble("hauisScottTulos");
		double ojentajaPunnerTulos = rs.getDouble("ojentajaPunnerTulos");
		double hauisKPTulos = rs.getDouble("hauisKPTulos");
		
		return new OlatKadet(id, pystPunnerTulos, takaolatTulos, vipariSivTulos, ojentajaTaljaTulos, hauisScottTulos, ojentajaPunnerTulos, hauisKPTulos);
	} catch(SQLException e) {
		throw new RuntimeException(e);
	}
	}
	public void updateOlatKadet(OlatKadet kasitreeni) throws SQLException {
		Connection conn = null;
		PreparedStatement stmtUpdate = null;
		try {
			conn = getConnection();
			String SqlSelect = "UPDATE kasitreeni SET pystPunnerTulos = ?, takaolatTulos = ?, vipariSivTulos = ?, ojentajaTaljaTulos = ?, hauisScottTulos = ?,"
					+ "ojentajaPunnerTulos = ?, hauisKPTulos = ? WHERE id = ?;";
			stmtUpdate = conn.prepareStatement(SqlSelect);
			stmtUpdate.setDouble(1, kasitreeni.getPystPunnerTulos());
			stmtUpdate.setDouble(2, kasitreeni.getTakaolatTulos());
			stmtUpdate.setDouble(3, kasitreeni.getVipariSivTulos());
			stmtUpdate.setDouble(4, kasitreeni.getOjentajaTaljaTulos());
			stmtUpdate.setDouble(5, kasitreeni.getHauisScottTulos());
			stmtUpdate.setDouble(6, kasitreeni.getOjentajaPunnerTulos());
			stmtUpdate.setDouble(7, kasitreeni.getHauisKPTulos());
			stmtUpdate.setInt(8, kasitreeni.getId());
			// L‰hetet‰‰n komento:
			stmtUpdate.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtUpdate,conn);
		}
	}
	public void removeOlatKadet(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement stmtDelete = null;
		
		try {
			//luodaan yhteys
			conn = getConnection();
			//Poistetaan treeni tietokannasta:
			String sqlInsert = "DELETE FROM kasitreeni WHERE id = ?";
			stmtDelete = conn.prepareStatement(sqlInsert);
			stmtDelete.setInt(1, id);
			stmtDelete.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtDelete, conn); //suljetaan statement ja yhteys
		}
	}
}
