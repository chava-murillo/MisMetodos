package c19MisMetodos;

public class CalculadoraApp {

	public static void main(String[] args) {
		SumasyRestas SyR = new SumasyRestas(); //Se crea objeto sin mandar parametros para la clase 'SumayRestas'
		SumasyRestas SuyRe = new SumasyRestas(5,5); //Se crea objeto mandando parametros para la clase 'SumayRestas'
		MultiplicacionesyDiv MyD = new MultiplicacionesyDiv(3.2f, 1.4f);
		MultiplicacionesyDiv muYdi = new MultiplicacionesyDiv(1.0f, 2.0f);
		
		int resu = 0;
		int resuConst = 0;
		int resultSobrecarga = 0;
		
		
		//SUMAS
		resu = SyR.suma(8, 3); //Se llama al metodo suma y se mandan parametros para 'a' y 'b';
		System.out.println(resu);
		
		resuConst = SuyRe.suma(); //Se llama al metodo suma y se ejecuta la operacion con los parametros mandados 'a' y 'b';
		System.out.println(resuConst);
		
		resultSobrecarga = SuyRe.suma(7, 9);
		System.out.println(resultSobrecarga);
		
		int sumita;
		System.out.println(sumita = SuyRe.suma(10, 10));
		
		//RESTAS
		System.out.println(SyR.resta(9, 3));
		
		resuConst = SuyRe.resta();
		System.out.println(resuConst);
		
		//Multiplicacion
		System.out.println("GetX: " + MyD.getFNumX());
		System.out.println("GetY: " + MyD.getFNumY());
		
		MyD.setFNumX(2.0f);
		MyD.setFNumY(3.0f);
		
		System.out.println("GetX: " + MyD.getFNumX());
		System.out.println("GetY: " + MyD.getFNumY());
		
		System.out.println("Resultado Multiplicar: " + MyD.Multiplicar());
		
		System.out.println(MyD.toString());
		System.out.println(muYdi.toString());
		
	}

}
