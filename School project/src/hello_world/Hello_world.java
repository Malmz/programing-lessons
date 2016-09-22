package hello_world;

public class Hello_world {

	double d1;
	
	private void kbdTest(){
		
		int i1 = Kbd.readInt("Integer: ");
		String test = Kbd.readString("Input Kbd: ");
		System.out.println(i1);
		System.out.println(test);
		
	}
	
	private void liten(){
		char c1 = Kbd.readChar("char: ");
		if((int)c1 >= (int)'A' & (int)c1 <= (int)'Z'){
			System.out.println(c1 + " liten " + (char)(c1+32));
			
		}
		else if((int)c1 >= (int)'a' & (int)c1 <= (int)'z'){
			System.out.println(c1 + " stor " + (char)(c1-32));

		}
		else{
			System.out.println("Error");
		}

	}
	
	private void tArea() {
		double b = Kbd.readDouble("Bas: ");
		double h = Kbd.readDouble("Höjd: ");
		System.out.println((b*h/2));
	}
	
	private int avrunda(double d1){
		d1 += 0.5;
		return (int)d1;
	}
	
	private void bankomat() {
		double d2 = Kbd.readInt("hur mycket pengar: ");
		d2 = (d2/100);
		Hello_world h1 = new Hello_world();
		d2 = h1.avrunda(d2);
		System.out.println(d2*100);
	}
	//This kinda works
	private void bankomat2() {
		double d3 = Kbd.readDouble("Input: ");
		double d4 = 0;
		double d5 = 0;
		while(d3 > 0){
			if(d3 > 500){
				d4 += 500;
				d3 -= 500;
			}
			else if(d3 > 100){
				d5 += 100;
				d3 -= 100;
			}
			else{
				d5 += 100;
				d3 = 0;
			}
		}
		System.out.println("500: " + d4);
		System.out.println("100: " + d5);
	}
	
	private int avrunda2(double d1){
		d1 += 0.99;
		return (int)d1;
	}
	
	//This shit works!
	private void bankomat3() {
		double i1 = Kbd.readDouble("Uttag: ");
		int i2 = (int)i1/500;
		i1 = avrunda2((i1%500)/100);
		System.out.println(((int)i1*100) + " " + (i2*500));
	}
	
	private void blandad() {
		int i1 = Kbd.readInt("Täljare: ");
		int i2 = Kbd.readInt("Nämnare: ");
		System.out.println("Blandad form: " + (i1/i2) + " " + (i1%i2) + "/3");

	}
	
	private void tid() {
		double i1 = Kbd.readDouble("Timmar: ");
		double i2 = Kbd.readDouble("Minuter: ");
		double i3 = Kbd.readDouble("Sekunder: ");
		
		double d1 = i1 + (i2/60) + (i3/60/60);
		
		System.out.println(d1);

	}
	
	public static void main(String[] args) {
		Hello_world h = new Hello_world();
		
		h.tid();
		//h.blandad();

	}

}
