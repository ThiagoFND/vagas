package br.com.analise.vagas.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vagas")
public class Vagas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "cargo")
	private String cargoVaga;
	@Column(name = "java")
	private Boolean java;
	@Column(name = "eclipse")
	private Boolean eclipse;
	@Column(name = "api")
	private Boolean api;
	@Column(name = "pl_sql")
	private Boolean pl_sql;
	@Column(name = "programacao")
	private Boolean programacao;
	@Column(name = "api_restful")
	private Boolean apiRestful;
	@Column(name = "springmvc")
	private Boolean springMVC;
	@Column(name = "apache_struts")
	private Boolean apacheStruts;
	@Column(name = "jsp")
	private Boolean jsp;
	@Column(name = "junit")
	private Boolean junit;
	@Column(name = "json")
	private Boolean json;
	@Column(name = "hibernate")
	private Boolean hibernate;
	@Column(name = "jakarte_EE")
	private Boolean jakartaEE;
	@Column(name = "jsf")
	private Boolean jsf;
	@Column(name = "mysql")
	private Boolean mysql;
	@Column(name = "nosql")
	private Boolean nosql;
	@Column(name = "outro")
	private String outro;

	public Vagas() {
	}

	public Vagas(Long id, String cargoVaga, Boolean java, Boolean eclipse, Boolean api, Boolean pl_sql,
			Boolean programacao, Boolean apiRestful, Boolean springMVC, Boolean apacheStruts, Boolean jsp,
			Boolean junit, Boolean json, Boolean hibernate, Boolean jakartaEE, Boolean jsf, Boolean mysql,
			Boolean nosql, String outro) {
		super();
		this.id = id;
		this.cargoVaga = cargoVaga;
		this.java = java;
		this.eclipse = eclipse;
		this.api = api;
		this.pl_sql = pl_sql;
		this.programacao = programacao;
		this.apiRestful = apiRestful;
		this.springMVC = springMVC;
		this.apacheStruts = apacheStruts;
		this.jsp = jsp;
		this.junit = junit;
		this.json = json;
		this.hibernate = hibernate;
		this.jakartaEE = jakartaEE;
		this.jsf = jsf;
		this.mysql = mysql;
		this.nosql = nosql;
		this.outro = outro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCargoVaga() {
		return cargoVaga;
	}

	public void setCargoVaga(String cargoVaga) {
		this.cargoVaga = cargoVaga;
	}

	public Boolean getJava() {
		return java;
	}

	public void setJava(Boolean java) {
		this.java = java;
	}

	public Boolean getEclipse() {
		return eclipse;
	}

	public void setEclipse(Boolean eclipse) {
		this.eclipse = eclipse;
	}

	public Boolean getApi() {
		return api;
	}

	public void setApi(Boolean api) {
		this.api = api;
	}

	public Boolean getPl_sql() {
		return pl_sql;
	}

	public void setPl_sql(Boolean pl_sql) {
		this.pl_sql = pl_sql;
	}

	public Boolean getProgramacao() {
		return programacao;
	}

	public void setProgramacao(Boolean programacao) {
		this.programacao = programacao;
	}

	public Boolean getApiRestful() {
		return apiRestful;
	}

	public void setApiRestful(Boolean apiRestful) {
		this.apiRestful = apiRestful;
	}

	public Boolean getSpringMVC() {
		return springMVC;
	}

	public void setSpringMVC(Boolean springMVC) {
		this.springMVC = springMVC;
	}

	public Boolean getApacheStruts() {
		return apacheStruts;
	}

	public void setApacheStruts(Boolean apacheStruts) {
		this.apacheStruts = apacheStruts;
	}

	public Boolean getJsp() {
		return jsp;
	}

	public void setJsp(Boolean jsp) {
		this.jsp = jsp;
	}

	public Boolean getJunit() {
		return junit;
	}

	public void setJunit(Boolean junit) {
		this.junit = junit;
	}

	public Boolean getJson() {
		return json;
	}

	public void setJson(Boolean json) {
		this.json = json;
	}

	public Boolean getHibernate() {
		return hibernate;
	}

	public void setHibernate(Boolean hibernate) {
		this.hibernate = hibernate;
	}

	public Boolean getJakartaEE() {
		return jakartaEE;
	}

	public void setJakartaEE(Boolean jakartaEE) {
		this.jakartaEE = jakartaEE;
	}

	public Boolean getJsf() {
		return jsf;
	}

	public void setJsf(Boolean jsf) {
		this.jsf = jsf;
	}

	public Boolean getMysql() {
		return mysql;
	}

	public void setMysql(Boolean mysql) {
		this.mysql = mysql;
	}

	public Boolean getNosql() {
		return nosql;
	}

	public void setNosql(Boolean nosql) {
		this.nosql = nosql;
	}

	public String getOutro() {
		return outro;
	}

	public void setOutro(String outro) {
		this.outro = outro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apacheStruts, api, apiRestful, cargoVaga, eclipse, hibernate, id, jakartaEE, java, jsf,
				json, jsp, junit, mysql, nosql, outro, pl_sql, programacao, springMVC);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vagas other = (Vagas) obj;
		return Objects.equals(apacheStruts, other.apacheStruts) && Objects.equals(api, other.api)
				&& Objects.equals(apiRestful, other.apiRestful) && Objects.equals(cargoVaga, other.cargoVaga)
				&& Objects.equals(eclipse, other.eclipse) && Objects.equals(hibernate, other.hibernate)
				&& Objects.equals(id, other.id) && Objects.equals(jakartaEE, other.jakartaEE)
				&& Objects.equals(java, other.java) && Objects.equals(jsf, other.jsf)
				&& Objects.equals(json, other.json) && Objects.equals(jsp, other.jsp)
				&& Objects.equals(junit, other.junit) && Objects.equals(mysql, other.mysql)
				&& Objects.equals(nosql, other.nosql) && Objects.equals(outro, other.outro)
				&& Objects.equals(pl_sql, other.pl_sql) && Objects.equals(programacao, other.programacao)
				&& Objects.equals(springMVC, other.springMVC);
	}

}
