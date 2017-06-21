package br.com.ajs.agendador.model;

import java.io.Serializable;

public class AgendadorModel  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4983156319765983817L;

	private String loginName;
	private String password;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
