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
		int size = 0;
		
		for(Object item : items) {
			if(item == null)
				break;
			size++;
		}
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		Object[] itemList = new Object[items.length];
		int i = 0;
		
		itemList[index] = item;
		for(i = 0; i < index; i++) {
			if(items[i] != null) {
				itemList[i] = items[i];
			}
		}
		for(i = index; i < items.length; i++) {
			if((i == items.length - 1) && (items[i] != null)) {
				itemList = Arrays.copyOf(itemList, itemList.length * 2);
			}
			if(items[i] != null) {
				itemList[i + 1] = items[i];
			}
		}
		items = itemList;
		
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		Object removedItem = get(index);
		Object[] obj = new Object[items.length];
		int i = 0;
				
		for(i = 0; i < index; i++) {
			obj[i] = items[i];
		}
		for(i = index; i < items.length-1; i++) {
			obj[i] = items[i + 1];
		}
		items = obj;
		return (T)removedItem;
	}
	
}
