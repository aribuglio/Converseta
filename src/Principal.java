
public class Principal {

	public static void main (String[]args) {
		
		Persona Ariel = new Persona ( "Ariel","Buglio");
		Persona Mariano = new Persona ("Mariano", "Buglio");
		
		
		//Saludos
		Ariel.SaludarPersona(Mariano);
		Mariano.ResponderSaludo(Ariel);
		Mariano.ResponderSaludo2(Ariel);
		
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
		
		Mariano.RespuestaDomicilio(Ariel);

		//Amigos
		Mariano.DecirAmigos();
		
		
		
		
		
	}
	
}
