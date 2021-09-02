package coronaConCirculo;

public class CoronaCircular {
	private Circulo circuloGrande;
	private Circulo circuloChico;

	// Constructor
	public CoronaCircular(double radioInterior, double radioExterior) {
		if (radioInterior >= radioExterior)
			throw new Error("El radio interior debe ser menor que el exterior");
		// Construimos los 2 circulos que van a ser los atributos
		this.circuloChico = new Circulo(radioInterior);
		this.circuloGrande = new Circulo(radioExterior);
	}

	// ACÁ es donde APROVECHO LAS VENTAJAS de DELEGAR:
	public double getRadioInterior() { // Quiero saber el radio interior, se lo pido al circulo chico.
		return this.circuloChico.getRadio();
	}

	public double getRadioExterior() {
		return this.circuloGrande.getRadio();
	}

	public double getPerimetro() {// Quiero saber el perimetro, es la suma del perimetro de los dos circulos
		return (this.circuloChico.getPerimetro() + this.circuloGrande.getPerimetro());
	}

	public double getSuperficie() { // Quiero saber el perimetro, es la resta de la superficie de los dos circulos
									// (Grande menos agujero)
		return (this.circuloGrande.getSuperficie() - this.circuloChico.getSuperficie());
	}

}
