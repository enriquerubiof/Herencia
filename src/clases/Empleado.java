package clases;

import java.util.Objects;

public class Empleado
{
	private String nombre;
	private String apellidos;
	private int edad;
	private double salario;
	private int antiguedad;
	
	private static final double PORCENTAJETRIENIOS = 0.05;
	private static final double PORCENTAJETRIENIOS2 = 0.08;
	
	public Empleado()
	{
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.salario = 0;
		this.antiguedad = 0;
	}
	
	public Empleado(String nombre, String apelllidos, int edad, double salario, int antiguedad)
	{
		this.nombre = nombre;
		this.apellidos = apelllidos;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}
	
	public Empleado(Empleado e)
	{
		this.nombre = e.nombre;
		this.apellidos = e.apellidos;
		this.edad = e.edad;
		this.salario = e.salario;
		this.antiguedad = e.antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelllidos() {
		return apellidos;
	}

	public void setApelllidos(String apelllidos) {
		this.apellidos = apelllidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "-Empleado\nNombre: " + nombre + "\nApelllidos: " + apellidos + "\nEdad: " + edad + "\nSalario: " + salario
				+ "\nAntiguedad: " + antiguedad;
	}
	
	public double calculaTrienios()
	{
		int numTrienios = this.antiguedad / 3;
		double trienios = 0;
		if (numTrienios < 5)
			trienios = this.salario * this.PORCENTAJETRIENIOS;
		else
			trienios = this.salario * this.PORCENTAJETRIENIOS2;
		return trienios;
		
	}
	
	public double calculaSalario()
	{
		return this.salario + this.calculaTrienios();
		
	}
	
	
}
