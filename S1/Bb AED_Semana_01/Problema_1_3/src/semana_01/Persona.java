package semana_01;

public class Persona {
	//atributos
	public String nombre, apellidos;
	public int edad;
	public double altura, peso;
	//métodos
	public String estado() {
		
		if(edad<18) return "Menor de edad";
		else return "Mayor de edad";
	}
	public double imc() {
		//double x=Math.pow(altura,2);------eleva el valor
		//de altura al cuadrado
		double x=Math.pow(altura,2);
		return peso/x;
	}
	

}
