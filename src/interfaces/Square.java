package interfaces;

public class Square extends Shape implements Area{
	int side;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		this.area=side*side;
		
	}

}
