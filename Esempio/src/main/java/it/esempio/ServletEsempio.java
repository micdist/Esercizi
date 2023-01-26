package it.esempio;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletEsempio
 */
@WebServlet("/home")
public class ServletEsempio extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * Default constructor.
	 */
	public ServletEsempio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection connection = null;

		String elenco = " ";
		String esito = " ";
		try {
			//Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\mdistefano\\eclipse-workspace\\Esempio\\chinook.db","","");
			Statement statement = connection.createStatement();
			//ResultSet rs = statement.executeQuery("SELECT tracks.TrackId, tracks.Name, albums.Title, genres.Name as genre, tracks.Composer FROM tracks, genres, albums WHERE tracks.AlbumId = albums.AlbumId AND genres.GenreId = tracks.GenreId ORDER BY tracks.TrackId");
			ResultSet rs = statement.executeQuery("SELECT tracks.Name FROM tracks WHERE tracks.TrackId < 5 ORDER BY tracks.TrackId");
		
			//
			while (rs.next()) {
				elenco += rs.getString("Name");
				elenco += elenco + "\n";

			}
			//HttpSession session = request.getSession();
			//session.setAttribute("tracks", elenco);
			// elenco += " x ";
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		// response.getWriter().append("valore: "+ elenco);

		
		response.getWriter().append("valori trovati: " + elenco.trim().length()+"\n " + elenco);
	}

	// response.getWriter().append("Served at: ").append(request.getContextPath());
	// response.getWriter().append("trovati: " + dati.size()+ "").append("\n " +
	// elenco);
	// request.getServletContext().getRequestDispatcher("/Pagina.jsp").forward(request,
	// response);

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
