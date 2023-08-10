package br.com.jffw.cae.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "SENHA")
	private String senha;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "DTCADASTRO")
	private Date dtCadastro;

	@Column(name = "NIVELACESSO")
	private String nivelAcesso;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usuario")
//    private List<Proprietario> proprietarios;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		
		this.dtCadastro = dtCadastro;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public void setDataCadastro(String dtCadastro) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		this.setDtCadastro(df.parse(dtCadastro));
	}

//	public List<Proprietario> getProprietarios() {
//		return proprietarios;
//	}
//
//	public void setProprietarios(List<Proprietario> proprietarios) {
//		this.proprietarios = proprietarios;
//	}

}
