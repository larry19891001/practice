
public class tiger2 implements AnimalTest{
	public void breath(){
		System.out.println("The tiger breath");
	}
	public void eat(){
		System.out.println("The tiger eat");
	}
	public void sleep(){
		System.out.println("The tiger sleep");
	}
	public static void main(String[] args){
		tiger2 tiger=new tiger2();
		tiger.breath();
		tiger.eat();
		tiger.sleep();
	}

}
