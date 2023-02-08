package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*Escreva um programaque leia um número inteiro maior do que zero e devolva,
  na tela, a soma de todos de todos algarismo. Por exemplo, ao número 251
  corresponderá o valor 8(2 + 5 + 1). Se o número for menor que zero,
  o programa terminará com a mensagem "Número Inválido!"*/

public class Exercício11 {
	
	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número qualquer:"));
		JOptionPane.showInternalMessageDialog(null, "O número digitado foi: " + numero);
				
		if(numero > 0) {
		    int unidade = numero % 10;
			numero /= 10; // 123
			int dezena = numero % 10; 
			numero /= 10; // 12
			int centena = numero % 10;
			numero /= 10; // 1
			int miliar = numero; 

			int soma;
			
			soma =  miliar + centena + dezena + unidade;
			JOptionPane.showMessageDialog(null, "O resultado é: " + soma);
			
			}else {
			JOptionPane.showInternalMessageDialog(null, "Número inválido!");
		}
	}
}
