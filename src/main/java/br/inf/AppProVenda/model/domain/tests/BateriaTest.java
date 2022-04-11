package br.inf.AppProVenda.model.domain.tests;

import br.inf.AppProVenda.Exception.AmperagemInvalidoException;
import br.inf.AppProVenda.modal.domain.Bateria;

public class BateriaTest {

	public static void main(String[] args) {
		try {
			Bateria bateria = new Bateria("bateria de motor", "moura", 130);
			bateria.setAmperagem(2);
			bateria.setTipo("24");
			bateria.setPeso("2");
			System.out.println(bateria);
			System.out.println(bateria.Aplicacao());
		} catch (AmperagemInvalidoException e) {
			System.out.println(e.getMessage());
		}
		try {
			Bateria bateria = new Bateria("bateria de moto", "moura", 200);
			bateria.setAmperagem(4);
			bateria.setTipo("12");
			bateria.setPeso("2");
			System.out.println(bateria);
			System.out.println(bateria.Aplicacao());
		} catch (AmperagemInvalidoException e) {
			System.out.println(e.getMessage());
		}
	
	}
}
