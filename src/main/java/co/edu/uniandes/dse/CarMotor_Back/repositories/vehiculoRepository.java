package co.edu.uniandes.dse.CarMotor_Back.repositories;

import co.edu.uniandes.dse.CarMotor_Back.entities.EstadoVehiculoEntity;
import co.edu.uniandes.dse.CarMotor_Back.entities.TipoVehiculoEntity;
import co.edu.uniandes.dse.CarMotor_Back.entities.vehiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface vehiculoRepository extends JpaRepository<vehiculoEntity, Long> {
    
    // Método para encontrar vehículos por estado
    List<vehiculoEntity> findByEstado(EstadoVehiculoEntity estado);
    
    // Método para encontrar vehículos por marca
    List<vehiculoEntity> findByMarca(String marca);

    // Método para encontrar vehículos por tipo
    List<vehiculoEntity> findByTipo(TipoVehiculoEntity tipo);
}
