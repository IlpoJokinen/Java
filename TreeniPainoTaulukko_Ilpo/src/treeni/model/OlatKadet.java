package treeni.model;

public class OlatKadet {
	private int id;
	private double pystPunnerTulos;
	private double takaolatTulos;
	private double vipariSivTulos;
	private double ojentajaTaljaTulos;
	private double hauisScottTulos;
	private double ojentajaPunnerTulos;
	private double hauisKPTulos;
	
	public OlatKadet() {
		this.id = 0;
		this.pystPunnerTulos = 0.0;
		this.takaolatTulos = 0.0;
		this.vipariSivTulos = 0.0;
		this.ojentajaTaljaTulos = 0.0;
		this.hauisScottTulos = 0.0;
		this.ojentajaPunnerTulos = 0.0;
		this.hauisKPTulos = 0.0;
	}

	public OlatKadet(double pystPunnerTulos, double takaolatTulos, double vipariSivTulos, double ojentajaTaljaTulos,
			double hauisScottTulos, double ojentajaPunnerTulos, double hauisKPTulos) {
		super();
		this.pystPunnerTulos = pystPunnerTulos;
		this.takaolatTulos = takaolatTulos;
		this.vipariSivTulos = vipariSivTulos;
		this.ojentajaTaljaTulos = ojentajaTaljaTulos;
		this.hauisScottTulos = hauisScottTulos;
		this.ojentajaPunnerTulos = ojentajaPunnerTulos;
		this.hauisKPTulos = hauisKPTulos;
	}
	public OlatKadet(int id, double pystPunnerTulos, double takaolatTulos, double vipariSivTulos, double ojentajaTaljaTulos,
			double hauisScottTulos, double ojentajaPunnerTulos, double hauisKPTulos) {
		super();
		this.id = id;
		this.pystPunnerTulos = pystPunnerTulos;
		this.takaolatTulos = takaolatTulos;
		this.vipariSivTulos = vipariSivTulos;
		this.ojentajaTaljaTulos = ojentajaTaljaTulos;
		this.hauisScottTulos = hauisScottTulos;
		this.ojentajaPunnerTulos = ojentajaPunnerTulos;
		this.hauisKPTulos = hauisKPTulos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPystPunnerTulos() {
		return pystPunnerTulos;
	}

	public void setPystPunnerTulos(double pystPunnerTulos) {
		this.pystPunnerTulos = pystPunnerTulos;
	}

	public double getTakaolatTulos() {
		return takaolatTulos;
	}

	public void setTakaolatTulos(double takaolatTulos) {
		this.takaolatTulos = takaolatTulos;
	}

	public double getVipariSivTulos() {
		return vipariSivTulos;
	}

	public void setVipariSivTulos(double vipariSivTulos) {
		this.vipariSivTulos = vipariSivTulos;
	}

	public double getOjentajaTaljaTulos() {
		return ojentajaTaljaTulos;
	}

	public void setOjentajaTaljaTulos(double ojentajaTaljaTulos) {
		this.ojentajaTaljaTulos = ojentajaTaljaTulos;
	}

	public double getHauisScottTulos() {
		return hauisScottTulos;
	}

	public void setHauisScottTulos(double hauisScottTulos) {
		this.hauisScottTulos = hauisScottTulos;
	}

	public double getOjentajaPunnerTulos() {
		return ojentajaPunnerTulos;
	}

	public void setOjentajaPunnerTulos(double ojentajaPunnerTulos) {
		this.ojentajaPunnerTulos = ojentajaPunnerTulos;
	}

	public double getHauisKPTulos() {
		return hauisKPTulos;
	}

	public void setHauisKPTulos(double hauisKPTulos) {
		this.hauisKPTulos = hauisKPTulos;
	}

	@Override
	public String toString() {
		return "OlatKadet [pystPunnerTulos=" + pystPunnerTulos + ", takaolatTulos=" + takaolatTulos + ", vipariSivTulos="
				+ vipariSivTulos + ", ojentajaTaljaTulos=" + ojentajaTaljaTulos + ", hauisScottTulos=" + hauisScottTulos
				+ ", ojentajaPunnerTulos=" + ojentajaPunnerTulos + ", hauisKPTulos=" + hauisKPTulos + "]";
	}
}
