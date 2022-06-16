package pe.edu.upc.demo.serviceimplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.demo.entities.Registro;
import pe.edu.upc.demo.repositories.IRegistroRepository;
import pe.edu.upc.demo.serviceinterface.IRegistroService;

@Service
public class RegistroServiceImpl implements IRegistroService{

	@Autowired
	private IRegistroRepository registroRepository;
	
	
	@Override
	public void Insert(Registro registro) {
		registroRepository.save(registro);
	}

	@Override
	public List<Registro> list() {
		return registroRepository.findAll();
	}

	@Override
	public void Delete(int idRegistro) {
		registroRepository.deleteById(idRegistro);
	}
	
}
