import java.util.Scanner;


public class BankingSis {
	
		private String firstName;
		private String lastName;
		private String department;
		private String password;
		private int mailBoxCap = 500;
		private String alternateEmail;
		private int defaultPasswordLenght = 8;
		
		public void getInfo() {
		// Modelleri bu metod içinde newlenecek
			System.out.println("What is your first name? ");
			Scanner in = new Scanner(System.in);
			this.firstName = in.nextLine();
			System.out.println("What is your last name?");
			this.lastName = in.nextLine();
			this.department = setDepartment();
			System.out.println("Department is " + this.department);
			System.out.println("Email crated = " + this.firstName + "." + this.lastName + "@"+ department  + ".cr.com" );
			this.password = setPassword(defaultPasswordLenght);
			System.out.println("Your password is = " + password);
		}
		private String setDepartment() {
			System.out.println("What is your department? /n1 for Sales/n2 for Development/n3 for Accounting/n0 for none");
			Scanner in = new Scanner(System.in);
			int dep = in.nextInt();
			if(dep == 1) { return "Sales";	}
			else if (dep == 2 ) {return "Dev";}
			else if ( dep == 3) {return "Acct";}
			else {return "";}	
		}
		
		private String setPassword(int length) {
			String passString = "abcdefghjklmnoprstvuyz0123456789*'^!+%&ABCDEFHGJKLMNOPRSTVYUZ";
			char[] password = new char[length];
			for(int i=0; i < length; i++) {
				int rand = (int) (Math.random() * passString.length());
				password[i] = passString.charAt(rand);
				
			}
			return new String (password);
		}
		
		public void mailCap( int capacity) {
			this.mailBoxCap = capacity;
		}
		public void alternateMail(String alternate) {
			this.alternateEmail = alternate;
		}
		public void changePassword(String pass) {
			this.password = pass;
			
		}
		
	

}
