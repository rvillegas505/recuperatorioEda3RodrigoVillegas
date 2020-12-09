package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.Acuatico;
import ar.edu.unlam.pb2.eva03.Terrestre;
import ar.edu.unlam.pb2.eva03.Volador;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	//agregadopormi
	private String nombre;
	
	
	public Batalla(Double latitud, Double longitud, TipoDeBatalla tipo, Set<Vehiculo> vehiculosEnLaBatalla) {
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		//this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
		vehiculosEnLaBatalla=new HashSet<Vehiculo>();
	}
	
	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.nombre=nombre;
		this.tipo = tipo;
		this.latitud = latitud;
		this.longitud = longitud;
		vehiculosEnLaBatalla=new HashSet<Vehiculo>();
	}


	public void agregarVehiculo(Vehiculo nuevo) {
		vehiculosEnLaBatalla.add(nuevo);
		
	}
	
	public Vehiculo getVehiculoBatalla(Integer integer) {
		//Vehiculo aMostrar= new Vehiculo(1,"vehiculo");
		for(Vehiculo i: vehiculosEnLaBatalla) {
			if(i.getNumero()==integer) 
				return i;
			 			
		}
		return null;
		
	}
	
	
	
	//getters setters
	
	public Double getLatitud() {
		return latitud;
	}

	
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	
	public Double getLongitud() {
		return longitud;
	}

	
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	
	public TipoDeBatalla getTipo() {
		return tipo;
	}

	
	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	
	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	
	public void setVehiculosEnLaBatalla(Set<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
	
	
	
}
