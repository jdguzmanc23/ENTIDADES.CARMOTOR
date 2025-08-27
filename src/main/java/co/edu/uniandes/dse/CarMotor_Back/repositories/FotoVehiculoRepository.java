package co.edu.uniandes.dse.CarMotor_Back.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uniandes.dse.CarMotor_Back.entities.FotoVehiculoEntity;

public interface FotoVehiculoRepository extends JpaRepository<FotoVehiculoEntity, Long> {
// Aquí pues se listan la fotos por vehículo
    List<FotoVehiculoEntity> findByVehiculo_IdOrderByPrincipalDesc(Long vehiculoId);

//Se intenta obtener la foto principal (si es que ya existe)
    Optional<FotoVehiculoEntity> findFirstByVehiculo_IdAndPrincipalTrue(Long vehiculoId);

// Contamos en este caso las principales (es claramente útil para validar el "máximo 1 principal")
    long countByVehiculo_IdAndPrincipalTrue(Long vehiculoId);
}
