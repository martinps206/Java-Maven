package com.proyectoQuickstart.servicios;

import java.util.ArrayList;
import com.proyectoQuickstart.entidades.Persona;

public class ServicioPersona {
	
	ArrayList<Persona> personas;
	
	public ServicioPersona() {
		personas = new ArrayList<Persona>();
	}
	
	public void insertarPersona(Persona persona) {
		Persona p = buscarPersona(persona.getCedula());
		if (p == null) {
			personas.add(persona);
		}
		
	}
	
	public Persona buscarPersona(String cedula) {
		Persona p = null;
		for (Persona persona : personas) {
			if (persona.getCedula().equalsIgnoreCase(cedula)) {
				p = persona;
			}
		}
		
		return p;
	}
	
	public void eliminarPersona(String cedula) {
		Persona p = buscarPersona(cedula);
		if (p != null) {
			personas.remove(p);
		}
	}
	
	public ArrayList<Persona> mostrarPerona(){
		return personas;
	}

}
