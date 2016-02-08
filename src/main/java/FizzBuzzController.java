import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import org.restexpress.Request;
import org.restexpress.Response;

public class FizzBuzzController
{
  private static final String USAGE = "Please call GET and set either the request header or query-string 'numbers' parameter (such as numbers=0,2,20,300).";

  public String create(Request request, Response response) throws Exception
  {
    throw new Exception(USAGE);
  }

  public String read(Request request, Response response) throws Exception
  {
    String numbersHeader = request.getHeader("numbers");
    if(numbersHeader == null){
      throw new Exception(USAGE);
    }
    return FizzBuzz.replaceAll(numbersHeader);
  }

  public String delete(Request request, Response response) throws Exception
  {
    throw new Exception(USAGE);
  }

  public String update(Request request, Response response) throws Exception
  {
    throw new Exception(USAGE);
  }
}
