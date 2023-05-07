package pe.cibertec.JaimeReyna.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Especialidad")
public class Especialidad {
	@Id
	@Column(name = "idesp")
	private String idesp;
	@Column(name = "nomesp")
	private String nomesp;
	@Column(name = "costo")
	private String costo;
	

}
