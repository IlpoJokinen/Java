package treeni.model;

public class SelkaTakareidet {
	private int id;
	private double kulmasoutuTulos;
	private double ylaTaljaTulos;
	private double yhdKadenSoutuTulos;
	private double alataljaTulos;
	private double sjmvTulos;
	private double takareisiTulos;
	
	public SelkaTakareidet() {
		this.id = 0;
		this.kulmasoutuTulos = 0.0;
		this.ylaTaljaTulos = 0.0;
		this.yhdKadenSoutuTulos = 0.0;
		this.alataljaTulos = 0.0;
		this.sjmvTulos = 0.0;
		this.takareisiTulos = 0.0;
	}

	public SelkaTakareidet(double kulmasoutuTulos, double ylaTaljaTulos, double yhdKadenSoutuTulos,
			double alataljaTulos, double sjmvTulos, double takareisiTulos) {
		super();
		this.kulmasoutuTulos = kulmasoutuTulos;
		this.ylaTaljaTulos = ylaTaljaTulos;
		this.yhdKadenSoutuTulos = yhdKadenSoutuTulos;
		this.alataljaTulos = alataljaTulos;
		this.sjmvTulos = sjmvTulos;
		this.takareisiTulos = takareisiTulos;
	}
	public SelkaTakareidet(int id, double kulmasoutuTulos, double ylaTaljaTulos, double yhdKadenSoutuTulos,
			double alataljaTulos, double sjmvTulos, double takareisiTulos) {
		super();
		this.id = id;
		this.kulmasoutuTulos = kulmasoutuTulos;
		this.ylaTaljaTulos = ylaTaljaTulos;
		this.yhdKadenSoutuTulos = yhdKadenSoutuTulos;
		this.alataljaTulos = alataljaTulos;
		this.sjmvTulos = sjmvTulos;
		this.takareisiTulos = takareisiTulos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getKulmasoutuTulos() {
		return kulmasoutuTulos;
	}

	public void setKulmasoutuTulos(double kulmasoutuTulos) {
		this.kulmasoutuTulos = kulmasoutuTulos;
	}

	public double getYlaTaljaTulos() {
		return ylaTaljaTulos;
	}

	public void setYlaTaljaTulos(double ylaTaljaTulos) {
		this.ylaTaljaTulos = ylaTaljaTulos;
	}

	public double getYhdKadenSoutuTulos() {
		return yhdKadenSoutuTulos;
	}

	public void setYhdKadenSoutuTulos(double yhdKadenSoutuTulos) {
		this.yhdKadenSoutuTulos = yhdKadenSoutuTulos;
	}

	public double getAlataljaTulos() {
		return alataljaTulos;
	}

	public void setAlataljaTulos(double alataljaTulos) {
		this.alataljaTulos = alataljaTulos;
	}

	public double getSjmvTulos() {
		return sjmvTulos;
	}

	public void setSjmvTulos(double sjmvTulos) {
		this.sjmvTulos = sjmvTulos;
	}

	public double getTakareisiTulos() {
		return takareisiTulos;
	}

	public void setTakareisiTulos(double takareisiTulos) {
		this.takareisiTulos = takareisiTulos;
	}

	@Override
	public String toString() {
		return "SelkaTakareidet [kulmasoutuTulos=" + kulmasoutuTulos + ", ylaTaljaTulos=" + ylaTaljaTulos
				+ ", yhdKadenSoutuTulos=" + yhdKadenSoutuTulos + ", alataljaTulos=" + alataljaTulos + ", sjmvTulos="
				+ sjmvTulos + ", takareisiTulos=" + takareisiTulos + "]";
	}
}
