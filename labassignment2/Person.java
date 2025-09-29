package labassignment2;

 class CapitalString {
	// 

	    
	    public static String capitalizeFirstLetter(String input) {
	        if (input == null || input.isEmpty()) {
	            return input;
	        }
	        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
	    }
	}





 class Person extends CapitalString{
 private String name;
 private String city;

 // Constructor
 public Person(String name, String city) {
     this.name = name;
     this.city = city;
 }

 // Method to display person details with capitalized name
 public void displayDetails() {
     String capitalizedName = Person.capitalizeFirstLetter(name);
     System.out.println("Name: " + capitalizedName);
     System.out.println("City: " + city);
 }

 // Main method to test the functionality
 public static void main(String[] args) {
     Person person = new Person("john", "Pune");
     person.displayDetails();
 }
}
