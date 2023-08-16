package br.com.jffw.cae.controllers.api;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jffw.cae.models.Vaga;
import br.com.jffw.cae.services.VagaService;

@RestController @RequestMapping("/api/vagas")
public class ApiVagaController {
	
	private VagaService vagaService;
	
	public ApiVagaController(VagaService vagaService) {
		this.vagaService = vagaService;
	}
	
	@GetMapping("/todos")
	public List<Vaga> listarVagas() {
		return vagaService.listar();
	}
	
	@PostMapping("/")
	public ResponseEntity<Object> incluirVaga(@RequestBody Vaga vaga) {
		try {
			return new ResponseEntity<Object>(vagaService.incluir(vaga), HttpStatus.CREATED);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.toString());
		}
	}
	
	@PostMapping("/incluir")
	public Vaga incluirVaga(@RequestBody Map<String, String> dados) {
		try {
			return vagaService.incluirVaga(dados);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@PutMapping("/{id}")
	public Vaga alterarVaga(@RequestBody Vaga vaga, @PathVariable String id) {
		return vagaService.alterar(vaga, id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> removerVaga(@PathVariable String id){
		return new ResponseEntity<String>(vagaService.remover(id), HttpStatus.ACCEPTED);
	}
}
