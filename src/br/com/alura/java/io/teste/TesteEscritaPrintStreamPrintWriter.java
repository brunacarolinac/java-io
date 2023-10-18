package br.com.alura.java.io.teste;


import java.io.IOException;
import java.io.PrintWriter;


public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException{
		
		//Fluxo de Entrada com Arquivo
//		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
			
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//		PrintStream ps = new PrintStream("lorem2.txt");		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Oi, meu nome e bruna e essa sera a execuçao da saida");
		ps.println();
		ps.println();
		ps.println();
		ps.println("mais informacao para ser impressa");
		
		
		ps.close();
		
		System.out.println();
		
	}

}
