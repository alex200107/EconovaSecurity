package pe.edu.upc.demo.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.demo.entities.TypeSuscription;
import pe.edu.upc.demo.repositories.ITypeSuscriptionRepository;
import pe.edu.upc.demo.serviceinterface.ITypeSuscriptionService;

@Service
public class TypeSuscriptionServiceImpl implements ITypeSuscriptionService{

	@Autowired
	private ITypeSuscriptionRepository typesuscriptionRepository;
	
	
	@Override
	public void Insert(TypeSuscription typesuscription) {
		typesuscriptionRepository.save(typesuscription);
	}

	@Override
	public List<TypeSuscription> list() {
		return typesuscriptionRepository.findAll();
	}

	@Override
	public void Delete(int idTypeSuscription) {
		typesuscriptionRepository.deleteById(idTypeSuscription);
	}

	@Override
	public void modificar(TypeSuscription typesuscription) {
		typesuscriptionRepository.save(typesuscription);
	}

	@Override
	public Optional<TypeSuscription> listarId(int idTypeSuscription) {
		return typesuscriptionRepository.findById(idTypeSuscription);
	}
	

	
}
