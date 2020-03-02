package c19MisMetodos;

public class MultiplicacionesyDiv {
	
	//Se declaran variables locales
	float fNumX = 0.0f;
	float fNumY = 0.0f;
	float resultado = 0.0f;
	
	//Constructor Multiplicaciones y Divisones
	MultiplicacionesyDiv (float fNumX, float fNumY){
		this.fNumX = fNumX;
		this.fNumY = fNumY;
	}
	
	
	//Metodos Set
	public void setFNumX(float fNumX) {
		this.fNumX = fNumX;
	}
	
	public void setFNumY(float fNumY) {
		this.fNumY = fNumY;
	}
	//Metodos Get
	public float getFNumX() {
		return this.fNumX;
	}
	
	public float getFNumY() {
		return this.fNumY;
	}
	
	//Metodos Multiplicar y Dividir
	public float Multiplicar() {
		resultado = this.fNumX * this.fNumY;
		return resultado;
	}
	
	public float Dividir() {
		return 0.0f;
	}


	@Override
	public String toString() {
		return "MultiplicacionesyDiv [fNumX=" + fNumX + ", fNumY=" + fNumY + "]";
	}
	
//	public String toString(){
//		return "fNumX: " + fNumX + "fNumY: " + fNumY; 
//	}
	
	

}
