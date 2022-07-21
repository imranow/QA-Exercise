
public class Test {

	public static void main(String[] args){
		String str="Hello world ";
		str=str+"How are you ";
		str=str+"Nice to meet you ";
		System.out.println(str);
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf("Nice"));
		System.out.println(str.concat("I am from UK"));
		System.out.println(str.replace("Nice", "Glad"));
		System.out.println(str.contains("nice"));
		System.out.println(str.substring(10,15));
		String name1="Upsana";
		String name2="Upsana";
		System.out.println(name1.equals(name2));
		
		if (name1==name2) {
			System.out.println("String are equal");
		} else 
			System.out.println("Strings are not equal");
	}
}
