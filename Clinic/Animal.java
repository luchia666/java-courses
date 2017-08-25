public class Animal{
    public String vid;
    public String name;
    public String[][]  spisAnimal = new String[10][3];//10 strok 3 stolbca
    public int countAnimal;
    //public Owner o = new Owner(); 
   
    public void Animal(){
    spisAnimal[0][0]="dog";spisAnimal[0][1]="Sharik";spisAnimal[0][2]="Petrov0";
    spisAnimal[1][0]="cat";spisAnimal[1][1]="Murzik";spisAnimal[1][2]="Ivanov1";
    spisAnimal[2][0]="homiak";spisAnimal[2][1]="Pushistik";spisAnimal[2][2]="Smirnova2";
    spisAnimal[3][0]="homiak";spisAnimal[2][1]="Seryj";spisAnimal[2][2]="Ivanov1";
    countAnimal = 4;
    }
    public void AddAnimal(String idOwner,String name){
       Owner man = new Owner(); 
       
       String listMan[][] = man.GetFullList();
       for(int i=0; i<=man.GetCount();i++){
           if(listMan[i][1].equals(idOwner)){
       spisAnimal[countAnimal][1]=name;spisAnimal[2][2]=name+countAnimal;
       }
       }
    }
    
    /*
    public void DeleteMan(String name){
      String newMan[][] = new String[10][1];
        for (int i=0; i<=countMan;i++){
          if (!Man[i][1].equals(name)){
          newMan[i][1]=Man[i][1];
          } 
      }
      countMan = countMan-1;
       Man = newMan;
    }

    public void EditMan(String oldName, String newName){
        for (int i=0; i<=countMan;i++){
          if (Man[i][1].equals(oldName)){
          Man[i][1]=newName;    
          } 
        }    
    }
    public void PrintFullList(){
        System.out.println("Full list of owner animal:");
        for (int i=0; i<=countMan;i++){
        System.out.println(Man[i][1]);
        }    
    }
    public String[][] GetFullList(){
        return Man;    
    } 
*/    

}