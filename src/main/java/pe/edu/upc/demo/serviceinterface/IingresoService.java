package pe.edu.upc.demo.serviceinterface;

import java.util.List;

import pe.edu.upc.demo.entities.Ingreso;

public interface IingresoService {
	public void Insert(Ingreso ingreso);
	public List<Ingreso> list();
	public void Delete(int idIngreso);
}
