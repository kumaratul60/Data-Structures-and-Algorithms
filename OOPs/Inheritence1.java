package OOPs;

public class Inheritence1 {

	public static void main(String[] args) {

	//	Parent p = new Parent();   			 // Parent constructor
		
	//	Parent pc = new Child();  		    //Parent constructor
								           //Child constructor
		
	//	Parent pg = new GrandChild();     //Parent constructor
									     //Child constructor
									    //GrandChild constructor
		
	//	Child c = new Child();  		//Parent constructor
		  								//Child constructor
		
	//	Child cg = new GrandChild();    	//Parent constructor
	     									//Child constructor
											//GrandChild constructor
		
		GrandChild gc = new GrandChild();	 //Parent constructor
											//Child constructor
											//GrandChild constructor


		// Child cp = new Parent();    // error
		// GrandChild gcc = new Child(); // error
 
		// GrandChild gcp = new Parent();  // error
	}

}

class Parent {
	public Parent() {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
	public Child() {
		System.out.println("Child constructor");
		;

	}
}

class GrandChild extends Child {
	public GrandChild() {
		System.out.println("GrandChild constructor");
	}

}
