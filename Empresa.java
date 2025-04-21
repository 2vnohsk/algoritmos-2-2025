
public class Empresa 
{
	
	//Atributos:
	public String NIT, Nombre, Direccion,Telefono,emai;
	public float capital_inicial;
	
	
	//Métodos:
	
	/**
	 * Constructor de la clase empresa: crea un objeto de esta clase
	 * sin atributos inicializados
	 */
	public Empresa()
	{
		
	}


	public String getNIT() {
		return NIT;
	}


	public void setNIT(String nIT) {
		NIT = nIT;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public String getEmai() {
		return emai;
	}


	public void setEmai(String emai) {
		this.emai = emai;
	}


	public float getCapital_inicial() {
		return capital_inicial;
	}


	public void setCapital_inicial(float capital_inicial) {
		this.capital_inicial = capital_inicial;
	}
	public void mostrarInformacion(){
		System.out.println("nombre de la empresa:"+Nombre);
		System.out.println("direcion la empresa:"+Direccion);
		System.out.println("telefono de la empresa:"+NIT);
			}
	
	

}
