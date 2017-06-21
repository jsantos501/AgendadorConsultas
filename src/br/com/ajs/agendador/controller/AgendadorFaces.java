package br.com.ajs.agendador.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class AgendadorFaces {
	@PostConstruct
	public void init(){
		System.out.println(" Bean executado! ");
	}
	
	public String getMessage(){
		return "Hello World JSF!";
	}
}
