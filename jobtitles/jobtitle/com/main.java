package jobtitle.com;
/**
 * 
 */
/**
 * @author antonio.epomba
 *
 */
public class main {

	public static void main(String[] args) {
		
		String jobTitle  = "Software engineer";
		String jobTitle2 = "Software engineer";
		String jobTitle3 = "Architect";
		String jobTitle4 = "Quantity surveyor";
		String jobTitle5 = "Accountant";
		
		Normalize n = new Normalize();
		jobTitle =  "C# engineer";
		jobTitle2 = "Java engineer";
		jobTitle3 = "Architect";
		jobTitle4=  "Chief Accountant";
		jobTitle5=  "Accountant";
		
		String result =  n.normalizeJobTitle(jobTitle);
		String result2 = n.normalizeJobTitle(jobTitle2);
		String result3 = n.normalizeJobTitle(jobTitle3);
		String result4 = n.normalizeJobTitle(jobTitle4);
		String result5 = n.normalizeJobTitle(jobTitle5);
		
	System.out.println("Normalized Job Title: " + result);
	System.out.println("Normalized Job Title: " + result2);
	System.out.println("Normalized Job Title: " + result3);
	System.out.println("Normalized Job Title: " + result4);
	System.out.println("Normalized Job Title: " + result5);
	  
	}

}
