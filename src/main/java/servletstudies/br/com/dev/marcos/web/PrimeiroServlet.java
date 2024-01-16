package servletstudies.br.com.dev.marcos.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet é a classe JAVA que ficara responsável por responder as requisições...
 */
@WebServlet("/hello") //Definindo a rota de acesso
public class PrimeiroServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Com o service conseguimos pegar todas os tipos de requisições
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Funcionou...");
		resp.getWriter().append("<html><h1>Ola Mundo!</h1></html>");
	}
	
}
