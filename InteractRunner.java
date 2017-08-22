import java.util.Scanner;

public class InteractRunner{
    public static  void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        try {
        Calculator calc = new Calculator();
        String exit = "no";
        
        while(!exit.equals("yes")){

       System.out.println("Enter type of operation(+ - * /):");
       String answer = reader.next();
       System.out.println("Enter first arg:");
       String first = reader.next();
       System.out.println("Enter second arg:");
       String second = reader.next();
        
            switch (answer){
                case "+": {
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                  }
                case "-": {
                calc.minus(Integer.valueOf(first), Integer.valueOf(second));
                }
               case "*": {
                calc.multiplication(Integer.valueOf(first), Integer.valueOf(second));
                }
                case "/": {
                calc.division(Integer.valueOf(first), Integer.valueOf(second));
                }
                
                default: {
                    System.out.println("Error operation");
                }
                System.out.println("Result " + calc.getResult());
                calc.cleanResult();
                System.err.println("Exit : yes/no");
                exit = reader.next(); 

            }
          
        }
        
        }
        finally{
           reader.close();
        }
        
        
        
    }

}