package com.girmiti.javaprograms;


class Charger{
	private String name;
	private int volt;
	
	public Charger(String name, int volt) {
		this.name = name;
		this.volt = volt;
	}
	
	public String getname() {
		return name;
	}
	public int getVolt() {
		return volt;
	}
}

class OS{
	private String name;
	private int size;
	
	public OS(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public String getname() {
		return name;
	}
	public int getSize() {
		return size;
	}
}

class Mobile{
	OS os = new OS("Android",512);
	
	public void hasAcharger(Charger c) {
		System.out.println(c.getname());
		System.out.println(c.getVolt());
	}
}
public class AggregationAndComposition {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println(m.os.getname());
		System.out.println(m.os.getSize());
		Charger c = new Charger("Samsung", 33);
		m.hasAcharger(c);
		m = null;  //destroy mobile
		System.out.println(c.getname());
	}
}
