package com.sumeet.design.pattern.singleton;

/*
 * @Author Sumeet Kumar
 * 
 * This class demonstrates singleton design pattern.
 * It also shows how to prevent singleton pattern from breaking
 * due to different factors
 */


public class Singleton implements Cloneable {

	private static Singleton singleton = null;

	private Singleton() {
		// use below to prevent breaking of singleton pattern from reflection
		if (singleton != null) {
			throw new RuntimeException("Reflection should be used to create object of this class");
		}
	}

	// preventing it from cloning
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning is not allowed for this class");
	}

	// prevent it from serialization 
	public Object readResolve() {
		return singleton;
	}
	
	public Singleton getInstance() {

		// preventing it from concurrency issue
		
		if (singleton == null) {

			synchronized (singleton) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
