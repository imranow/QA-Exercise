package org;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Chair> ChairList=new ArrayList();
		Chair c1=new Chair();
		Chair c2=new Chair();
		Chair c3=new Chair();
		ChairList.add(c1);
		ChairList.add(c2);
		ChairList.add(c3);
		FurnitureTest obj = new FurnitureTest();
		obj.createFurniture(ChairList);
		
		List<Table> TableList=new ArrayList();
		Table t1=new Table();
		Table t2=new Table();
		Table t3=new Table();
		TableList.add(t1);
		TableList.add(t2);
		TableList.add(t3);
		obj.createFurniture(TableList);

	}

}
