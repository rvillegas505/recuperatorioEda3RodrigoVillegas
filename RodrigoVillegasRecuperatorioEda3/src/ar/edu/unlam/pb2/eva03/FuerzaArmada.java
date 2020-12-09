package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada(){
		this.convoy=new HashSet<Vehiculo>();
		this.batallas=new HashMap<String, Batalla>();
	}
	
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
		
	}


	public Integer getCapacidadDeDefensa() {
		// TODO Auto-generated method stub
		return convoy.size();
	}


	public void crearBatalla(String string, TipoDeBatalla tipo, Double latitud, Double longitud) {
		batallas.put(string, new Batalla(string, tipo, latitud, longitud ));
		
	}


	public Batalla getBatalla(String string) {
	return 	batallas.get(string);
	}

	public Vehiculo getVehiculosAdd(Integer numero) {
		for (Vehiculo i : convoy) {
			if(i.getNumero().equals(numero)==true) {
				return i;
			}
		}
		return null;
	}

	public boolean enviarALaBatalla(String nombrebatalla, Integer nvehiculo) throws VehiculoIncompatible, VehiculoInexistente {
		Batalla batalla = batallas.get(nombrebatalla);
		//Vehiculo vehiculo= batalla.getVehiculoBatalla(nvehiculo);
		Vehiculo vehiculo = getVehiculosAdd(nvehiculo);
		batalla.agregarVehiculo(vehiculo);
		Boolean sepuede=false;
		
		
		switch (batalla.getTipo()) {
		case TERRESTRE:
			if(vehiculo instanceof Terrestre && vehiculo!=null) {
				sepuede=true;
				return sepuede;
			}
			else  {
				sepuede=false;
				throw new VehiculoIncompatible("incompatible");
				
			 
			}
			
			
		case NAVAL:
			if (vehiculo instanceof Acuatico && vehiculo!=null) {
				sepuede=true;
				return sepuede;
				
			}
			else  {
				sepuede=false;
				throw new VehiculoIncompatible("incompatible");
				
				
			}
			
		case AEREA:
			if (vehiculo instanceof Volador && vehiculo!=null) {
				sepuede=true;
				return sepuede;
				
			}
			else {
				sepuede=false;
				throw new VehiculoIncompatible("incompatible");
				
				
			}
		}
		
		
		
		return sepuede;
	} 
	
	
	
	

}
