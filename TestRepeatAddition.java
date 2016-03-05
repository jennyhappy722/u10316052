import java.util.*;
public class TestRepeatAddition extends RepeatAddition{
	
	ArrayList <Integer> stack=new ArrayList<>();
	int right=-100;
	int i=0;
	public void addtoArray(){
		stack.add(getaddts());
		gestsss();
	}


	public void ask(){

		System.out.println("What is"+getnumber1()+"*"+getnumber2()+"?");
		gestsss();
		for(i=0;i<=right;i++){
	
			if(getaddt()==getaddts()){					
					System.out.print("你答對了!!");
					i=-1000;
			}else if(stack.contains(getaddts())){
				System.out.println("不可以輸入重複的");
				addtoArray();
			}else{
				System.out.println("你答錯了再一次~~~");
				System.out.println("What is"+getnumber1()+"*"+getnumber2()+"?");
				addtoArray();
			}
			
				
		} 
			
			
	
	}
}
