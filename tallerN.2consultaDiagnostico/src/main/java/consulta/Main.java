
package consulta;
 
public class Main {

    public static void main(String[] args) {
        Diagnostico d = new Diagnostico("insomio severo", "profundo descanso diario");
        
        Consulta consulta = new Consulta("0212120","5 de mayo", "Daniel Felipe", 34, d);
        
        consulta.mostrarConsulta();  
    }
}
