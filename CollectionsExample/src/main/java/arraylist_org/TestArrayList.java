package arraylist_org;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
		myList.add("Upasana");
		myList.add(1234);
		myList.add(true);
		myList.add(30.56);
		System.out.println(myList);
		
		ArrayList<Integer> myNum= new ArrayList();
		myNum.add(1000);myNum.add(2000);
		myNum.add(3000);myNum.add(4000);
		System.out.println(myNum);
		
		ArrayList<Item> itemList = new ArrayList<Item>();
		Item one=new Item("TV", 4500, "Samsung", 1);
		Item two=new Item("Iphone", 1100, "Apple", 1);
		Item three=new Item("Speakers", 500, "Beats", 1);
		Item four=new Item("Tripod", 300, "Logitech", 1);
		
		itemList.add(one);
		itemList.add(two);
		itemList.add(three);
		itemList.add(four);
		System.out.println(itemList);
		
	}

}
