package co.edu.uniandes.dse.CarMotor_Back.entities;

public enum EstadoVehiculoEntity {
    DISPONIBLE("Disponible para venta", true),
    VENDIDO("Vehículo ya vendido", false);
    
    
    private final String descripcion;
    private final boolean disponibleParaVenta;
    
    EstadoVehiculoEntity(String descripcion, boolean disponibleParaVenta) {
        this.descripcion = descripcion;
        this.disponibleParaVenta = disponibleParaVenta;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public boolean isDisponibleParaVenta() {
        return disponibleParaVenta;
    }
}
