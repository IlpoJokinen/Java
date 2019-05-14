package treeni.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import treeni.model.SelkaTakareidet;

public class SelkaDAO extends DataAccessObject {

	public void addSelkaTakareidet(SelkaTakareidet selkatreeni) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			String SqlInsert = "INSERT INTO selkatreeni(id, kulmasoutuTulos, ylaTaljaTulos, yhdKadenSoutuTulos, alataljaTulos, sjmvTulos, takareisiTulos)"
					+ " VALUES (?,?,?,?,?,?,?)";
			stmt = conn.prepareStatement(SqlInsert);
			stmt.setInt(1, selkatreeni.getId());
			stmt.setDouble(2, selkatreeni.getKulmasoutuTulos());
			stmt.setDouble(3, selkatreeni.getYlaTaljaTulos());
			stmt.setDouble(4, selkatreeni.getYhdKadenSoutuTulos());
			stmt.setDouble(5, selkatreeni.getAlataljaTulos());
			stmt.setDouble(6, selkatreeni.getSjmvTulos());
			stmt.setDouble(7, selkatreeni.getTakareisiTulos());
			stmt.executeUpdate(); //p‰ivitet‰‰n tietokantaan
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmt, conn);
		}
	}
	public ArrayList<SelkaTakareidet> findAll() {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<SelkaTakareidet> selkatreenit = new ArrayList<SelkaTakareidet>();
		SelkaTakareidet selkatreeni = null;
		try {
			conn = getConnection();
			String SqlSelect = "SELECT id, kulmasoutuTulos, ylaTaljaTulos, yhdKadenSoutuTulos, alataljaTulos, sjmvTulos, takareisiTulos FROM selkatreeni;";
			stmt = conn.prepareStatement(SqlSelect);
			rs = stmt.executeQuery();
			while(rs.next()) {
				selkatreeni = readSelkaTakareidet(rs);
				selkatreenit.add(selkatreeni);
			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, stmt, conn);
		}
		return selkatreenit;
	}

	private SelkaTakareidet readSelkaTakareidet(ResultSet rs) {
		
		try {
			int id = rs.getInt("id");
			double kulmasoutuTulos = rs.getDouble("kulmasoutuTulos");
			double ylaTaljaTulos = rs.getDouble("ylaTaljaTulos");
			double yhdKadenSoutuTulos = rs.getDouble("yhdKadenSoutuTulos");
			double alataljaTulos = rs.getDouble("alataljaTulos");
			double sjmvTulos = rs.getDouble("sjmvTulos");
			double takareisiTulos = rs.getDouble("takareisiTulos");
			
			return new SelkaTakareidet(id, kulmasoutuTulos, ylaTaljaTulos, yhdKadenSoutuTulos, alataljaTulos, sjmvTulos, takareisiTulos);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void updateSelkaTakareidet(SelkaTakareidet selkatreeni) throws SQLException {
		Connection conn = null;
		PreparedStatement stmtUpdate = null;
		try {
			conn = getConnection();
			String SqlSelect = "UPDATE selkatreeni SET kulmasoutuTulos = ?, ylaTaljaTulos = ?, yhdKadenSoutuTulos = ?, alataljaTulos = ?, sjmvTulos = ?,"
					+ "takareisiTulos = ? WHERE id = ?;";
			stmtUpdate = conn.prepareStatement(SqlSelect);
			stmtUpdate.setDouble(1, selkatreeni.getKulmasoutuTulos());
			stmtUpdate.setDouble(2, selkatreeni.getYlaTaljaTulos());
			stmtUpdate.setDouble(3, selkatreeni.getYhdKadenSoutuTulos());
			stmtUpdate.setDouble(4, selkatreeni.getAlataljaTulos());
			stmtUpdate.setDouble(5, selkatreeni.getSjmvTulos());
			stmtUpdate.setDouble(6, selkatreeni.getTakareisiTulos());
			stmtUpdate.setInt(7, selkatreeni.getId());
			// L‰hetet‰‰n komento:
			stmtUpdate.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtUpdate,conn);
		}
	}
	public void removeSelkaTakareidet(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement stmtDelete = null;
		
		try {
			//luodaan yhteys
			conn = getConnection();
			//Poistetaan treeni tietokannasta:
			String sqlInsert = "DELETE FROM selkatreeni WHERE id = ?";
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
