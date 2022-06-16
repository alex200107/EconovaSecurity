package pe.edu.upc.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.demo.entities.Ingreso;

@Repository
public interface IingresoRepository extends JpaRepository<Ingreso, Integer>{

}
