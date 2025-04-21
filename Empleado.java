
import java.util.Date;

public class Empleado 
{
	
	
	//Atributos:
	private String nombre, direccion, telefono, tipo, eps, fon_pensiones;
	private float salario_base;
	private Date fechaNac;
	
	
	//Métodos:	
	/**
	 * Método constructor de Empleado.
	 * Crea un objeto Empleado sin atributos inicializados.
	 */
	public void setNombre(String nombre){
		this.nombre=nombre;

	}
	
	public Empleado()
	{
		
		
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEps() {
		return eps;
	}
	public void setEps(String eps) {
		this.eps = eps;
	}
	public String getFon_pensiones() {
		return fon_pensiones;
	}
	public void setFon_pensiones(String fon_pensiones) {
		this.fon_pensiones = fon_pensiones;
	}
	public float getSalario_base() {
		return salario_base;
	}
	public void setSalario_base(float salario_base) {
		this.salario_base = salario_base;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getNombre() {
		return nombre;
	}
	public void mostrarInformacion(){
System.out.println("nombre de el empleado:"+nombre);
System.out.println("direcion de el empleado:"+direccion);
System.out.println("telefono de el empleado:"+telefono);
	}
		
	

}
