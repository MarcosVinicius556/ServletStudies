package servletstudies.br.com.dev.marcos.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroUsuario")
public class CadastroUsuario extends HttpServlet {

	private static final long serialVersionUID = 1L;
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/**
		 * Depois de salvar podemos fazer algo ainda chamado outro método
		 */
		System.out.println("SalvarUsuario");
		
		/**
		 * Recuperando dados da requisição
		 */
		String nome = req.getParameter("name");
		String email = req.getParameter("email");
		
		System.out.println("Nome: " + nome);
		System.out.println("E-mail: " + email);
		
		doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("sucesso.jsp"); //Encaminhamos o usuário para outra página
		rd.forward(req, resp);
	}
	
}
