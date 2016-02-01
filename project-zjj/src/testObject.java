
public class testObject {
	public static void main(String[] args){
		Object []object=new Object[3];
		Animal animal1 = new fish();
		Animal animal2 = new Tiger();
		object[0]=animal1;
		object[1]=animal2;
		object[2]=new String("String");
		((fish)object[0]).swim();
	}

}
