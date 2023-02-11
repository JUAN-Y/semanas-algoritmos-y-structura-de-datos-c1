package semana_01;

public class Docente {
//atributos publicos
	public int codigo, horas;
	public String nombre;
	public double tarifa;
//metódos publicos
	public double sueldobru() {
		return horas*tarifa;
	}
	public double descuento (double sb) {
		double des=0.0;
		if(sb<4500) {
			des=0.12*sb;
		}else if(sb>=4500 && sb<6500) {
			des=0.14*sb;
		}else {
			des= 0.16*sb;
		}
		return des;
	}
	public double sueldoneto(double sb, double d) {
		return (sb-d);
	}

}
