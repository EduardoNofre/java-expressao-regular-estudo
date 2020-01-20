package com.exemplo.principal;

import com.exemplo.samples.Sample;

/**
 * 
 *
 *  .  - busca qualquer caracter 										 
 *  \d - busca qualquer numero												[0-9]
 *  \D - busca qualquer caracter que não seja numero						[^0-9]
 *  \w - busca qualquer caracter de letras e numeros						[a-zA-Z_0-9]
 *  \W - busca qualquer caracter que não seja numero e letras				[^\w]
 *  \s - busca qualquer caracter de espaço em branco, tabulaçoes			[\t\n\xOB\f\r]
 *  \S - busca qualquer caracter sem espeço em branco						[^\s]
 *
 *  
 *  (?i) - Ignora maiúsculas de minúsculas.
 *	(?m) - Trabalha com multilinhas.
 *	(?s) - Faz com que o caractere encontre novas linhas.
 *	(?x) - Permite inclusão de espaços e comentários.
 *
 *	*[...] 					Agrupamento
 *	*[a-z]					Alcance
 *	*[a-e][i-u]				União
 *	*[a-z&&[aeiou]]			Interseção
 *	*[âbc]					Exceção
 *	*[a-z&&[^m-p]]  		Subtração
 *	*\x						Fuga literal
 *
 */


public class Principal {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		s.letrasEnumeroEmQualquerPosicao();

	}
}
