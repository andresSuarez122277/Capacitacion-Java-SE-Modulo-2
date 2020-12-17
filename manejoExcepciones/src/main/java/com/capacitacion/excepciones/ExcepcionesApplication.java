package com.capacitacion.excepciones;


import java.text.ParseException;

import com.capacitacion.excepciones.personalizadas.ManejoExcepciones;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.capacitacion.excepciones.procesos.ProcesarDatos;

@SpringBootApplication
public class ExcepcionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcepcionesApplication.class, args);
		
		//caso1();
		//caso2();
		//caso3();
		//caso4();
		caso5();
	}
	
	public static void caso1() {
		// cree una instancia de la clase ProcesarDatos y use el metodo division.
		//envie   los valores ("48", "0") - division por cero
		//en el metodo division capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola  desde  el catch StackTrace,Cause,Message; 
		// haga lo mismo para los valores ("15.8", "30")
		ProcesarDatos caso1 = new ProcesarDatos();
		int num = caso1.division("48","0");
		int num1 = caso1.division("15.8","30");
	}

	public static void caso2() {
		//cree una instancia de la clase ProcesarDatos y use el metodo division. y use metodo arreglo
		//envie al metodo arry de string  de 3 valores para que se genere una excepcion.
		//capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola   StackTrace,Cause,Message del error; 
		ProcesarDatos caso2 = new ProcesarDatos();
		String [] arr= {"1","2","3"};
		caso2.arreglo(arr);
	}
	
	public static void caso3() {
		//// cree una instancia de la clase ProcesarDatos y use el metodo fecha.
		//envie al metodo una fecha con el formato "yyyy/mm/dd".
		//capture e identifique la excepcion que se genera (no la excepcion general de java Exception) 
	    // Re-lance la excepcion y capturela aqui en el metodo case3 e imprima en consola StackTrace,Cause,Message del error;
		ProcesarDatos caso3 = new ProcesarDatos();
		String fecha = "2020/11/24";
		try{
			caso3.fecha(fecha);
		}catch (ParseException e){
			System.out.println("Ha fallado la operación por: " + e.getMessage());
			System.out.println("Causa: "+e.getCause());
			System.out.println(e.getStackTrace().toString());
		}
	}

	public static void caso4() {
		//manejo de excepciones personalizadas
		ProcesarDatos caso4 = new ProcesarDatos();
		try {
			caso4.leerArchivo("src/main/com.capacitacion.excepciones/datos/data.txt");
		}catch(ManejoExcepciones e){
			System.out.println(e.getTipoFalla());
			System.out.println(e.getCausa());
		}
	}
	
	public static void caso5() {
		//manejo de cierre de  objetos en lectura y escritura de arhivos
		ProcesarDatos caso5 = new ProcesarDatos();
		caso5.leeryEscribirArchivo();
	}
	

}
