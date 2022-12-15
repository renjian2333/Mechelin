package com.tongji.michelin.machine.processmachine.productmachine.extension;

import com.tongji.michelin.product.Product;

public interface MachineExtension extends Extension {
    int continueWork(int workNum, Product product);
}
