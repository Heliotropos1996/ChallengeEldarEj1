package challengueEldarPto1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Operacion {

	private String validez;
	private Double consumo;
	private Double tasa;
	private String marca;

	public String validezOp(int consumo) {

		if (consumo < 1000)

			return "La operación es válida";
		else
			return "La operación no es válida";
	}

	SimpleDateFormat sdf = new SimpleDateFormat("yy");
	private double tasaVisa = Double.valueOf(sdf.format(LocalDate.now().getYear())) / (double) LocalDate.now().getMonthValue();
	private double tasaAmex = Double.valueOf(sdf.format(LocalDate.now().getMonthValue())) * 0.1;
	private double tasaNara = Double.valueOf(sdf.format(LocalDate.now().getDayOfMonth())) *0.5;

	public String tasaYMarca(String marca) {

		if (marca == "VISA") {

			return "La tarjeta es marca " + marca + " y tiene una tasa del: " + tasaVisa;
		}
		else if (marca =="AMEX") {

			return "La tarjeta es marca " + marca + " y tiene una tasa del: " + tasaAmex;
		}
		else if (marca == "NARA") {

			return "La tarjeta es marca " + marca + " y tiene una tasa del: " + tasaNara;
		}
		else return "La tarjeta no existe";
	}

	public Operacion() {
		super();
	}

	public Operacion(Double consumo, String marca) {

		this.consumo = consumo;

		this.marca = marca;

	}

	public String getValidez() {
		return validez;
	}

	public void setValidez(String validez) {
		this.validez = validez;
	}

	public Double getConsumo() {
		return consumo;
	}

	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}

	public Double getTasa() {
		return tasa;
	}

	public void setTasa(Double tasa) {
		this.tasa = tasa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTasaVisa() {
		return tasaVisa;
	}

	public void setTasaVisa(double tasaVisa) {
		this.tasaVisa = tasaVisa;
	}

}
