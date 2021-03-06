package br.inf.AppProVenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.inf.AppProVenda.modal.domain.Aditivo;
import br.inf.AppProVenda.modal.domain.Bateria;
import br.inf.AppProVenda.modal.domain.Lubrificante;
import br.inf.AppProVenda.modal.domain.Usuario;
import br.inf.AppProVenda.modal.service.AditivoService;
import br.inf.AppProVenda.modal.service.BateriaService;
import br.inf.AppProVenda.modal.service.LubrificanteService;

@Component
@Order(3)
public class ProdutoLoader implements ApplicationRunner {

	@Autowired
	private BateriaService bateriaService;
	
	@Autowired
	private AditivoService aditivoService;
	
	@Autowired
	private LubrificanteService lubrificanteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Bateria bateria = new Bateria("bateria de moto", "moura", 133);
		bateria.setAmperagem(5);
		bateria.setTipo("12");
		bateria.setPeso("2");
		bateria.setUsuario(usuario);
				
		bateriaService.incluir(bateria);
		
		Aditivo aditivo = new Aditivo("aditivo de radiador", "acdelco", 12);
		aditivo.setComposicao("organico");
		aditivo.setEmbalagem(500);
		aditivo.setModelo("prontouso");
		aditivo.setUsuario(usuario);
				
		aditivoService.incluir(aditivo);
		
		Lubrificante lubrificante = new Lubrificante("oleo de motor", "petronas", 34);
		lubrificante.setMotor("flex");
		lubrificante.setRefinamento("15w40");
		lubrificante.setViscosidade("mineral");
		lubrificante.setUsuario(usuario);
				
		lubrificanteService.incluir(lubrificante);
				
	
	}
}