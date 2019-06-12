
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(85,1.85);
		Paciente p2 = new Paciente(93,1.75);
		Paciente p3 = new Paciente(110,1.70);
		
		System.out.println("IMC p1: "+p1.calcularIMC());
		System.out.println("Diagnostico p1: "+p1.diagnostico(p1.calcularIMC()));

		System.out.println("IMC p2: "+p2.calcularIMC());
		System.out.println("Diagnostico p2: "+p2.diagnostico(p2.calcularIMC()));

		System.out.println("IMC p1: "+p3.calcularIMC());
		System.out.println("Diagnostico p3: "+p3.diagnostico(p3.calcularIMC()));
		
	}

}
