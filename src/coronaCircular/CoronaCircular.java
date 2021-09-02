package coronaCircular;

public class CoronaCircular {
	private double radioInterior;
	private double radioExterior;

	// Constructor
	public CoronaCircular(double radioInterior, double radioExterior) {
		if (radioInterior >= radioExterior)
			throw new Error("El radio interior debe ser menor que el exterior");
		this.setRadioInterior(radioInterior);
		this.setRadioExterior(radioExterior);
	}

	private void setRadioInterior(double ri) {
		if (ri <= 0)
			throw new Error("No se aceptan radios negativos");
		this.radioInterior = ri;
	}

	private void setRadioExterior(double re) {
		if (re <= 0)
			throw new Error("No se aceptan radios negativos");
		this.radioExterior = re;
	}

	public double getRadioInterior() {
		return radioInterior;
	}

	public double getRadioExterior() {
		return radioExterior;
	}

	public double getPerimetro() {
		return (this.getRadioInterior() + this.getRadioExterior()) * 2 * Math.PI;
	}

	public double getSuperficie() {
		return Math.PI * (Math.pow(this.getRadioExterior(), 2) - Math.pow(this.getRadioInterior(), 2));
	}

}
