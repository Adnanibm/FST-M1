// Single Inheritance

package activities;


public class Button {
	String text;
	String type;
	
}

class PrimaryButton extends Button{
	public PrimaryButton(String text) {
		this.text = text;
		this.type=  "PRIMARY";
		
	}
}