package pe.edu.upc.demo.serviceinterface;

import java.util.List;

import pe.edu.upc.demo.entities.Registro;

public interface IRegistroService {
	public void Insert(Registro registro);
	public List<Registro> list();
	public void Delete(int idRegistro);
}
