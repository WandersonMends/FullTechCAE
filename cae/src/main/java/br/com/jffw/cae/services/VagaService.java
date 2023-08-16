package br.com.jffw.cae.services;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.jffw.cae.models.Apartamento;
import br.com.jffw.cae.models.Vaga;
import br.com.jffw.cae.repository.ApartamentoRepository;
import br.com.jffw.cae.repository.VagaRepository;

@Service
public class VagaService {
	private VagaRepository vagaRepository;
	private ApartamentoRepository apartamentoRepository;
	
	public VagaService(VagaRepository vagaRepository) {
		this.vagaRepository = vagaRepository;
	}
	
	public List<Vaga> listar() {
		return vagaRepository.findAll();
	}
	
	public Vaga incluir(Vaga vaga) {
		Optional<Vaga> vag = vagaRepository.findById(vaga.getId());
		
		if(!vag.isEmpty()) {
			throw new RuntimeException("Esta vaga já está em uso.");
		}
		
		return vagaRepository.save(vaga);
	}
	
	public Vaga incluirVaga(Map<String, String> dados) throws ParseException  {
		
		String bloco =  dados.get("bloco");
		String numero =  dados.get("numero");
		
		int idAP =  Integer.parseInt(dados.get("idAP"));            
//		Apartamento a = apartamentoRepository.getReferenceById(idAP);
		Apartamento a = apartamentoRepository.findById(idAP).orElse(null);
		
		
		Vaga vaga = new Vaga();
		vaga.setApartamento(a);
		vaga.setBloco(bloco);
		vaga.setNumero(numero);
		
		vagaRepository.save(vaga);
		return vaga;
	}
	
	public Vaga alterar(Vaga vaga, String id) {
		vaga.setId(Integer.parseInt(id));
		return vagaRepository.save(vaga);
	}
	
	public String remover(String id) {
		try {
			vagaRepository.deleteById(Integer.parseInt(id));
			return "Vaga deletada com sucesso.";
		} catch (Exception e) {
			return e.toString();
		}
	}
}