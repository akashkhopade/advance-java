package com.sarje.comp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyColl {
	private String myArr[];
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, String> myMap;
	private Properties myProps;
	public String[] getMyArr() {
		return myArr;
	}
	public void setMyArr(String[] myArr) {
		System.out.println("setMyArr() called");
		this.myArr = myArr;
	}
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		System.out.println("setMyList() called");
		this.myList = myList;
	}
	public Set<String> getMySet() {
		return mySet;
	}
	public void setMySet(Set<String> mySet) {
		System.out.println("setMySet() called");
		this.mySet = mySet;
	}
	public Map<String, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, String> myMap) {
		System.out.println("setMyMap() called");
		this.myMap = myMap;
	}
	public Properties getMyProps() {
		return myProps;
	}
	public void setMyProps(Properties myProps) {
		System.out.println("setMyProps() called");
		this.myProps = myProps;
	}
	
}
