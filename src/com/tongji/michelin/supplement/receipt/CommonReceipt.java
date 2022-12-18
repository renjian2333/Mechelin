package com.tongji.michelin.supplement.receipt;


import com.tongji.michelin.supplement.receipt.provider.CommonProvider;

/**
 * @classname CommonReceipt
 * @description
 *
 * Common Receipt,
 *
 * once determined, is immutable, so use final for a modification.
 *
 */
public final class CommonReceipt extends AbstractReceipt {


    /**
     * @param info:message of the receipt;
     */
    public CommonReceipt(String info){
        // constructor redirection
        this(info, ReceiptType.COMMONRECEIPT);
    }

    /**
     * @param info : message of the receipt;
     * @param type : type of the receipt
     */
    protected CommonReceipt(String info, ReceiptType type) {
        super(info, type, new CommonProvider("commonName","commonTel","commonAdd"));
    }


}