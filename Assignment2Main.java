/**
 * 
 */
package sdh.java.session5;

/**
 * @author Sudhish
 *
 */
public class Assignment2Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment2Building building1 = new Assignment2Building();
		building1.noOfFloors = 7;
		building1.name = "Mayuresh Apt";
		building1.address="Bhandup, Mumbai, India";
		building1.families();
		System.out.println("Building 1:\nName: " + building1.name + "\t|\t Address: " + building1.address
				+ "\t|\t No of floors: " + building1.noOfFloors + "\t|\t No of families: "
				+ building1.noOfFamilies);
		
		building1 = new Assignment2Building();
		building1.noOfFloors = 13;
		building1.name = "Srishti Apt";
		building1.address="Mulund, Mumbai, India";
		building1.families();
		System.out.println("Building 2:\nName: " + building1.name + "\t|\t Address: " + building1.address
				+ "\t|\t No of floors: " + building1.noOfFloors + "\t|\t No of families: "
				+ building1.noOfFamilies);
	}

}
