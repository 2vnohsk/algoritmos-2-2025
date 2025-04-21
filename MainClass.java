
public class MainClass {
	
	public static void main(String[] args)
	{ Empleado empleado1= new Empleado();

		empleado1.setNombre("carlos");
		empleado1.setTelefono("310420078");
		empleado1.setDireccion("calle 1,2,3");
		empleado1.mostrarInformacion();


		Empresa miEmpresa=new Empresa();
		miEmpresa.setNombre("COMPANY");
		miEmpresa.setDireccion("calle 3,4,5");
		miEmpresa.setNIT("312876389");
		miEmpresa.mostrarInformacion();
		
				
		
	}

}
