package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class TesteEscrita {

	public static void main(String[] args) throws IOException{
		
		//Fluxo de Entrada com Arquivo
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Oi, meu nome e bruna e essa sera a execuçao da saida");
		bw.newLine();
		bw.newLine();
		bw.write("mais informacao para ser impressa");
		
		
		bw.close();
		
	}

}
