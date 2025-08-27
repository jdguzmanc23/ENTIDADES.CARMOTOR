package co.edu.uniandes.dse.CarMotor_Back.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class testdriveEntity extends BaseEntity {

    @Column(nullable = false)
    private LocalDateTime inicio;

    @Column(nullable = false)
    private LocalDateTime fin;

    @Enumerated(EnumType.STRING)
    private estadotestEntity estado;

    @ManyToOne
    @JoinColumn(nullable = false)
    private ClienteEntity cliente;

    @ManyToOne
    private SedeEntity sede;

    @ManyToOne
    @JoinColumn(nullable = false)
    private vehiculoEntity vehiculo;

    @ManyToOne
     // Equi esta la clave foránea que apunta a Asesor
    @JoinColumn(name = "asesor_id", nullable = false)
    private AsesorEntity asesor;



}