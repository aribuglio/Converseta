
import java.util.Random;
import java.util.Scanner;


public class Persona { 

	//Atributos de persona
	
	private String nombre, apellido,domicilio;
	
	
	private boolean simpatico;
	
	private String[] Humor = new String[] {"Bien","Mal"};
	
		
	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();
		
	private int H = rand.nextInt(2);
	private int H2 = rand.nextInt(2);
	private int Num = rand.nextInt(2);
	private int NumDistancia;

	
	
	//constructores
	
	public  Persona (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;	
	}	
	
	
	
		//Metodos
	
	//metodo que da HUMOR
	
		public String DarHumorRandom (){
	        return Humor[rand.nextInt(Humor.length)];
	    }
		
		public int HumorRandom() {
			return H = rand.nextInt();
		}
		
		public int HumorRandom2() {
			return H2= rand.nextInt();
		}
		
		public int SioNo() {
			return Num = rand.nextInt();
		}	
	
		//Metodo para SALUDOS
	
	
		
	                          //Parametro de tipo persona que  se llama salamin.
	public void SaludarPersona(Persona salamin) {
						// Nombre del objeto persona (this.nombre) + texto + paramentro.getNombre()	--> Primero hace referencia al nombre del objeto y luego al nombre del parametro que lo 
						//ponemos luego en la instancia del objeto.
		
		System.out.println(this.nombre+": Hola "+ salamin.getNombre()+ " soy " + this.nombre + ", como estas ?");
		
	}
	
	public void ResponderSaludo(Persona salamin) {
		System.out.println(this.nombre+": Hola " + salamin.getNombre() + ", " + "estoy "+ Humor[H] + " y vos?");
		
	}
	public void ResponderSaludo2(Persona salamin) {
		
		if (H==1){
			System.out.println(salamin.getNombre()+": Que mal amigo,yo estoy " + Humor[H2] );
			
		}			
		
		else if(H==0) {
			System.out.println(salamin.getNombre()+": Me alegro amigo, yo estoy " + Humor[H2]);
			
		}
	}
	
		
	public void ResponderSaludo3(Persona salamin) {
		
		
		if (H2==1){
			System.out.println(this.nombre+": Que garron loco " );
			
		}			
		
		else if(H2==0) {
			System.out.println(this.nombre+": Me alegro por vos");
			
		}
	}	
			
			
		//Metodo INVITACION	
	
	public void InvitarFiesta (Persona salamin){
		if(H2 == 1) {
			System.out.println(this.nombre+": Te llamo para invitarte a una fiesta, pero si estas mal no creo que quieras, que decis? ");
		}
		else {
			System.out.println(this.nombre+": Te llamo por que estoy organizando una fiesta, queres venir?");
		}	
	}
	
	public void ResponderInvitacion (Persona salamin) {
		if (simpatico == true) {
			System.out.println(this.nombre+": Dale me re gustaria, en donde es?");
			//responde que si
		}
		
		else if(simpatico == false){
			System.out.println(this.nombre+": No me pinta gracias bro");
			//Responde que no 
		}
	}
	
	//Metodo decir DOMICILIO
	
	public void DecirMiDomicilio(Persona salamin) {
		
		if(this.domicilio != null) {
			System.out.println(this.nombre+": En mi casa, la direccion es: " + this.domicilio);
		}
		else {
			System.out.println(this.nombre+": No se mi domicilio");
		}
	}
	
	//Metodo Distancia
	
	public void Distancia(Persona salamin) {
		System.out.println(this.nombre+": A cuantos KM queda de mi casa ?");
		
		
		//Colocar por teclado la distancia 
		System.out.println(salamin.getNombre()+": Queda a:");
		NumDistancia = scan.nextInt();
		
		
	}
	
	
	//Respuesta a domicilio
	
	public void RespuestaDomicilio (Persona salamin) {
		
		if(NumDistancia > 50 ) {
			System.out.println(this.nombre+": Uuuuh me queda re lejos, me bajo hermano, gracias");
			System.out.println(salamin.getNombre()+": Okay dale, no hay problema");
			
		}
		
		else {
			System.out.println(this.nombre+": Genial me queda cerca, puedo invitar amigos? ");
			System.out.println(salamin.getNombre()+": Sii ! Claro, hasta 5 podes invitar, pasame los nombres:");
		}
		
	}
	
	//Metodo decirAmigos
	
	public void DecirAmigos (Persona salamin) {
		if(NumDistancia < 50 ) {
			
			System.out.println(this.nombre+": Dale, los nombres de mis amigos son:");
			System.out.println();
		}
		
		
	}
	
	
	public void DecirAmigos2 (Persona salamin) {
		
		
		if(NumDistancia < 50 ) {
			System.out.println(nombre + apellido);
			
			
		}		
		
	}
		
	//Metodo despedida 
	
	public void Despedida (Persona salamin) {
		
		if(NumDistancia > 50 ) {
			System.out.println(this.nombre+": Dale gracias por invitar, nos vemos");
			System.out.println(salamin.getNombre()+": De nada amigo, Nos vemos");
		}
		
	}
	
	
	public void RespuestaDeAmigos (Persona salamin) {
		System.out.println(this.nombre + ": Perfecto, ahora los anoto");
		System.out.println(this.nombre + ": Listo ! ");
		
	}
	
	public void OfrecerFavor (Persona salamin) {
		System.out.println(this.nombre + ": Gracias "+ salamin.getNombre() + ", necesitas que compre algo?");
		
		
	}
	
	public void RespuestaFavor	(Persona salamin) {
		
		if (Num == 1 ) {
			System.out.println(this.nombre+": Si! Me re sirve si compras algo de alcohol");
		}
		
		else {
			System.out.println(this.nombre+": No gracias amigo, tenemos todo.");
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
	
		
		

	
	
			
		
	
	
	
		
		
			
	
			
		
			
		
		
	
			
	
	
	

	
	
	
	


	
	
	
