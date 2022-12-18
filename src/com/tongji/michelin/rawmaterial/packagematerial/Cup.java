package com.tongji.michelin.rawmaterial.packagematerial;


/**
 * @classname Cup
 * @description cup the package material
 */
public class Cup extends PackageMaterial {
	/**
	 * ctor of Cup
	 * 
	 * @param initialQuant initial quantity
	 */
	public Cup(double initialQuant) {
		super(initialQuant);
	}

	public Cup() {
		this(1);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Successfully copy a cup!");
		return (Cup) super.clone();
	}
}
