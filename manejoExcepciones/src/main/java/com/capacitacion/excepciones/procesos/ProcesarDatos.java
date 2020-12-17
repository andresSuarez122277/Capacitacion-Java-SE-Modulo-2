package com.capacitacion.excepciones.procesos;

import com.capacitacion.excepciones.personalizadas.ManejoExcepciones;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProcesarDatos {
	
	public int division(String numero1,String numero2) {
		int resultado = 0;
		try {
			resultado = Integer.valueOf(numero1) / Integer.valueOf(numero2);
		}catch(NumberFormatException | ArithmeticException e){
			System.out.println("Ha fallado la operación por: " + e.getMessage());
			System.out.println("Causa: "+e.getCause());
			System.out.println(e.getStackTrace().toString());
		}
		return resultado;
	}
	
	public void arreglo(String[] lista) {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(lista[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Ha fallado la operación por: " + e.getMessage());
			System.out.println("Causa: "+e.getCause());
			System.out.println(e.getStackTrace().toString());
		}
	}
	
	public void fecha(String input) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date   date  = format.parse (input);
		date.toString();
	}

	public void leerArchivo(String ruta) throws ManejoExcepciones {
		try {
			Scanner scanner = new Scanner(new File(ruta));
		}catch(FileNotFoundException e){
			throw new ManejoExcepciones("Ruta de archivo no encontrado","Ruta '"+ruta+"' no encontrada");
		}
	}

	public void leeryEscribirArchivo(){
		try {
			Scanner scanner = new Scanner(new File("src/main/java/com/capacitacion/excepciones/datos/data.txt"));
			File archivo = new File("src/main/java/com/capacitacio/excepciones/datos/data2.txt");
			FileWriter escritor = new FileWriter(archivo);

			while (scanner.hasNextLine()){
				// Se captura excepción en caso de que el registro leido no tenga los 3 valores (Nombre, Ciudad, Profesion)
				String[] registro = scanner.nextLine().split(";");
				try {
					escritor.write(registro[0] + ";" + registro[2] + "\n");
				}catch (ArrayIndexOutOfBoundsException e){
					System.out.println("El registro nombre: '"+registro[0]+"' no tiene todos sus campos");
				}
			}

			scanner.close();
			escritor.close();
		}catch(FileNotFoundException e){//Excepción para la lectura del archivo
			System.out.println("Ruta de archivo no encontrado");
			System.out.println(e.getStackTrace());
		}catch (IOException e){//Excepción para la escritura del archivo
			System.out.println("No se encuentra archivo o bloqueado");
			System.out.println(e.getStackTrace());
		}
	}
	

}
