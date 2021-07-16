package test;

public class Box implements IComputer{

	private int length, width, height;
	private int volume;
	
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void calculate() {
		
		volume = length * height * width;
		setVolume(volume);
		
	}
	public void display() {
		System.out.println("");
		System.out.println("Length :" +getLength());
		System.out.println("Width: " +getWidth());
		System.out.println("Height: " +getHeight());
		System.out.println("");
		System.out.println("Volume is: " +getVolume());
		
	}
	 
}
