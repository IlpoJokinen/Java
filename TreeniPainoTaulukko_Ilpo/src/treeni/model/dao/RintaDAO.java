package treeni.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import treeni.model.RintaOlkaKadet;

public class RintaDAO extends DataAccessObject{

	public ArrayList<RintaOlkaKadet> findAll() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<RintaOlkaKadet> rintatreenit = new ArrayList<RintaOlkaKadet>();
		RintaOlkaKadet rintatreeni = null;
		
		try {
			// Luodaan yhteys
			conn = getConnection();
			// Luodaan komento: haetaan kaikki rivit RintaOlkaKadet-taulusta
			String SqlSelect = "SELECT id, penkkiTulos, vinopenkkiTulos, ristitaljaTulos, flyesTulos, takaolkaTulos, vipariSTulos,"
					+ " vipariETulos, kapPenkkiTulos, hauiskaantoTulos FROM rintatreeni;";
			// Valmistellaan komento:
			stmt = conn.prepareStatement(SqlSelect);
			// L‰hetet‰‰n komento:
			rs = stmt.executeQuery();
			// K‰yd‰‰n tulostaulun rivit l‰pi ja luetaan readRintaOlkaKadet()-metodilla:
			while(rs.next()) {
				rintatreeni = readRintaOlkaKadet(rs);
				// lis‰t‰‰n treeni listaan
				rintatreenit.add(rintatreeni);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs,stmt,conn); //Suljetaan
		}
		return rintatreenit;
	}
	public void updateRintaOlkaKadet (RintaOlkaKadet rintatreeni) throws SQLException {
		Connection conn = null;
		PreparedStatement stmtUpdate = null;
		try {
			// Luodaan yhteys
			conn = getConnection();
			// Luodaan komento: haetaan kaikki rivit RintaOlkaKadet-taulusta
			String SqlSelect = "UPDATE rintatreeni SET penkkiTulos = ?, vinopenkkiTulos = ?, ristitaljaTulos = ?, flyesTulos = ?, takaolkaTulos = ?,"
					+ " vipariSTulos = ?, vipariETulos = ?, kapPenkkiTulos = ?, hauiskaantoTulos = ? WHERE id = ?;";
			// Valmistellaan komento:
			stmtUpdate = conn.prepareStatement(SqlSelect);
			stmtUpdate.setDouble(1,rintatreeni.getPenkkiTulos());
			stmtUpdate.setDouble(2,rintatreeni.getVinopenkkiTulos());
			stmtUpdate.setDouble(3,rintatreeni.getRistitaljaTulos());
			stmtUpdate.setDouble(4,rintatreeni.getFlyesTulos());
			stmtUpdate.setDouble(5,rintatreeni.getTakaolkaTulos());
			stmtUpdate.setDouble(6,rintatreeni.getVipariSTulos());
			stmtUpdate.setDouble(7,rintatreeni.getVipariETulos());
			stmtUpdate.setDouble(8,rintatreeni.getKapPenkkiTulos());
			stmtUpdate.setDouble(9,rintatreeni.getHauiskaantoTulos());
			stmtUpdate.setInt(10, rintatreeni.getId());
			// L‰hetet‰‰n komento:
			stmtUpdate.executeUpdate();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtUpdate,conn); //Suljetaan
		}
	}
	
	private RintaOlkaKadet readRintaOlkaKadet(ResultSet rs) {
		try {
			/* Haetaan yhden henkilˆn tiedot kyselyn tulostaulun (ResultSet-tyyppinen rs-olion)
			 *  aktiiviselta tietorivilt‰ */
			int id = rs.getInt("id");
			double penkkiTulos = rs.getDouble("penkkiTulos");
			double vinopenkkiTulos = rs.getDouble("vinopenkkiTulos");
			double ristitaljaTulos = rs.getDouble("ristitaljaTulos");
			double flyesTulos = rs.getDouble("flyesTulos");
			double takaolkaTulos = rs.getDouble("takaolkaTulos");
			double vipariSTulos = rs.getDouble("vipariSTulos");
			double vipariETulos = rs.getDouble("vipariETulos");
			double kapPenkkiTulos = rs.getDouble("kapPenkkiTulos");
			double hauiskaantoTulos = rs.getDouble("hauiskaantoTulos");
			//  Luodaan ja palautetaan uusi rintatreeni
			return new RintaOlkaKadet(id, penkkiTulos, vinopenkkiTulos, ristitaljaTulos, flyesTulos, takaolkaTulos, vipariSTulos,
					vipariETulos, kapPenkkiTulos, hauiskaantoTulos);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void addRintaOlkaKadet(RintaOlkaKadet rintatreeni) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection(); //luodaan yhteys
			//Luodaan uusi henkilˆ tietokantaan:
			String SqlInsert = "INSERT INTO rintatreeni(id, penkkiTulos, vinopenkkiTulos, ristitaljaTulos, flyesTulos, takaolkaTulos, vipariSTulos, vipariETulos, kapPenkkiTulos,"
					+ " hauiskaantoTulos) VALUES (?,?,?,?,?,?,?,?,?,?)";
			stmt = conn.prepareStatement(SqlInsert);
			stmt.setDouble(1, rintatreeni.getId());
			stmt.setDouble(2, rintatreeni.getPenkkiTulos());
			stmt.setDouble(3, rintatreeni.getVinopenkkiTulos());
			stmt.setDouble(4, rintatreeni.getRistitaljaTulos());
			stmt.setDouble(5, rintatreeni.getFlyesTulos());
			stmt.setDouble(6, rintatreeni.getTakaolkaTulos());
			stmt.setDouble(7, rintatreeni.getVipariSTulos()); //haetaan tiedot
			stmt.setDouble(8, rintatreeni.getVipariETulos());
			stmt.setDouble(9, rintatreeni.getKapPenkkiTulos());
			stmt.setDouble(10, rintatreeni.getHauiskaantoTulos());
			stmt.executeUpdate(); //p‰ivitet‰‰n tietokantaan
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmt, conn); //suljetaan
		}
	}
	public void removeRintaOlkaKadet(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement stmtDelete = null;
		
		try {
			//luodaan yhteys
			conn = getConnection();
			//Poistetaan treeni tietokannasta:
			String sqlInsert = "DELETE FROM rintatreeni WHERE id = ?";
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
