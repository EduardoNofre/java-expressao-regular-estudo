package com.exemplo.principal;

import com.exemplo.samples.Sample;

/**
 * 
 *
 *  .  - busca qualquer caracter 										 
 *  \d - busca qualquer numero												[0-9]
 *  \D - busca qualquer caracter que n�o seja numero						[^0-9]
 *  \w - busca qualquer caracter de letras e numeros						[a-zA-Z_0-9]
 *  \W - busca qualquer caracter que n�o seja numero e letras				[^\w]
 *  \s - busca qualquer caracter de espa�o em branco, tabula�oes			[\t\n\xOB\f\r]
 *  \S - busca qualquer caracter sem espe�o em branco						[^\s]
 *
 *  
 *  (?i) - Ignora mai�sculas de min�sculas.
 *	(?m) - Trabalha com multilinhas.
 *	(?s) - Faz com que o caractere encontre novas linhas.
 *	(?x) - Permite inclus�o de espa�os e coment�rios.
 *
 *	*[...] 					Agrupamento
 *	*[a-z]					Alcance
 *	*[a-e][i-u]				Uni�o
 *	*[a-z&&[aeiou]]			Interse��o
 *	*[�bc]					Exce��o
 *	*[a-z&&[^m-p]]  		Subtra��o
 *	*\x						Fuga literal
 *
 */


public class Principal {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		s.letrasEnumeroEmQualquerPosicao();

	}
}
