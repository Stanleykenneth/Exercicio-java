package ExercicioEstrutura;

import javax.swing.JOptionPane;

/*Usando switch, escreva um programa que leia um núymero inteiro entre
  1 e 12 e imprima o mês correspondente a estse número. Isto é, Janeiro = 1,
  Fevereiro = 2, e assim por diante.*/

public class Exercicio16 {

	public static void main(String[] args) {

		int num;

		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
		JOptionPane.showMessageDialog(null,"O número digitado foi: " + num);

		if (num > 0 & num <= 12) {

			switch (num) {

			case 1:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Janeiro.");
				break;

			case 2:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Fevereiro.");
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Março.");
				break;

			case 4:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Abril.");
				break;

			case 5:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Maio.");
				break;

			case 6:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Junho.");
				break;

			case 7:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Julho.");
				break;

			case 8:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Agosto.");
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Setembro.");
				break;

			case 10:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Outubro.");
				break;

			case 11:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Novembro.");
				break;

			case 12:
				JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês de Dezembro.");
				break;

			default:

				JOptionPane.showMessageDialog(null, "Este número não coreesponde ao números dos meses.");

			}
		} else {

			JOptionPane.showMessageDialog(null, "Este número não coreesponde ao números dos meses.");

		}

	}
}
