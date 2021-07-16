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
	}
	public void display() {
		
		System.out.println(volume);
		
	}
	 
}
