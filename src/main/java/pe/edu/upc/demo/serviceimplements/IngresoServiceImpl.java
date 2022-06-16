package pe.edu.upc.demo.serviceimplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.demo.entities.Ingreso;
import pe.edu.upc.demo.repositories.IingresoRepository;
import pe.edu.upc.demo.serviceinterface.IingresoService;

@Service
public class IngresoServiceImpl implements IingresoService{

	@Autowired
	private IingresoRepository ingresoRepository;
	
	@Override
	public void Insert(Ingreso ingreso) {
		ingresoRepository.save(ingreso);
	}
	
	@Override
	public List<Ingreso> list() {
		return ingresoRepository.findAll();
	}

	@Override
	public void Delete(int idIngreso) {
		ingresoRepository.deleteById(idIngreso);	
	}
	
}
