package com.cuc.hipertencion.models;

//Name: Formulario Health
//WebHost pass : &Fjb@NJNjyCen852ilr!

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="CrudHealth")
public class Crud {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCrud_Sequence")
	@SequenceGenerator(name = "idCrud_Sequence", sequenceName = "idCrud_Sequence", allocationSize = 1, initialValue = 1)
	private Long id;
	
	@Column(name="nombre", nullable=false, unique=true)
	private String nombre;
	
	@Column(name="pais", nullable=false)
	private String pais;
	
	@Column(name="departamento", nullable=false)
	private String departamento;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	
	@Column(name="peso", nullable=false)
	private Integer peso;
	
	@Column(name="altura", nullable=false)
	private Double altura;
	
	@Column(name="perimetroCintura", nullable=false)
	private Double perimetroCintura;
	
	@Column(name="tiempoActividadFisica", nullable=false)
	private Integer tiempoActividadFisica;
	
	@Column(name="tomaMedHiper", nullable=false)
	private boolean tomaMedHiper;
	
	@Column(name="presionArt", nullable=false)
	private String presionArt;
	
	@Column(name="presionDiast", nullable=false)
	private String presionDiast;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPerimetroCintura() {
		return perimetroCintura;
	}

	public void setPerimetroCintura(Double perimetroCintura) {
		this.perimetroCintura = perimetroCintura;
	}

	public Integer getTiempoActividadFisica() {
		return tiempoActividadFisica;
	}

	public void setTiempoActividadFisica(Integer tiempoActividadFisica) {
		this.tiempoActividadFisica = tiempoActividadFisica;
	}

	public boolean isTomaMedHiper() {
		return tomaMedHiper;
	}

	public void setTomaMedHiper(boolean tomaMedHiper) {
		this.tomaMedHiper = tomaMedHiper;
	}

	public String getPresionArt() {
		return presionArt;
	}

	public void setPresionArt(String presionArt) {
		this.presionArt = presionArt;
	}

	public String getPresionDiast() {
		return presionDiast;
	}

	public void setPresionDiast(String presionDiast) {
		this.presionDiast = presionDiast;
	}
	
	
	
	
}
