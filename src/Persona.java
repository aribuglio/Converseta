import java.util.Random;
import java.util.Scanner;


public class Persona { 

	
	private String nombre, apellido,domicilio;
	private boolean simpatico;
	private String[] Humor = new String[] {"Bien","Mal"};
	
	private String[] Amigos = new String[5];
	
	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();
	private int H = rand.nextInt(2);
	private int H2 = rand.nextInt(2);
	private int NumDistancia= rand.nextInt(2);
	
	//constructor
	
	public  Persona (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		
	}

	
	//Metodos
	
	
	
	//HUMOR
	
		public String DarHumorRandom (){
	        return Humor[rand.nextInt(Humor.length)];
	    }
		
		public int HumorRandom() {
			return H = rand.nextInt();
		}
		
		public int HumorRandom2() {
			return H2= rand.nextInt();
		}

	
	
		//SALUDOS
	
	public void DecirMiNombre () {
		System.out.println(this.nombre + " " + this.apellido);
	}
	
	public void SaludarPersona(Persona salamin) {
		System.out.println("Ariel: Hola "+ salamin.getNombre()+ " soy el " + this.nombre + ", como estas ?");
		
	}
	
	public void ResponderSaludo(Persona persona) {
		System.out.println("Mariano: Hola " + persona.getNombre() + ", " + "estoy "+ Humor[H] + " y vos?");
		
	
		if (H==1){
			System.out.println("Ariel: Que mal amigo,yo estoy " + Humor[H2] );
			
		}			
		
		else if(H==0) {
			System.out.println("Ariel: Me alegro amigo, yo estoy " + Humor[H2]);
			
		}
	}
		
	public void ResponderSaludo2(Persona salamin) {
		
		
		if (H2==1){
			System.out.println("Mariano: Que garron loco " );
			
		}			
		
		else if(H2==0) {
			System.out.println("Mariano: Me alegro por vos");
			
		}
	}	
			
			
		//INVITACION	
	
	public void InvitarFiesta (Persona salamin){
		if(H2 == 1) {
			System.out.println("Ariel: Te llamo para invitarte a una fiesta, pero si estas mal no creo que quieras, que decis? ");
		}
		else {
			System.out.println("Ariel: Te llamo por que estoy organizando una fiesta, queres venir?");
		}	
	}
	
	public void ResponderInvitacion (Persona persona) {
		if (simpatico == true) {
			System.out.println("Mariano: Dale me re gustaria, en donde es?");
			//responde que si
		}
		
		else if(simpatico == false){
			System.out.println("Mariano: No me pinta gracias bro");
			//Responde que no 
		}
	}
	
	//DOMICILIO
	
	public void DecirMiDomicilio(Persona salamin) {
		
		if(this.domicilio != null) {
			System.out.println("Ariel: En mi casa, la direccion es: " + this.domicilio);
		}
		else {
			System.out.println("Ariel: No se mi domicilio");
		}
	}
	
	//Distancia
	
	public int Distancia() {
		return NumDistancia= rand.nextInt();
	}
	
	
	//Respuesta a domicilio
	
	public void RespuestaDomicilio (Persona persona) {
		
		if(NumDistancia == 0 ) {
			System.out.println("Mariano: Uuuuh me queda re lejos, me bajo hermano, gracias");
			System.out.println("Ariel: Okay dale, no hay problema");
			
		}
		
		else {
			System.out.println("Mariano: Genial me queda cerca, puedo invitar amigos? ");
			System.out.println("Ariel: Sii ! Claro, hasta 5 podes invitar, pasame los nombres");
		}
		
	}
	
	//Amigos
	
	
	
	public void DecirAmigos () {
		if(NumDistancia==1) {
			
			for(int i = 0; i < Amigos.length; i++) {
				System.out.print("["+i+"]: ");
				Amigos[i] = scan.next();
					}
				}		
			else {
				System.out.println("FIN");
				
			}
		
	}
	
	
	
	
	//Get and set
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	public boolean isSimpatico() {
		return simpatico;
	}
	
	
	public void setSimpatico(boolean simpatico) {
		this.simpatico = simpatico;
	}
	
	
	public String[] getHumor() {
		return Humor;
	}
	
	
	public void setHumor(String[] humor) {
		Humor = humor;
	}
	
	
	public Random getRand() {
		return rand;
	}
	
	
	public void setRand(Random rand) {
		this.rand = rand;
	}
	
		
		
		
	
	
	
			
		
	
	
	
		
		
			
	
			
		
			
		
		
	
			
	
	
	

	
	
	
	

}
	
	
	
