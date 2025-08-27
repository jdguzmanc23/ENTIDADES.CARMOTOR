package co.edu.uniandes.dse.CarMotor_Back.repositories;

import co.edu.uniandes.dse.CarMotor_Back.entities.AsesorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsesorRepository extends JpaRepository<AsesorEntity, Long> {
    
    
//Este es un método para encontrar asesores por sede
    List<AsesorEntity> findBySede_Id(Long sedeId);
//Y este otro método para encontrar asesores por nombre
    List<AsesorEntity> findByNombre(String nombre);
}

