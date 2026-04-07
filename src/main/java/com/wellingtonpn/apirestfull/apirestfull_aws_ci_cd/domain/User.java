package com.wellingtonpn.apirestfull.apirestfull_aws_ci_cd.domain;

import java.util.ArrayList;
import java.util.List;

import com.wellingtonpn.apirestfull.apirestfull_aws_ci_cd.domain.enums.Role;

public class User {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private Role role;
	private List<Pedido> pedido = new ArrayList<Pedido>();
	private List<EstagioDoPedido> estagioDoPedido = new ArrayList<EstagioDoPedido>();
	
	public User() {
		super();
	}

	public User(Long id, String nome, String email, String senha, Role role, List<Pedido> pedido,
			List<EstagioDoPedido> estagioDoPedido) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.role = role;
		this.pedido = pedido;
		this.estagioDoPedido = estagioDoPedido;
	}

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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public List<EstagioDoPedido> getEstagioDoPedido() {
		return estagioDoPedido;
	}

	public void setEstagioDoPedido(List<EstagioDoPedido> estagioDoPedido) {
		this.estagioDoPedido = estagioDoPedido;
	}
	
	
}
