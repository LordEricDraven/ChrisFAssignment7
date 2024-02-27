package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T>{
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		for (int i = 0; i <= items.length; i++) {
			if (i == items.length) {
				items = Arrays.copyOf(items, items.length*2);
			}
			if (items[i] == null) {
				items[i] = item;
				return true;
			}
		}
		return false;
	}

	@Override
	public int getSize() {
		int i = 0;
		
		for(Object item : items) {
			if(item == null)
				break;
			i++;
		}
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}
	
}
