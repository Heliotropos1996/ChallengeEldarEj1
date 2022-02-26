package challengueEldarPto1;

import java.util.Date;

public class Principal {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Date fechavenc = new Date(125, 2, 26);
		Date fechavenc2 = new Date(126, 1, 3);
		Date fechavenc3 = new Date(127, 5, 15);

		Date fechAct = new Date();

		// Declaracion de los tres objetos
		
		Tarjeta tarj = new Tarjeta((Integer) 312423212, "VISA", "Ramiro Foschini", fechavenc);
		Tarjeta tarj2 = new Tarjeta((Integer) 39147327, "NARA", "Camila Sanchez", fechavenc2);
		Tarjeta tarj3 = new Tarjeta((Integer) 43124732, "AMEX", "Luana Garcia", fechavenc3);

		// Devuelvo la informacion de las tarjetas mediante el metodo toString

		System.out.println(tarj.toString());

		// Pasando primero la fecha actual y luego la fecha de vencimiento, me devuelve
		// si la tarjeta es valida o no

		System.out.println(tarj.esValida(fechAct, fechavenc));

		// Indicando el monto de la operacion y la marca de la tarjeta, devuelve marca,
		// tasa y si la operacion es válida. En el caso de que se ingrese por teclado
		// puede usarse el método toUpperCase() para convertir todo el String a mayuscula

		Operacion op = new Operacion(1060.3, "NARA");

		System.out.println(op.tasaYMarca(op.getMarca()));
		System.out.println(op.validezOp(op.getConsumo()));
	}

}
