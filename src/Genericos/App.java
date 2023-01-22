package Genericos;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//llamo al método Generico con el objeto Persona, primero voy a crear 3 personas
		
		Persona pers1 = new Persona ("Maria", "Perez", 34);
		Persona pers2 = new Persona ("Ana", "Lopez", 32);
		Persona pers3 = new Persona ("Blanca", "Martinez", 44);
		
		GenericsMethods <Persona> personas = new GenericsMethods<Persona>(pers1, pers2, pers3);
		// aquí va a imprimir el objeto persona 
		
		System.out.println(personas.toString());
		
		// llamo al método Generico con String
		
		GenericsMethods <String> palabras = new GenericsMethods<String>("Casa", "Hotel", "Edificio");
		System.out.println(palabras.toString());
		
		
		// llamo al método Generico con un tipo primitivo
		
		GenericsMethods <Integer> numeros = new GenericsMethods<Integer>(385, 456, 789);
		System.out.println(numeros.toString());
	}

}
