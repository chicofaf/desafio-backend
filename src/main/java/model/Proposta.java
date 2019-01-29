package model;

import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "proposta")
public class Proposta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "id")
	private Integer id;

	@XmlElement(name = "nome")
	private String nome;
	
	@XmlElement(name = "sexo")
	private String sexo;
	
	@XmlElement(name = "estado_civil")
	private String estadoCivil;
	
	@XmlElement(name = "estado")
	private String estado;
	
	@XmlElement(name = "idade")
	private Integer idade;
	
	@XmlElement(name = "dependentes")
	private Integer dependentes;
	
	@XmlElement(name = "renda")
	private Integer renda;
	
	@XmlElement(name = "resultado_analise")
	private String resultadoAnalise;
	
	@XmlElement(name = "limite")
	private String limite;
	
	@XmlElement(name = "cpf")
	private String cpf;
	
	public Proposta(Integer id, String nome, String sexo, String estadoCivil, String estado, Integer idade,
			Integer dependentes, Integer renda, String resultadoAnalise, String limite, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.estado = estado;
		this.idade = idade;
		this.dependentes = dependentes;
		this.renda = renda;
		this.resultadoAnalise = resultadoAnalise;
		this.limite = limite;
		this.cpf = cpf;
	}
	
	public Proposta() {
		this(null,null,null,null,null,null,null,null,null,null,null);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getDependentes() {
		return dependentes;
	}

	public void setDependentes(Integer dependentes) {
		this.dependentes = dependentes;
	}

	public Integer getRenda() {
		return renda;
	}

	public void setRenda(Integer renda) {
		this.renda = renda;
	}

	public String getResultadoAnalise() {
		return resultadoAnalise;
	}

	public void setResultadoAnalise(String resultadoAnalise) {
		this.resultadoAnalise = resultadoAnalise;
	}

	public String getLimite() {
		return limite;
	}

	public void setLimite(String limite) {
		this.limite = limite;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
		
}
