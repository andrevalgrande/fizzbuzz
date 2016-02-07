import org.restexpress.RestExpress;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		RestExpress server = new RestExpress();
		//server.setName("foo");
		//server.setPort(2112);
		server.uri("/fizzbuzz", new FizzBuzzController());

		server.bind();
		server.awaitShutdown();
	}
}
