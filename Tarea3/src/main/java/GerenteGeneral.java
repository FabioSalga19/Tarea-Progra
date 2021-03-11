
public class GerenteGeneral {
    private String identidad;
    private String nombre;
    private String apellido;
    private String salario;
    private String sexo;
    
    public GerenteGeneral(){    
    }
    
    public GerenteGeneral(String identidad, String nombre, String apellido, String salario, String sexo){
        this.setIdentidad (identidad);
         this.setNombre(nombre);
          this.setApellido(apellido);
           this.setSalario(salario);
            this.setSexo(sexo);
           
            }
            
    public String getIdentidad(){
        return identidad;
  }
    
    public String getNombre(){
        return nombre;
  }
    
    public String getApellido(){
        return apellido;
  }
    
    public String getSalario(){
        return salario;
  }
    
    public String getSexo(){
        return sexo;
  }
    
    public void setIdentidad(String _identidad){
        this.identidad=_identidad;

}
    
   public void setNombre(String _nombre){
        this.nombre=_nombre;

}
   public void setApellido(String _apellido){
        this.apellido=_apellido;

}
   public void setSalario(String _salario){
        this.salario=_salario;

}
  public void setSexo(String _sexo){
        this.sexo=_sexo;

}

    
    
    
    
    
    
}