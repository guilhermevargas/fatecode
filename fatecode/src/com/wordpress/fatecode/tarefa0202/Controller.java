package com.wordpress.fatecode.tarefa0202;

import java.util.Calendar;

public class Controller {
	public static void main(String[] args) {
		CalendarioDoMes calendarioDoMes = null;
		CalendarioView calendarioView = null;
		String mensagem = "";
		String opcao = "";

		do {
			mensagem = "Entre com a data _ _/_ _ _ _";
			String data = CalendarioView.mostraMenu(mensagem);

			// obtem um objeto Calendar a partir do mês e ano informado.
			Calendar mesEAnoInformado = CalendarioDoMes.converParaCalendar(data);
			
			// seta primeiro dia da semana para domingo, que por default é
			// segunda.
			mesEAnoInformado.setFirstDayOfWeek(Calendar.SUNDAY);
			
			// instancia da classe que vai encapsular e manipular o mês e ano
			// informado
			calendarioDoMes = new CalendarioDoMes(
					mesEAnoInformado);
			// chama o método que vai printar o calendário no console
			
			calendarioView = new CalendarioView(calendarioDoMes.getMatrizCalendario());
			calendarioView.printCalendario();

			mensagem = "Deseja continuar? s/n:";

			do {
				opcao = CalendarioView.mostraMenu(mensagem);

			} while (!opcao.equalsIgnoreCase("s")
					&& !opcao.equalsIgnoreCase("n"));

		} while (opcao.equalsIgnoreCase("s"));

		System.out.println("Fim");
	}
}
