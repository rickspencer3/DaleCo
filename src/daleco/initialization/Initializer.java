package daleco.initialization;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daleco.database.DatabaseConfig;
import daleco.database.DatabaseCreate;
import daleco.database.DatabaseGetPropertyValues;

/**
 * Servlet implementation class Initializer
 */
@WebServlet(description = "Initializes the database and other necessary set up", urlPatterns = { "/Initializer" })
public class Initializer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Initializer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init( ) {
    		System.out.println("First run, checking for database ...");
    		DatabaseConfig dbconfig = null;
    		if(!dbExists()) {
    			System.out.println("Daleco database not found, initializing ...");
    			DatabaseGetPropertyValues dbpropvalues = new DatabaseGetPropertyValues();
    			try {
    					dbconfig =dbpropvalues.getPropValues();
					System.out.println("User: " + dbconfig.GetUser());
					System.out.println("Password: " + dbconfig.GetPassword());
					System.out.println("Host: " + dbconfig.GetHost());
					
					DatabaseCreate dbcreate = new DatabaseCreate(dbconfig);
					dbcreate.create();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			// create the database
    		}
    }
    
    private boolean dbExists() {
    		return false;
    }
}