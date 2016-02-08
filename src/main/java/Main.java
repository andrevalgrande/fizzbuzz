import org.restexpress.RestExpress;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		RestExpress server = new RestExpress();
		int portNum = Integer.parseInt(System.getenv("PORT"));
		server.setPort(portNum);
		server.uri("/", new FizzBuzzController());

		server.bind();
		server.awaitShutdown();
	}
}
