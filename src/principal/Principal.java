package principal;

import clases.Comercial;
import clases.Empleado;

public class Principal
{
	public static void main(String[] args)
	{
		Empleado e1 = new Empleado();
		System.out.println(e1 + "\nTrienios: " + e1.calculaTrienios() + "\n");
		Empleado e2 = new Empleado("Antonio", "López", 20, 1800, 4);
		System.out.println(e2 + "\nTrienios: " + e2.calculaTrienios() + "\n");
		
		Comercial c1 = new Comercial();
		c1.setNombre("Enrique");
		c1.setApelllidos("Rubio");
		c1.setEdad(37);
		c1.setSalario(1500);
		c1.setAntiguedad(6);
		Comercial c2 = new Comercial("Ana", "González", 25, 2000, 2, 0);
		System.out.println(c1);
		System.out.println("\n" + c2);
	}

}
