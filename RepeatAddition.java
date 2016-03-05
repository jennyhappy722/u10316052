//u10316052
//import all
import java.util.*;
public class RepeatAddition{
	//set varaible
    int number1=(int)(Math.random()*10);
    int number2=(int)(Math.random()*10);
    int addt;
    //non-cotrstor
  RepeatAddition(){
    }
    //let user input
   public void gestsss(){
    	Scanner input= new Scanner(System.in);
    	addt=input.nextInt();
    }
    //getsdds user input
  public int getaddts(){
    return addt;
  }
  //get right ans
  public int getaddt(){
    return number1*number2;
  }
  //get num1
    public int getnumber1(){
		return number1;
	}
//get num2
	public int getnumber2(){
		return number2;
	}
}
