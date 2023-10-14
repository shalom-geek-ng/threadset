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
//			try {
//			Thread.sleep(100);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
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

 
class Data{
	
	synchronized void display(String str) {
		for(int i = 0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			
		}
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Sync1 extends Thread{
	Data d;
	Sync1(Data d){
		this.d = d;
	}
	public void run() {
		d.display("I love ");
	}
}

class Sync2 extends Thread{
	Data d;
	Sync2(Data d){
		this.d = d;
	}
	public void run() {
		d.display(" Java");
	}
}


 
	
	 class NewData{
		synchronized public void add(int x, int y) {
			System.out.println(x+y);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
		}
		
	}
	
	class NewThreadset1 extends Thread{
		NewData n;
		NewThreadset1(NewData n){
			this.n = n;
		}
		public void run() {
			n.add(18,10) ;
		}
	}
	
	class NewThreadset2 extends Thread{
		NewData n;
		NewThreadset2(NewData n){
			this.n = n;
		}
		public void run() {
			n.add(12, 19);;
		}
	}
 
// Enter your name and age if lenght of name is too long and also if age is too much
public class Threadtest {

	public static void main(String[] args) {

		Data d = new Data();
		Sync1 s = new Sync1(d);
		Sync2 s2 = new Sync2(d);
		NewData ds = new NewData();
		NewThreadset1 ts = new NewThreadset1(ds);
		NewThreadset2 ts2 = new NewThreadset2(ds);

		
		s.start();
		s2.start();
//		ts.start();
//		ts2.start();
//		try {
//			ts.start();
//			ts.join();
//			Thread.sleep(10000);
//			ts2.start();
//	
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
	
//		r.start();
//		
//		a.start();
		
//		try {
//		
//		new CheckValidation();
//		}
//		catch(Exception e){
//			System.out.println(e);
//			
//		}
//		Mythread4 a = new Mythread4();
//		
//		Thread x = new Thread(a);
//		x.start();
//		x.interrupt();
//		
//		System.out.println(x.getState());
		
	
		
		
		
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
//	
//	Mythread3 t = new Mythread3("Hello thread 1");
	
//	t.setDaemon(true);
//	t.start();
//	t.yield();
	
//	try {
//	t.sleep(100);
//		
//	}
//	catch(Exception e ) {
//		System.out.println(e);
//	}
	
//	
//	Threadtest f = new Threadtest();
//	int i = 1;
//	while(true) {
//		System.out.println(i + "Main");
		
//		try {
//		Thread.sleep(100);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		i++;
//	}
//	
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
