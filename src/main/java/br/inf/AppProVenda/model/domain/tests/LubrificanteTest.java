package br.inf.AppProVenda.model.domain.tests;

import br.inf.AppProVenda.Exception.MotorInvalidoException;
import br.inf.AppProVenda.modal.domain.Lubrificante;

public class LubrificanteTest {


	public static void main(String[] args) {
		try {
		Lubrificante lubrificante = new Lubrificante("oleo de motor", "petronas", 20);
		lubrificante.setMotor("diesel");
		lubrificante.setRefinamento("15w40");
		lubrificante.setViscosidade("mineral");
		System.out.println(lubrificante.toString());
		System.out.println(lubrificante.Aplicacao());
		} catch (MotorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		try {
			Lubrificante lubrificante = new Lubrificante("oleo de motor", "petronas", 22);
			lubrificante.setMotor("agua");
			lubrificante.setRefinamento("15w40");
			lubrificante.setViscosidade("mineral");
			System.out.println(lubrificante.toString());
			System.out.println(lubrificante.Aplicacao());
			} catch (MotorInvalidoException e) {
				System.out.println(e.getMessage());
			}
	}
		
}
