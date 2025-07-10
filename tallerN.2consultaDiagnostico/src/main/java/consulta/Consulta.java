package consulta;

public class Consulta {

    private String codigo;
    private String fecha;
    private String nombre;
    private int edad;
    private Diagnostico diagnostico;

    public Consulta(String codigo, String fecha, String nombre, int edad, Diagnostico diagnostico) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public void mostrarConsulta(){
        
    System.out.println("Codigo:" + codigo);
    System.out.println("Fecha:" + fecha);
    System.out.println("Nombre:" + nombre);
    System.out.println("Edad:" + edad + "años"); 
    System.out.println("Diagnostico:" + diagnostico.getDescripcion());
    System.out.println("Diagnostico:" + diagnostico.getTratamiento());
  }
    
    
}

    
    