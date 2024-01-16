package servletstudies.br.com.dev.marcos.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroAPI")
public class CadatroAPI extends HttpServlet {

	private static final long serialVersionUID = 1L;
	List<Usuario> usuarios = new ArrayList<>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		usuarios.add(new Usuario("Marcos", "marcos@teste"));
		usuarios.add(new Usuario("Maria", "maria@teste"));
		usuarios.add(new Usuario("Ellen", "ellen@teste"));
		usuarios.add(new Usuario("Rosa", "rosa@teste"));
		usuarios.add(new Usuario("Marco", "marco@teste"));
		usuarios.add(new Usuario("Lucas", "lucas@teste"));
		
		/**
		 * Transformando objeto para json
		 */
		Gson gson = new Gson();
		String json = gson.toJson(usuarios); //Objeto convertido para json... Só enviar
		
		resp.getWriter().append(json);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Gson gson = new Gson();
		BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
		String line = "";
		StringBuilder sb = new StringBuilder();
		while((line = br.readLine()) != null) {
			sb.append(line);
		}
		System.out.println(sb.toString());
		Usuario usuario = gson.fromJson(sb.toString(), Usuario.class);
		
		usuarios.add(usuario);
	}
	
	
	public class Usuario implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		private String name;
		private String email;
		
		public Usuario(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
	}
	
}
