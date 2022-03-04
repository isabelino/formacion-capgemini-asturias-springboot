package com.formacionspringboot.apirest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String nombre;
	
	private String apellido;
	
	@Column(nullable= false, unique= true)
	private String email;
	
	private int telefono;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	
	private String imagen;
	
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="region_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Region region;
	


	@PrePersist
	public void prePersist() {
		
		if(createdAt == null) {
			createdAt = new Date();
		}
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public Region getRegion() {
		return region;
	}


	public void setRegion(Region region) {
		this.region = region;
	}
	
	
	
}
