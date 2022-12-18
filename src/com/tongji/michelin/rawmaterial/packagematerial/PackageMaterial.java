package com.tongji.michelin.rawmaterial.packagematerial;

import com.tongji.michelin.rawmaterial.RawMaterial;

/**
 * @classname PackageMaterial
 * @description package material
 * This class have no extra methods or attrs now!
 */
public class PackageMaterial extends RawMaterial implements Cloneable {

	/**
	 * ctor of PackageMaterial
	 * 
	 * @param initialQuant initial quantity
	 */
	protected PackageMaterial(double initialQuant) {
		super(initialQuant);
	}

	protected PackageMaterial() {
		this(1);
	}
}
