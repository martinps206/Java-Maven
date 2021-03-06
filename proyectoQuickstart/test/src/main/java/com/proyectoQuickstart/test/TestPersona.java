package com.proyectoQuickstart.test;
/*
import java.lang.System.Logger;
import java.util.logging.LogManager;*/
import com.proyectoQuickstart.entidades.Persona;
import com.proyectoQuickstart.servicios.ServicioPersona;


public class TestPersona {
	
	private static ServicioPersona sp;
	//private static Logger LOGGER = LogManager.getLogger(TestPersona.class);
	
	public static void main(String[] args) {
		/*
		try {
			sp = new ServicioPersona();
		} catch (Exception e) {
			System.out.println("Se ha producido un error ene l sistema");
			LOGGER.error("Error en el sistema", e);
		} */
		
		
		sp = new ServicioPersona();
		
		sp.insertarPersona(new Persona("12345678", "Diego", "Paliza"));
		sp.insertarPersona(new Persona("45678912", "Valeria", "Paliza"));
		sp.insertarPersona(new Persona("14785236", "Sandra", "Falcon"));
		
		for (Persona persona : sp.mostrarPerona()) {
			System.out.println(persona);
		}
		
		sp.eliminarPersona("147854236");
		System.out.println("------------------------------");
		for (Persona persona : sp.mostrarPerona()) {
			System.out.println(persona);
		}
		System.out.println("------------------------------");
		System.out.println(sp.buscarPersona("12345678"));
	}

}
