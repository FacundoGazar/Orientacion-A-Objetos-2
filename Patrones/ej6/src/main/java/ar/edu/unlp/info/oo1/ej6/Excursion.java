package ar.edu.unlp.info.oo1.ej6;

import java.time.LocalDate;

import java.util.List;
import java.util.ArrayList;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoDeEncuentro;
	private Double costo;
	private Integer cupoMin;
	private Integer cupoMax;
	private ExcursionState state;
	private List<Cliente> listaDeEspera;
	private List<Cliente> listaClientes;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoDeEncuentro, Double costo,
			Integer cupoMin, Integer cupoMax) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.state = new Provisoria();
		this.listaDeEspera = new ArrayList<Cliente>();
		this.listaClientes = new ArrayList<Cliente>();
	}

	public void inscribir(Cliente unCliente) {
		this.getExcursionState().inscribir(this, unCliente);
	}
	
	public String obtenerInformacion() {
		return "\nNombre de la excursion: "+ this.getNombre() + 
				"\nFecha inicio: "+ this.getFechaInicio() +
				"\nFecha fin: "+ this.getFechaFin() +
				"\nPunto de encuentro: "+ this.getPuntoDeEncuentro()+ this.getExcursionState().obtenerInformacion(this);
	}
	
	public ExcursionState getExcursionState() {
		return this.state;
	}

	public void setExcursionState(ExcursionState state) {
		this.state = state;
	}

	public String getNombre() {
		return this.nombre;
	}

	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}


	public LocalDate getFechaFin() {
		return this.fechaFin;
	}

	public String getPuntoDeEncuentro() {
		return this.puntoDeEncuentro;
	}

	public Integer getCupoMin() {
		return this.cupoMin;
	}

	public List<Cliente> getListaClientes() {
		return this.listaClientes;
	}

	public List<Cliente> getListaDeEspera() {
		return listaDeEspera;
	}

	public Integer getCupoMax() {
		return cupoMax;
	}
	
	
}
