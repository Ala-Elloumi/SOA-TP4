package serveur;

import service.CalculatriceWS;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(name="ServeurJWS")
public class ServeurJWS {

        public static void main(String[] args) {
        	String url = "http://localhost:8686/";
        	Endpoint.publish(url, new CalculatriceWS());
            System.out.println(url);
        }
}

