package co.edu.uniandes.dse.CarMotor_Back.entities;

public enum TipoVehiculoEntity {
    SUV("SUV", "Vehículo utilitario deportivo"),
    CUATRO_X_CUATRO("4x4", "Tracción en las cuatro ruedas"),
    COUPE("Coupé", "Automóvil de dos puertas"),
    HATCHBACK("Hatchback", "Vehículo con portón trasero"),
    SEDAN("Sedán", "Automóvil de tres volúmenes");
    
    private final String nombre;
    private final String descripcion;
    
    TipoVehiculoEntity(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
}
