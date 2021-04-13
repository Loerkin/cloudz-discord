package cloudz;

import org.lwjgl.opengl.Display;

public class Client {

	public static String name ="CloudZ", version = "1";
	
	public static void startup(){
		System.out.println("Starting " + name + " - v" + version);
		Display.setTitle("CloudZ");
	
	}
		
}
