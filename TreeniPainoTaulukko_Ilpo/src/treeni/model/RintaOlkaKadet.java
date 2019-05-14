package treeni.model;

public class RintaOlkaKadet {
	private int id;
	private double penkkiTulos;
	private double vinopenkkiTulos;
	private double ristitaljaTulos;
	private double flyesTulos;
	private double takaolkaTulos;
	private double vipariSTulos;
	private double vipariETulos;
	private double kapPenkkiTulos;
	private double hauiskaantoTulos;
	
	public RintaOlkaKadet() {
		this.id = 0;
		this.penkkiTulos = 0.0;
		this.vinopenkkiTulos = 0.0;
		this.ristitaljaTulos = 0.0;
		this.flyesTulos = 0.0;
		this.takaolkaTulos = 0.0;
		this.vipariSTulos = 0.0;
		this.vipariETulos = 0.0;
		this.kapPenkkiTulos = 0.0;
		this.hauiskaantoTulos = 0.0;
		
	}

	public RintaOlkaKadet(double penkkiTulos, double vinopenkkiTulos, double ristitaljaTulos, double flyesTulos,
			double takaolkaTulos, double vipariSTulos, double vipariETulos, double kapPenkkiTulos,
			double hauiskaantoTulos) {
		super();
		this.penkkiTulos = penkkiTulos;
		this.vinopenkkiTulos = vinopenkkiTulos;
		this.ristitaljaTulos = ristitaljaTulos;
		this.flyesTulos = flyesTulos;
		this.takaolkaTulos = takaolkaTulos;
		this.vipariSTulos = vipariSTulos;
		this.vipariETulos = vipariETulos;
		this.kapPenkkiTulos = kapPenkkiTulos;
		this.hauiskaantoTulos = hauiskaantoTulos;
	}
	public RintaOlkaKadet(int id, double penkkiTulos, double vinopenkkiTulos, double ristitaljaTulos, double flyesTulos,
			double takaolkaTulos, double vipariSTulos, double vipariETulos, double kapPenkkiTulos,
			double hauiskaantoTulos) {
		super();
		this.id = id;
		this.penkkiTulos = penkkiTulos;
		this.vinopenkkiTulos = vinopenkkiTulos;
		this.ristitaljaTulos = ristitaljaTulos;
		this.flyesTulos = flyesTulos;
		this.takaolkaTulos = takaolkaTulos;
		this.vipariSTulos = vipariSTulos;
		this.vipariETulos = vipariETulos;
		this.kapPenkkiTulos = kapPenkkiTulos;
		this.hauiskaantoTulos = hauiskaantoTulos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPenkkiTulos() {
		return penkkiTulos;
	}

	public void setPenkkiTulos(double penkkiTulos) {
		this.penkkiTulos = penkkiTulos;
	}

	public double getVinopenkkiTulos() {
		return vinopenkkiTulos;
	}

	public void setVinopenkkiTulos(double vinopenkkiTulos) {
		this.vinopenkkiTulos = vinopenkkiTulos;
	}

	public double getRistitaljaTulos() {
		return ristitaljaTulos;
	}

	public void setRistitaljaTulos(double ristitaljaTulos) {
		this.ristitaljaTulos = ristitaljaTulos;
	}

	public double getFlyesTulos() {
		return flyesTulos;
	}

	public void setFlyesTulos(double flyesTulos) {
		this.flyesTulos = flyesTulos;
	}

	public double getTakaolkaTulos() {
		return takaolkaTulos;
	}

	public void setTakaolkaTulos(double takaolkaTulos) {
		this.takaolkaTulos = takaolkaTulos;
	}

	public double getVipariSTulos() {
		return vipariSTulos;
	}

	public void setVipariSTulos(double vipariSTulos) {
		this.vipariSTulos = vipariSTulos;
	}

	public double getVipariETulos() {
		return vipariETulos;
	}

	public void setVipariETulos(double vipariETulos) {
		this.vipariETulos = vipariETulos;
	}

	public double getKapPenkkiTulos() {
		return kapPenkkiTulos;
	}

	public void setKapPenkkiTulos(double kapPenkkiTulos) {
		this.kapPenkkiTulos = kapPenkkiTulos;
	}

	public double getHauiskaantoTulos() {
		return hauiskaantoTulos;
	}

	public void setHauiskaantoTulos(double hauiskaantoTulos) {
		this.hauiskaantoTulos = hauiskaantoTulos;
	}

	@Override
	public String toString() {
		return "RintaOlkaKadet [penkkiTulos=" + penkkiTulos + ", vinopenkkiTulos=" + vinopenkkiTulos
				+ ", ristitaljaTulos=" + ristitaljaTulos + ", flyesTulos=" + flyesTulos + ", takaolkaTulos="
				+ takaolkaTulos + ", vipariSTulos=" + vipariSTulos + ", vipariETulos=" + vipariETulos
				+ ", kapPenkkiTulos=" + kapPenkkiTulos + ", hauiskaantoTulos=" + hauiskaantoTulos + "]";
	}
}
