public class Calculator{
    
    private int result;
    
    
    public Calculator(){}
    
    public void add (int ... params){
      for (Integer param : params){
          this.result += param;
      }
    }
    
    public int getResult(){
        return this.result;    
    }
    
    public void cleanResult() {
    this.result = 0;
    }
    
//    public static  void main(String[] arg){
//        System.out.println("YRAAAAAAAAA");
//        int first = Integer.valueOf(arg [0]);
//        int second = Integer.valueOf(arg[1]);
//        int sum = first + second;
//        System.out.println("Summa " + sum);
//      }

}