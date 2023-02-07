
public class Principal {

	public static void main (String[]args) {
	
	//Array de tipo persona 

		Persona [] amigos = new Persona[5];
		
	//Intanciamos los objetos
		
		
	//nombre de la clase + Nombre del objeto = new + constructores	
	
		Persona Ariel = new Persona ( "Ariel","Buglio");
		Persona Mariano = new Persona ("Mariano", "Buglio");
		Persona Mili = 	new Persona ("Mili", "Vazquez");
		
	//Amigos	
		
		amigos[0]  = 	new Persona ("Agus", " Zabala");
		amigos[1]  = 	new Persona ("Fede", " Pereira");
		amigos[2]  = 	new Persona ("Flor", " Calzeta");
		amigos[3]  = 	new Persona ("Gera", " Puchi");
		amigos[4]  = 	new Persona ("Leonel", " Messi");
		
		
	//Saludos
		
		//Dar accion a los metodos creados en la clase Persona 
		//Objeto + metodo + (Argumento)
		
		Ariel.SaludarPersona(Mariano);
		Mariano.ResponderSaludo(Ariel);
		Mariano.ResponderSaludo2(Ariel);
		Mariano.ResponderSaludo3(Ariel);
		
		System.out.println();
		
	//Invitacion
		
		Ariel.InvitarFiesta(Mariano);
		Mariano.setSimpatico(true);
		Mariano.ResponderInvitacion(Ariel);
		
	//Domicilio
		
		System.out.println();
		
		Ariel.setDomicilio("guardia vieja 2360");
		Ariel.DecirMiDomicilio(Mariano);
		
	//Respuesta domicilio
		
		Mariano.Distancia(Ariel);
		Mariano.RespuestaDomicilio(Ariel);
		

	//DecirAmigos
		
		Mariano.DecirAmigos(Ariel);
		for(int i = 0; i<5; i++) {
			amigos[i].DecirAmigos2(Mariano);
		}
		
	//Despedida
		
		Mariano.Despedida(Ariel);
		
		
	//Respuesta Amigos 
		
		System.out.println();
		Ariel.RespuestaDeAmigos(Mariano);
		
	//OfrecerFavor
		
		Mariano.OfrecerFavor(Ariel);
	
	//RespuestaFavor	
		
		Ariel.RespuestaFavor(Mariano);
		
	}
	
		
	
		
		
	
}
