package examen;

public class Vehiculo {
	String matricula;
	String marca;
	String modelo;
	double precioHora;
	
	
	public Vehiculo(String matricula, String marca, String modelo, double precioHora) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.precioHora = precioHora;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPrecioHora() {
		return precioHora;
	}


	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", precioHora="
				+ precioHora + "]";
	}
	
	

}
