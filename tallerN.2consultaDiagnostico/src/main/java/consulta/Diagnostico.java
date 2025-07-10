package consulta;

public class Diagnostico {
    
    private String descripcion;
    private String tratamiento;

    public Diagnostico(String descripcion, String tratamiento) {
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
    }
  
    public boolean esTratamientoLargo(String tratamiento) {
        if (tratamiento.length() >= 30){
            return true;
        } else {     
    }
        return false;
    }
     
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
  
    
    public static void main(String[] largs) {
        
       String trataMento = "Medicamento";
       String dosis = "10 mg";
       String descripcion = "fuerte insomio";
       
       String tratamiento = trataMento + "mediacmento " + dosis + " 10 dosis " + descripcion + "fuerte insomio";
       System.out.println(tratamiento);
    }
      
}
      
       
            
        
  
