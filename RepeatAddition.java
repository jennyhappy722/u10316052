import java.util.*;
public class RepeatAddition{
    int number1=(int)(Math.random()*10);
    int number2=(int)(Math.random()*10);
    int addt;
    
  RepeatAddition(){
    Scanner input= new Scanner(System.in);
    addt=input.nextInt();
    }
    
  public int getaddts(){
    return addt;
  }
  
  public int getaddt(){
    return number1*number2;
  }
}
