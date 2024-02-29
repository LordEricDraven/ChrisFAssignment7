package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	// Arrange
	// Act
	// Assert
	
	
	@Test
	void should_add_one_item_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();
		
		sut.add(1);
		Integer expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();
		
		assertEquals(1, expectedResult);
		assertEquals(1, expectedSize);
	}
	
	@Test
	public void  should_add_40_items_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for(int i = 1; i < 41; i++) {
			sut.add(i);
		}
		for(int i = 0; i < 40; i++) {
			assertEquals(i + 1, sut.get(i));
		}
		assertEquals(40, sut.getSize());
	}
	
	@Test
	public void should_add_item_to_index() {
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for (int i = 1; i < 11; i++) {
			sut.add(i);
		}
		
		sut.add(5, 500);
		
		Integer expectedResult = sut.get(5);
		
		assertEquals(500, expectedResult);
		
	}
	
	@Test
	public void should_add_to_full_list () {
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for( int i = 1; i < 11; i++) {
			sut.add(i);
		}
		
		sut.add(5, 500);
		
		Integer expectedResult = sut.get(5);
		Integer expectedSize = sut.getSize();
		
		assertEquals(500, expectedResult);
		assertEquals(11, expectedSize);
	
	}
	
	@Test
	public void should_remove_item() {
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for( int i = 1; i < 11; i++) {
			sut.add(i);
		}
		
		Integer expectedResult = sut.remove(5);
		Integer expectedSize = sut.getSize();
		
		assertEquals(6, expectedResult);
		assertEquals(9, expectedSize);
	}

}
