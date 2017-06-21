package br.com.ajs.agendador.service;

import java.util.HashMap;
import java.util.Map;

import br.com.ajs.agendador.exception.AgendadorException;
import br.com.ajs.agendador.model.AgendadorModel;

public class AgendadorService {

	private Map<String, String> loginCredentialsMap = new HashMap<String, String>();

	public String performLogin(AgendadorModel loginCredentials) throws AgendadorException {

		if (loginCredentials.getLoginName() == null || loginCredentials.getLoginName().trim().equals("")
				|| loginCredentials.getPassword() == null || loginCredentials.getPassword().trim().equals("")) {
			throw new AgendadorException();
		}

		String password = loginCredentialsMap.get(loginCredentials.getLoginName());
		if (password == null || !password.equals(loginCredentials.getPassword())) {
			throw new AgendadorException();
		}

		return "success";

	}

	public void createNewAccount(AgendadorModel loginCredentials) throws AgendadorException {
		if (loginCredentials.getLoginName() == null || loginCredentials.getLoginName().trim().equals("")
				|| loginCredentials.getPassword() == null || loginCredentials.getPassword().trim().equals("")) {
			throw new AgendadorException();
		}

		loginCredentialsMap.put(loginCredentials.getLoginName(), loginCredentials.getPassword());
	}
	
}
