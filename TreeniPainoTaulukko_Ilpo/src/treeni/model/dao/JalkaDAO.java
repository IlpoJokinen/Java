package treeni.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import treeni.model.Jalat;

public class JalkaDAO extends DataAccessObject {

	public void addJalat(Jalat jalkatreeni) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			String SqlInsert = "INSERT INTO jalkatreeni(id, kyykkyTulos, hackTulos, prassiTulos, takareidetTulos, askKavelTulos, pohkeetTulos)"
					+ "VALUES (?,?,?,?,?,?,?)";
			stmt = conn.prepareStatement(SqlInsert);
			stmt.setInt(1, jalkatreeni.getId());
			stmt.setDouble(2, jalkatreeni.getKyykkyTulos());
			stmt.setDouble(3, jalkatreeni.getHackTulos());
			stmt.setDouble(4, jalkatreeni.getPrassiTulos());
			stmt.setDouble(5, jalkatreeni.getTakareidetTulos());
			stmt.setDouble(6, jalkatreeni.getAskKavelTulos());
			stmt.setDouble(7, jalkatreeni.getPohkeetTulos());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmt, conn);
		}
	}
	public ArrayList<Jalat> findAll() {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Jalat> jalkatreenit = new ArrayList<Jalat>();
		Jalat jalkatreeni = null;
		try {
			conn = getConnection();
			String SqlSelect = "SELECT id, kyykkyTulos, hackTulos, prassiTulos, takareidetTulos, askKavelTulos, pohkeetTulos FROM jalkatreeni;";
			stmt = conn.prepareStatement(SqlSelect);
			rs = stmt.executeQuery();
			while(rs.next()) {
				jalkatreeni = readJalat(rs);
				jalkatreenit.add(jalkatreeni);
				}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, stmt, conn);
		}
		return jalkatreenit;
	}
	public void updateJalat(Jalat jalkatreeni) throws SQLException {
		Connection conn = null;
		PreparedStatement stmtUpdate = null;
		try {
			// Luodaan yhteys
			conn = getConnection();
			String SqlSelect = "UPDATE jalkatreeni SET kyykkyTulos = ?, hackTulos = ?, prassiTulos = ?, takareidetTulos = ?, askKavelTulos = ?,"
					+ " pohkeetTulos = ? WHERE id = ?;";
			stmtUpdate = conn.prepareStatement(SqlSelect);
			stmtUpdate.setDouble(1, jalkatreeni.getKyykkyTulos());
			stmtUpdate.setDouble(2, jalkatreeni.getHackTulos());
			stmtUpdate.setDouble(3, jalkatreeni.getPrassiTulos());
			stmtUpdate.setDouble(4, jalkatreeni.getTakareidetTulos());
			stmtUpdate.setDouble(5, jalkatreeni.getAskKavelTulos());
			stmtUpdate.setDouble(6, jalkatreeni.getPohkeetTulos());
			stmtUpdate.setInt(7, jalkatreeni.getId());
			// L‰hetet‰‰n komento:
			stmtUpdate.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtUpdate,conn);
		}
	}
	private Jalat readJalat(ResultSet rs) {
		
		try {
			int id = rs.getInt("id");
			double kyykkyTulos = rs.getDouble("kyykkyTulos");
			double hackTulos = rs.getDouble("hackTulos");
			double prassiTulos = rs.getDouble("prassiTulos");
			double takareidetTulos = rs.getDouble("takareidetTulos");
			double askKavelTulos = rs.getDouble("askKavelTulos");
			double pohkeetTulos = rs.getDouble("pohkeetTulos");
			
			return new Jalat(id, kyykkyTulos, hackTulos, prassiTulos, takareidetTulos, askKavelTulos, pohkeetTulos);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void removeJalat(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement stmtDelete = null;
		
		try {
			//luodaan yhteys
			conn = getConnection();
			//Poistetaan treeni tietokannasta:
			String sqlInsert = "DELETE FROM jalkatreeni WHERE id = ?";
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
