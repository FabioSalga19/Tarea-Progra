
public class ClaseMain {

   
    public static void main(String[] args) {
        System.out.println("Gerente General de La empresa");
        
        
        GerenteGeneral gerentegeneral = new GerenteGeneral();
        
        gerentegeneral.setIdentidad("0511200200581");
        gerentegeneral.setNombre("Fabio");
        gerentegeneral.setApellido("Salgado");
        gerentegeneral.setSalario("50,000 Lps");
        gerentegeneral.setSexo("Masculino");
        
        System.out.println("La identidad del Gerente General es " + gerentegeneral.getIdentidad());
        System.out.println("El Nombre del Gerente General es " + gerentegeneral.getNombre());
        System.out.println("El Apellido del Gerente General es " + gerentegeneral.getApellido());
        System.out.println("El Salario del Gerente General es " + gerentegeneral.getSalario());
        System.out.println("El Sexo del Gerente General es " + gerentegeneral.getSexo());
        
        
      
        
    }
    
}
