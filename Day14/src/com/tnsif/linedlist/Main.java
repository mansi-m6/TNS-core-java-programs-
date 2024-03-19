package com.tnsif.linedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> lang = new LinkedList<Integer>();
		lang.add(8);
		lang.add(2);
		lang.add(1);
		lang.add(6);

		Iterator<Integer> it = lang.iterator();
		Collections.reverse(lang);
		Collections.sort(lang);

		while(it.hasNext())
			System.out.println(it.next() + " ");
	}

}
