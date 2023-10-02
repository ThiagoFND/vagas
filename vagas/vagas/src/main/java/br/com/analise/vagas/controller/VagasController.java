package br.com.analise.vagas.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.analise.vagas.dto.VagasDTO;
import br.com.analise.vagas.service.VagasService;
@RestController
@RequestMapping("/api/vagas")
public class VagasController {

	@Autowired
	private VagasService vagasService;

	// Endpoint para adicionar um novo contato na agenda
	@PostMapping(value = "/create",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public VagasDTO create(@RequestBody VagasDTO clinica) {
		return vagasService.create(clinica);
	}
	
	// Endpoint para obter todos os contatos da agenda
	@GetMapping(value = "/list",
		produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VagasDTO> findAll() {
		return vagasService.findAll();
	}
	
	// Endpoint para atualizar os dados da agenda
	@PutMapping(value = "/update/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public VagasDTO update(@PathVariable Long id, @RequestBody VagasDTO vagas) {
		// Verifique se o ID é válido (não nulo)
		if (id == null) {
			throw new IllegalArgumentException("O ID não pode ser nulo.");
		}
		// Configure o ID no objeto 'exames'
		vagas.setId(id);

		// Chame o serviço 'examesService' para atualizar o exame
		VagasDTO updatedExame = vagasService.update(vagas);
		return updatedExame;
	}
	
	// Endpoint para excluir um contato pelo id
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
		vagasService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
