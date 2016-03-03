import java.util.*;
public class RepeatAddition{
    int number1=(int)(Math.random()*10);
    int number2=(int)(Math.random()*10);
    int addt;
    
  RepeatAddition(){
    }
    
  public int getaddts(){
    Scanner input= new Scanner(System.in);
    addt=input.nextInt();
    return addt;
  }
  
  public int getaddt(){
    return number1*number2;
  }
    public int getnumber1(){
		return number1;
	}

	public int getnumber2(){
		return number2;
	}
}
