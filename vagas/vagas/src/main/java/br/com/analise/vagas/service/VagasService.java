package br.com.analise.vagas.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.analise.vagas.dto.VagasDTO;
import br.com.analise.vagas.exception.ResourceNotFoundException;
import br.com.analise.vagas.mapper.DozerMapper;
import br.com.analise.vagas.model.Vagas;
import br.com.analise.vagas.repository.VagasRepository;

@Service
public class VagasService {

	@Autowired
	private VagasRepository vagasRepository;

	private Logger logger = Logger.getLogger(VagasService.class.getName());

	public List<VagasDTO> findAll() {

		logger.info("Finding all exame!");

		return DozerMapper.parseListObjects(vagasRepository.findAll(), VagasDTO.class);
	}

	public VagasDTO findById(Long id) {

		logger.info("Finding one exame!");

		var entity = vagasRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		return DozerMapper.parseObject(entity, VagasDTO.class);
	}

	public VagasDTO create(VagasDTO vagas) {

		logger.info("Creating one exame!");
		var entity = DozerMapper.parseObject(vagas, Vagas.class);
		var vo = DozerMapper.parseObject(vagasRepository.save(entity), VagasDTO.class);
		return vo;
	}

	public VagasDTO update(VagasDTO vagas) {

		logger.info("Updating one exame!");

		var entity = vagasRepository.findById(vagas.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

//		entity.setBairro(clinica.getBairro());
		entity.setId(vagas.getId());
		entity.setApacheStruts(vagas.getApacheStruts());
		entity.setApi(vagas.getApi());
		entity.setApiRestful(vagas.getApiRestful());
		entity.setCargoVaga(vagas.getCargoVaga());
		entity.setEclipse(vagas.getEclipse());
		entity.setHibernate(vagas.getHibernate());
		entity.setJakartaEE(vagas.getJakartaEE());
		entity.setJava(vagas.getJava());
		entity.setJsf(vagas.getJsf());
		entity.setJson(vagas.getJson());
		entity.setJsp(vagas.getJsp());
		entity.setJunit(vagas.getJunit());
		entity.setMysql(vagas.getMysql());
		entity.setNosql(vagas.getNosql());
		entity.setOutro(vagas.getOutro());

		var vo = DozerMapper.parseObject(vagasRepository.save(entity), VagasDTO.class);
		return vo;
	}

	public void delete(Long id) {

		logger.info("Deleting one exame!");

		var entity = vagasRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		vagasRepository.delete(entity);
	}
}
