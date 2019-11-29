import com.borpaul.Builder;

public class Main extends Persona implements Builder {

//	private static Persona persona = new Persona();
	
	

	
//	public static void main(String[] args) {
//
//		System.out.println("I am here!");
//		System.out.println(persona.build());
//		System.out.println(persona.paint());
//		
//		persona.use();
//		persona.destroyNI();
//		
//		
//		Main newPersona = new Main();
//		
//		System.out.println(newPersona.paint());
//		
//	
//
//	}
	
	public static void main(String[] args) {
		Main myMain = new Main();
		System.out.println(myMain.paint());
	} 
	
	public String paint() {
		
		return "I am another Painter";
	}


	@Override
	public String destroy() {
		
		return null;
	}

}
