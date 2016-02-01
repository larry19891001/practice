
public class dongTai2 {
	public static void main(String args[]){
		Animal []animal=new Animal[3];
		animal[0]=new Animal();
		animal[1]=new Tiger();
		animal[2]=new fish();
		dongTai2 dm=new dongTai2();
		dm.move(animal[0]);
		dm.move(animal[1]);
		dm.move(animal[2]);
	}
	void move(Animal animal){
		if(animal instanceof Tiger)
			((Tiger)animal).tigerRun();
		else if(animal instanceof fish)
			((fish)animal).swim();
		else animal.sleep();
	}

}
