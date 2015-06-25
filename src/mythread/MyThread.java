package mythread;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadExtend myThreadExtend = new MyThreadExtend();
		myThreadExtend.start();  // Á¢¼´·µ»ØµÄ
		
		Thread thread = new Thread(){
			public void run(){
				System.out.println("without name");
			}
		};
		thread.start();
		
		Runnable runnable = new Runnable(){
			public void run(){
				System.out.println("Runnable");
			}
		};
		
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
		System.out.println("MyThread");
	}// end main()

} //  end class 
