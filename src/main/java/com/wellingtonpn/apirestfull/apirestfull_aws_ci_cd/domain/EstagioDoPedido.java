package com.wellingtonpn.apirestfull.apirestfull_aws_ci_cd.domain;

import java.util.Date;

import com.wellingtonpn.apirestfull.apirestfull_aws_ci_cd.domain.enums.StatusDoPedido;

public class EstagioDoPedido {
	
	private Long id;
	private Date dataDeRealizacaoDoPedido;
	private String descricao;
	private StatusDoPedido statusDoPedido;
	private Pedido pedido;
	private User user;
	
	public EstagioDoPedido() {
		super();
	}

	public EstagioDoPedido(Long id, Date dataDeRealizacaoDoPedido, String descricao, StatusDoPedido statusDoPedido,
			Pedido pedido, User user) {
		super();
		this.id = id;
		this.dataDeRealizacaoDoPedido = dataDeRealizacaoDoPedido;
		this.descricao = descricao;
		this.statusDoPedido = statusDoPedido;
		this.pedido = pedido;
		this.user = user;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataDeRealizacaoDoPedido() {
		return dataDeRealizacaoDoPedido;
	}
	public void setDataDeRealizacaoDoPedido(Date dataDeRealizacaoDoPedido) {
		this.dataDeRealizacaoDoPedido = dataDeRealizacaoDoPedido;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public StatusDoPedido getStatusDoPedido() {
		return statusDoPedido;
	}
	public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
		this.statusDoPedido = statusDoPedido;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
