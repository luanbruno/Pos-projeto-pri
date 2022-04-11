package br.inf.AppProVenda.modal.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private AditivoService aditivoService;
	
	@Autowired
	private BateriaService bateriaService;
	
	@Autowired
	private LubrificanteService lubrificanteService;
	
	@Autowired
	private VendaService vendaService;

	@SuppressWarnings("rawtypes")
	public Map qtds () {
		
		Map<String, Long> mapa = new HashMap<>();
		mapa.put("Usuários", usuarioService.obterQtde());
		mapa.put("Clientes", clienteService.obterQtde());
		mapa.put("Produto", produtoService.obterQtde());
		mapa.put("Lubrificante", lubrificanteService.obterQtde());
		mapa.put("Aditivo", aditivoService.obterQtde());
		mapa.put("Bateria", bateriaService.obterQtde());
		mapa.put("Venda",vendaService.obterQtde());

		return mapa;
		
	}
}