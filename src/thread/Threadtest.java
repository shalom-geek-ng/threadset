package thread;
import java.util.*;

class Mythread extends Thread{
	public void run() {
	int i = 1;
	while(true) {
		System.out.println("Hello " + i);
		i++;
	}
	}
	
}





class Myrun implements Runnable{
	public void run() {
		
	}
}

class Mythread2 implements Runnable{
	
	public void run() {
		int i = 1;
		while(true) {
			System.out.println("Mate");
			i++;
		}
	}
}


class Mythread3 extends Thread {
	Mythread3(String name){
		super(name);
//		setPriority(Thread.MAX_PRIORITY);
	}
	public void run() {
		int i = 1;
		while(true) {
			System.out.println(i);
			try {
			Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			i++;
		}
	}
}


 class Mythread4 implements Runnable{
	public void run() {
		int i = 1;
		while(true) {
			System.out.println("Hello ");
			i++;
			
			try {
				Thread.sleep(100);	
			}
			catch(Exception e) {
			System.out.println(e);
			}
			}
	}
}
 
 
 class tooLongException extends Exception{
	 public String toString(){
		return "The name is too long pls can you reduce it";
	 }
 }
 
 class CheckValidation{
	 
	
	 int age;
	 String name;
	 public CheckValidation() throws tooLongException{
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter your name");
		  name = input.nextLine();
		  
		 
		
		  while(name.length()>3) {
			try {
			  if(name.length()>3) {
				  throw new tooLongException();
			  }
			}
			  finally {
			  
			 System.out.println("Renter your name");
			name = input.nextLine();
		  }
		  }
//		  while(name.length()>30) {
//			  
//			name = input.nextLine();
//		  }
		  System.out.println("Welcome " + name);
	 }
	
	 
 }

// Enter your name and age if lenght of name is too long and also if age is too much
public class Threadtest {

	public static void main(String[] args) {
		
		try {
		
		new CheckValidation();
		}
		catch(Exception e){
			System.out.println(e);
			
		}
//		Mythread4 a = new Mythread4();
//		
//		Thread x = new Thread(a);
//		x.start();
//		
//		
//		
//		int i = 1;
//		while(true) {
//			
//			System.out.println("Yo");
//			i++;
//			
//			try {
//				Thread.sleep(100);	
//			}
//			catch(Exception e) {
//			System.out.println(e);
//			}
//		}
	
//	Mythread3 t = new Mythread3("Hello thread 1");
//	t.start();
//	t.interrupt();
//		System.out.println("Id " +  t.getId());
//		System.out.println("Name " + t.getName());
//		System.out.println("Priority " + t.getPriority());
//		t.start();
//		System.out.println("State " + t.getState());
//		System.out.println("Alive " + t.isAlive());
		
//		Thread t = new Thread(new Myrun());
//		Mythread2 x = new Mythread2();
//		Thread th = new Thread(x);
//		th.start();
//		Mythread t = new Mythread();
//		t.start();
//		int i = 1;
//		while(true) {
//			System.out.println("World " + i);
//			i++;
//		}
	}

}
