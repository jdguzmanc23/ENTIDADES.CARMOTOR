package co.edu.uniandes.dse.CarMotor_Back.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uniandes.dse.CarMotor_Back.entities.ClienteEntity;
import co.edu.uniandes.dse.CarMotor_Back.entities.SedeEntity;
import co.edu.uniandes.dse.CarMotor_Back.entities.testdriveEntity;

public interface testdriveRepository extends JpaRepository<testdriveEntity, Long> {
    List<testdriveEntity> findByCliente(ClienteEntity cliente);
    List<testdriveEntity> findBySede(SedeEntity sede);
    List<testdriveEntity> findByInicioBetween(LocalDateTime desde, LocalDateTime hasta);
}