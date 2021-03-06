package br.com.clmDeveloper.mywalkcircling.classes;

import java.util.ArrayList;
import java.util.List;

public class ListPontos{
	
	//private static final long serialVersionUID = 2806421523585360626L;
	
	private List<Ponto> pontos = new ArrayList<>();
	private String msg;

	
	public List<Ponto> getPontos() {
		return pontos;
	}

	public void setPontos(List<Ponto> pontos) {
		this.pontos = pontos;
	}

	public ListPontos(List<Ponto> pontos) {
		super();
		this.pontos = pontos;
	}

	public ListPontos() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void addPonto(Ponto ponto) {
		this.pontos.add(ponto);
	}

	@Override
	public String toString() {
		return "ListPontos [pontos=" + pontos + "]";
	}
	
	
	
	

}
