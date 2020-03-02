package c19MisMetodos;

public class SumasyRestas {
	 int resultado = 0;
	 int a = 0;
	 int b = 0;
	 
	 //Constructor Recibe valores y ejecuta la suma
	 public int suma(int num1, int num2) {
		 resultado = num1 + num2;
		 return resultado;
	 }
	 
	 //Sobrecarga de metodos, parametros diferentes, metodo con nombre igual
	 //Se usara cuando se mandan valores desde el main, los toma y ejecuta la suma.
	 public int suma() {
		 resultado = this.a + this.b;
		 return resultado;
	 }
	 
	 //Recibe valores y ejecuta la resta
	 public int resta(int num1, int num2) {
		 resultado = num1 - num2;
		 return resultado;
	 }
	 
	 //Sobrecarga de metodos, parametros diferentes, metodo con nombre igual
	 //Se usara cuando se mandan valores desde el main, los toma y ejecuta la resta.
	 public int resta() {
		 resultado = this.a - this.b;
		 return resultado;
	 }
	 
	 
	 SumasyRestas(){
		 
	 }
	 
	 public void setA(int a) {
		 this.a = a;
	 }
	 
	 public int getA() {
		 return a;
	 }
	 
	 public void setB(int b) {
		 this.b = b;
	 }
	 
	 public int getB() {
		 return b;
	 }
	 
	 SumasyRestas (int a, int b){
		 this.a = a;
		 this.b = b;
	 }

}
