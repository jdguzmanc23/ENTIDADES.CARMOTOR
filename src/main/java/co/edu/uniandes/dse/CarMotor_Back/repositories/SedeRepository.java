package co.edu.uniandes.dse.CarMotor_Back.repositories;

import co.edu.uniandes.dse.CarMotor_Back.entities.SedeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SedeRepository extends JpaRepository<SedeEntity, Long> {

    // Método para encontrar sedes por nombre
    List<SedeEntity> findByNombre(String nombre);
    
    // Método para encontrar sedes por dirección
    List<SedeEntity> findByDireccion(String direccion);
}
