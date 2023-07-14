package clases;

public class Comercial extends Empleado
{
	private int numVentas;
	private static double precioPorVenta = 45.90;
	
	public Comercial()
	{
		super();
		this.numVentas = 0;
	}
	
	public Comercial(String nombre, String apelllidos, int edad, double salario, int antiguedad, int numVentas)
	{
		super(nombre, apelllidos, edad, salario, antiguedad);
		this.numVentas = numVentas;
	}
	
	public Comercial(Empleado e, int numVentas)
	{
		super(e);
		this.numVentas = numVentas;
	}

	public int getNumVentas() {
		return numVentas;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}

	public static double getPrecioPorVenta() {
		return precioPorVenta;
	}

	public static void setPrecioPorVenta(double precioPorVenta) {
		Comercial.precioPorVenta = precioPorVenta;
	}

	@Override
	public String toString()
	{
		return "-Comercial\nNombre: " + getNombre() + "\nApelllidos: "
				+ getApelllidos() + "\nEdad: " + getEdad() + "\nSalario: " + getSalario() + "\nAntiguedad: "
				+ getAntiguedad() + "\nNúmero de Ventas: " + numVentas;
	}
}
