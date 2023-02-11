package semana_01;

public class Alumno {
	
	//  Atributos p�blicos
	public int codigo, nota1, nota2;
	public String nombre;
	//  Operaciones p�blicas
	public double promedio() {
		return (nota1 + nota2) / 2.0;
	}
	
}
