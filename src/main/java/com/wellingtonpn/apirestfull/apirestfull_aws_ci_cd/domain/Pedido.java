package com.wellingtonpn.apirestfull.apirestfull_aws_ci_cd.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.wellingtonpn.apirestfull.apirestfull_aws_ci_cd.domain.enums.StatusDoPedido;

public class Pedido {
	
	private Long id;
	private String item;
	private String descricao;
	private Date dataDeCriacao;
	private StatusDoPedido statusDoPedido;
	private User user;
	private List<EstagioDoPedido> estagioDoPedido = new ArrayList<EstagioDoPedido>();

	public Pedido(Long id, String item, String descricao, Date dataDeCriacao, StatusDoPedido statusDoPedido, User user, List<EstagioDoPedido> estagioDoPedido) {
		super();
		this.id = id;
		this.item = item;
		this.descricao = descricao;
		this.dataDeCriacao = dataDeCriacao;
		this.statusDoPedido = statusDoPedido;
		this.user = user;
		this.dataDeCriacao = dataDeCriacao;
		this.estagioDoPedido = estagioDoPedido;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}
	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}
	public StatusDoPedido getStatusDoPedido() {
		return statusDoPedido;
	}
	public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
		this.statusDoPedido = statusDoPedido;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<EstagioDoPedido> getEstagioDoPedido() {
		return estagioDoPedido;
	}
	public void setEstagioDoPedido(List<EstagioDoPedido> estagioDoPedido) {
		this.estagioDoPedido = estagioDoPedido;
	}
	
}
