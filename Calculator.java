public class Calculator{
    
    private float result;
    
     
    public void add (float ... params){
      for (float param : params){
        this.result += param;
      }
    }
    
    public void minus (float param1, float param2){
        this.result = param1 - param2;
    }
    
    public void multiplication (float param1, float param2){
        this.result = param1 * param2;
     }     
     
    public void division (float param1, float param2){
        this.result =  param1/param2;
     } 
    
    public float getResult(){
        return this.result;    
    }
    
    public void cleanResult() {
    this.result = 0;
    }
    
    public static  void main(String[] arg){
//        System.out.println("YRAAAAAAAAA");
//        int first = Integer.valueOf(arg [0]);
//        int second = Integer.valueOf(arg[1]);
//        int sum = first + second;
//        System.out.println("Summa " + sum);
      }

}