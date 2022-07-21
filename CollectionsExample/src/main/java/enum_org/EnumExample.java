package enum_org;

public class EnumExample {
	public enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	public String name; 
	
	public static void main(String[] args) {
		for (Days d: Days.values()) {
			System.out.println(d);
		}
	System.out.println("The day today is" +Days.valueOf("MONDAY ").ordinal());
	}
	
}
