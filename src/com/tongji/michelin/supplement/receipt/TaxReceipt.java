package com.tongji.michelin.supplement.receipt;

import com.tongji.michelin.supplement.receipt.provider.TaxProvider;

/**
 * @classname TaxReceipt
 * @description
 *
 * Tax Receipt,
 *
 * once determined, is immutable, so use final for a modification.
 *
 */
public final class TaxReceipt extends AbstractReceipt {


    /**
     * @param info:message of the receipt;
     */
    public TaxReceipt(String info){
        // constructor redirection
        this(info, ReceiptType.TAXRECEIPT);
    }

    /**
     * @param info : message of the receipt;
     * @param type : type of the receipt
     */
    protected TaxReceipt(String info, ReceiptType type) {
        super(info, type,new TaxProvider("taxName","taxTel","taxAdd"));
    }


}