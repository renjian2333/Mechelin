package com.tongji.michelin.rawmaterial.packagematerial;

/**
 * @classname Box
 * @description box the package material
 */
public class Box extends PackageMaterial {
	/**
	 * ctor of Box
	 * 
	 * @param initialQuant initial quantity
	 */
	public Box(double initialQuant) {
		super(initialQuant);
	}

	public Box() {
		this(1);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Successfully copy a box!");
		return (Box) super.clone();
	}
}
