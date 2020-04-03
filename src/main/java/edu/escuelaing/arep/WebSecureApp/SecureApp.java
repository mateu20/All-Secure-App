package edu.escuelaing.arep.WebSecureApp;


import static spark.Spark.*;
public class SecureApp 
{
    public static void main( String[] args )    {
    	
    	//API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,
    	//truststorePassword);
    	 secure("src/test/resources/ecikeystore.p12", "Myeci2020", null, null);
    	port(5000); 
    	get("/", (req, res) -> "Hello World");
    	
    }
    
    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
