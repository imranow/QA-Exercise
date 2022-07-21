
public class StringBuilderExample {

	public static void main(String[]args) {
		StringBuilder sb=new StringBuilder();
		sb.append("Upasana ");
		sb.append("Hello ");
		sb.append("How are you ");
		sb.insert(7, "Dew");
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.insert(7, "Dew");
		System.out.println(sb);
		
	}
}
