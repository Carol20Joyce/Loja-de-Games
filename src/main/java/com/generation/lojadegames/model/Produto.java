package com.generation.lojadegames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto") /* CREATE TABLE tb_produto */
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O Atributo título é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve ter no mínimo 05 e no máximo 100 caracteres")
	private String nome;

	@NotBlank(message = "O Atributo título é obrigatório")
	@Size(min = 10, max = 1000, message = "O atributo título deve ter no mínimo 10 e no máximo 1000 caracteres")
	private String descricao;

	@NotBlank(message = "O Atributo título é obrigatório")
	private String plataforma;

	@NotNull(message = "O Atributo título é obrigatório")
	private int quantidade;

	@UpdateTimestamp
	@NotNull(message = "O Atributo título é obrigatório")
	private LocalDate datadelancamento;

	@NotNull(message = "O Atributo título é obrigatório")
	private BigDecimal preco;

	private String foto;

	private Long curtir;

	/* Relacionamento */

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDatadelancamento() {
		return datadelancamento;
	}

	public void setDatadelancamento(LocalDate datadelancamento) {
		this.datadelancamento = datadelancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Long getCurtir() {
		return curtir;
	}

	public void setCurtir(Long curtir) {
		this.curtir = curtir;
	}
	/* Criar os Métodos Get e Set do Objeto Categoria */

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
