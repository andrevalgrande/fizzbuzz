public class FizzBuzz
{
  public static String replaceAll(String input) throws Exception{
    String output = "";

    if(input == ""){
      return output;
    }

    String[] inputArray = input.split(",");
    boolean firstRun = true;
    for(String token: inputArray){
      try{
        int number = Integer.parseInt(token.replaceAll("\\s",""));

        if(firstRun){
          firstRun = false;
        }
        else{
          output += ",";
        }

        output += replaceSingle(number);
      }
      catch(Exception e){
        throw new Exception(String.format("'%s' is not a valid integer number.", e));
      }
    }

    return output;
  }

  private static String replaceSingle(int input){
    String output = "";
    boolean wasReplaced = false;

    if(input % 3 == 0){
      output += "Fizz";
      wasReplaced = true;
    }

    if(input % 5 == 0){
      output += "Buzz";
      wasReplaced = true;
    }

    if(!wasReplaced){
      output += Integer.toString(input);
    }

    return output;
  }
}
