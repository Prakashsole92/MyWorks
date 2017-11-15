package sam;

public class DnaStrand {
	
	public static String makeComplement(String dna) {

		StringBuilder sb= new StringBuilder();
		for (char c:dna.toCharArray()) {
		  switch(c) {
		    case 'A': sb.append('T');break;
		    case 'T': sb.append('A');break;
		    case 'C': sb.append('G');break;
		    case 'G': sb.append('C');break;
		    default: System.out.println("Invalid Charecter");break;
		  }
		}
		dna = sb.toString();
		System.out.println(dna);
		return dna;

	}
}
