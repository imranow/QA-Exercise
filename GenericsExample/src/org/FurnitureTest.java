package org;

import java.util.List;

public class FurnitureTest {
	public void createFurniture(List<? extends Furniture> list) {
		for (Furniture f:list) {
			f.sit();
		}
	}
	

}
