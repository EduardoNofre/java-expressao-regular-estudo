package com.exemplo.samples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {

	// somente numeros
	public void somenteNumeros() {
		boolean numero = numero = "1".matches("[0-9]");
		System.out.println(numero);

	}

	// Letras e numeros
	public void letrasEnumeros() {
		boolean letrasNumeros = "A2".matches("\\w\\d");
		System.out.println(letrasNumeros);

	}

	// Tem espaço
	public void possuiEspacos() {
		boolean espaco = " ".matches("\\s");
		System.out.println(espaco);
	}

	// Validação de cep
	public void validaCep() {
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		boolean valida = "99855-000".matches(cep);
		System.out.println(valida);
	}

	// Procura 2 dígitos numerico no texto
	public void buscaPorNumerosDeDoisDigitos() {
		boolean valor = "aa".matches("\\d\\d");
		System.out.println(valor);
	}

	// Procura 2 dígitos letras no texto
	public void buscaPorLetrasDeDoisDigitos() {
		boolean valor = "aa".matches("\\w\\w");
		System.out.println(valor);
	}

	public void terminaCom() {
		boolean palavra = "Java322".matches(".*322$");
		System.out.println(palavra);
	}

	public void comecaCom() {
		boolean palavra = "Java322".matches("^Java.*");
		System.out.println(palavra);
	}

	public void seApalvraExisteNoTexto() {
		boolean palavra = "Hello World Java".matches(".*World.*");
		System.out.println(palavra);
	}

	public void verificaSedepoisLetraTemPalavradesejada() {
		boolean palavra = "O mundo Java".matches("^O.*Java$");
		System.out.println(palavra);
	}

	public void buscaUmaOUoutraPalavra() {
		boolean time = "Inter".matches("Inter|Grêmio");
		System.out.println("Time: " + time);
	}

	public void naoPermiteQueComecaComasLetras() {
		boolean palavra = "oracle".matches("[^aei]racle");
		System.out.println(palavra);
	}

	public void verificaSeExisteOdigito() {
		boolean palavra = "Objetos".matches("Ob[j]eto[s]");
		System.out.println(palavra);
	}

	public void validaEmail() {
		boolean email = "java@teste.com.br".matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}");
		System.out.println(email);
	}

	public void letrasMaiusculaEminuscula() {
		boolean palavra = "g".matches("[aA-zZ]");
		System.out.println(palavra);
	}

	public void comeceComNumeroEtermineComLetras() {
		String str = "9a";
		Pattern p = Pattern.compile("[0-9]+[a-zA-Z]+");
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
	}

	public void comeceComLetraEtermineComNumero() {
		String texto = "A9";
		Pattern p = Pattern.compile("[a-zA-Z]+[0-9]+");
		Matcher m = p.matcher(texto);
		System.out.println(m.matches());
	}

	public void letrasEnumeroEmQualquerPosicao() {
		String texto = "9A";
		Pattern p = Pattern.compile("([a-zA-Z]*([0-9]+[a-zA-Z]+)|([a-zA-Z]+[0-9]+)[0-9]*)+");
		Matcher m = p.matcher(texto);
		System.out.println(m.matches());
	}

}
