import java.util.*;
public class TestRepeatAddition extends RepeatAddition{
	
	ArrayList <Integer> stack=new ArrayList<>();
	int right=-100;
	int i=0;
	public void addtoArray(){
		stack.add(getaddts());
	}


	public void ask(){

		System.out.println("What is"+getnumber1()+"*"+getnumber2()+"?");

		for(i=0;i<=right;i++){
			addtoArray();
			if(stack.contains(getaddt())){
				System.out.print("你答對了!!");
				right=i;
			}else{
				System.out.println("你答錯了再一次~~~");
				System.out.println("What is"+getnumber1()+"*"+getnumber2()+"?");
				addtoArray();
			}
			
				
		} 
			
			
	
	}
}
