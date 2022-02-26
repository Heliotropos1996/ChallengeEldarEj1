package challengueEldarPto1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tarjeta {

	private Integer numTarjeta;

	private String marca;

	private String cardholder;

	private Date fech_venc;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Tarjeta() {

	}

	public Tarjeta(Integer numTarjeta, String marca, String cardholder, Date fech_venc) {

		this.numTarjeta = numTarjeta;
		this.marca = marca;
		this.cardholder = cardholder;
		this.fech_venc = fech_venc;
	}

	public String esValida(Date fech_venc, Date fech_act) {

		if (fech_act.after(fech_venc))

			return "La tarjeta es valida!";

		else
			return "La tarjeta está vencida";
	}

	public Integer getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(Integer numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCardholder() {
		return cardholder;
	}

	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}

	public Date getFech_venc() {
		return fech_venc;
	}

	public void setFech_venc(Date fech_venc) {
		this.fech_venc = fech_venc;
	}

	@Override
	public String toString() {
		return "Tarjeta [El numero de tarjeta es: " + numTarjeta + ", la marca: " + marca + ", Titular: " + cardholder
				+ ", vencimiento: " + sdf.format(fech_venc) + "]";
	}

}
