package com.rajdosi.test.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rajdosi.ds.Pair.Pair;

public class CheckPairClass {

	public static void main (String a[]){
		List<Pair<Integer,Integer>> listOfPairs = new ArrayList<>();
		Map<Integer,Pair<Integer,Integer>> mapOfPairs = new HashMap<>();
		
		Pair<Integer,Integer> pair = new Pair<>();
		pair.put(2,3);
		listOfPairs.add(pair);
		mapOfPairs.put(1, pair);
		
	}
}
