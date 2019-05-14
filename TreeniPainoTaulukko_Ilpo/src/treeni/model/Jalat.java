package treeni.model;

public class Jalat {
	private int id;
	private double kyykkyTulos;
	private double hackTulos;
	private double prassiTulos;
	private double takareidetTulos;
	private double askKavelTulos;
	private double pohkeetTulos;
	
	public Jalat() {
		this.id = 0;
		this.kyykkyTulos = 0.0;
		this.hackTulos = 0.0;
		this.prassiTulos = 0.0;
		this.takareidetTulos = 0.0;
		this.askKavelTulos = 0.0;
		this.pohkeetTulos = 0.0;
	}

	public Jalat(double kyykkyTulos, double hackTulos, double prassiTulos, double takareidetTulos, double askKavelTulos,
			double pohkeetTulos) {
		super();
		this.kyykkyTulos = kyykkyTulos;
		this.hackTulos = hackTulos;
		this.prassiTulos = prassiTulos;
		this.takareidetTulos = takareidetTulos;
		this.askKavelTulos = askKavelTulos;
		this.pohkeetTulos = pohkeetTulos;
	}
	public Jalat(int id, double kyykkyTulos, double hackTulos, double prassiTulos, double takareidetTulos, double askKavelTulos,
			double pohkeetTulos) {
		super();
		this.id = id;
		this.kyykkyTulos = kyykkyTulos;
		this.hackTulos = hackTulos;
		this.prassiTulos = prassiTulos;
		this.takareidetTulos = takareidetTulos;
		this.askKavelTulos = askKavelTulos;
		this.pohkeetTulos = pohkeetTulos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getKyykkyTulos() {
		return kyykkyTulos;
	}

	public void setKyykkyTulos(double kyykkyTulos) {
		this.kyykkyTulos = kyykkyTulos;
	}

	public double getHackTulos() {
		return hackTulos;
	}

	public void setHackTulos(double hackTulos) {
		this.hackTulos = hackTulos;
	}

	public double getPrassiTulos() {
		return prassiTulos;
	}

	public void setPrassiTulos(double prassiTulos) {
		this.prassiTulos = prassiTulos;
	}

	public double getTakareidetTulos() {
		return takareidetTulos;
	}

	public void setTakareidetTulos(double takareidetTulos) {
		this.takareidetTulos = takareidetTulos;
	}

	public double getAskKavelTulos() {
		return askKavelTulos;
	}

	public void setAskKavelTulos(double askKavelTulos) {
		this.askKavelTulos = askKavelTulos;
	}

	public double getPohkeetTulos() {
		return pohkeetTulos;
	}

	public void setPohkeetTulos(double pohkeetTulos) {
		this.pohkeetTulos = pohkeetTulos;
	}

	@Override
	public String toString() {
		return "Jalat [kyykkyTulos=" + kyykkyTulos + ", hackTulos=" + hackTulos + ", prassiTulos=" + prassiTulos
				+ ", takareidetTulos=" + takareidetTulos + ", askKavelTulos=" + askKavelTulos + ", pohkeetTulos="
				+ pohkeetTulos + "]";
	}
}
