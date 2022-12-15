package com.tongji.michelin.machine.processmachine.wrappermachine.strategy;

import com.tongji.michelin.product.Product;
import com.tongji.michelin.rawmaterial.packagematerial.Cup;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname CupWrapStrategy
 * @description wrap a chocolate or a chocolate package with a cup
 * @date 2020/11/13 21:21
 */
public class CupWrapStrategy extends WrapStrategy {

    @Override
    public void packaging(Product product) {

        System.out.println("Start packaging " + product.toString() + " with a cup...");
        product.setPack(new Cup());
        product.gotoNextState();
        System.out.println("Finish packaging.");
        product.gotoNextState();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProducedDate(df.format(day));
    }
}
