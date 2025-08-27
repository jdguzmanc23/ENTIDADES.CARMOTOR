package co.edu.uniandes.dse.CarMotor_Back.entities;

import java.math.BigDecimal;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString

@Getter
@Setter


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class vehiculoEntity extends BaseEntity {
    private String marca;

// Seria el VIN
    private String serie;

    private Integer ultimoDigitoPlaca;

// REquerimiento basico de Año
    private Integer modelo;

// Este es un requerimiento del mismo tipo de Vehiculo: SUV, Camioneta 4x4, otros??
    private TipoVehiculoEntity tipo;
    private Integer capacidadPasajeros;
    private BigDecimal precio;
 // Nos muestra el estado del vehiculo DISPONIBLE, VENDIDO
    private EstadoVehiculoEntity estado;
    private boolean esAsegurableTodoRiesgo = false;
    private BigDecimal valorPolizaAprox;

// Acontinuación se ve todas las posibles relaciones Relaciones
    @ManyToOne
    private SedeEntity sede;
    // Nueva relación ManyToOne con Asesor
    @ManyToOne
    private AsesorEntity asesor;

    // Nueva relación OneToMany con FotoVehiculo
    @OneToMany(mappedBy = "vehiculo")
    private List<FotoVehiculoEntity> fotos;

    // Nueva relación OneToMany con TestDrive
    @OneToMany(mappedBy = "vehiculo")
    private List<testdriveEntity> testDrives;
}