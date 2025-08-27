package co.edu.uniandes.dse.CarMotor_Back.repositories;
import co.edu.uniandes.dse.CarMotor_Back.entities.bancoConvenioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface bancoConvenioRepository extends JpaRepository<bancoConvenioEntity, Long> {
    List<bancoConvenioEntity> findByNombre(String nombre);
}