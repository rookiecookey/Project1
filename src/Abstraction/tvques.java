package Abstraction;
interface tvremote
{
public void channelup();
public void channeldown();
public void volumeup();
public void volumedown();
}
interface smarttvrem extends tvremote
{
public void bluetoothcontrol();
public void voicerec();
}
class tv implements smarttvrem
{

	@Override
	public void channelup() {
		System.out.println("up");
		
	}

	@Override
	public void channeldown() {
		System.out.println("down");
		
	}

	@Override
	public void volumeup() {
		System.out.println("volup");
		
	}

	@Override
	public void volumedown() {
		System.out.println("voldown");
		
	}

	@Override
	public void bluetoothcontrol() {
		System.out.println("blue");
		
	}

	@Override
	public void voicerec() {
	System.out.println("voice");
		
	}
	
}

public class tvques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tv ob=new tv();
		ob.bluetoothcontrol();
		ob.volumedown();

	}

}
