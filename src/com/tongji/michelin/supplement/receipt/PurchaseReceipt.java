package com.tongji.michelin.supplement.receipt;

import com.tongji.michelin.supplement.receipt.provider.CommonProvider;
import com.tongji.michelin.supplement.receipt.provider.PurchaseProvider;

/**
 * @classname PurchaseReceipt
 * @description
 *
 * Purchase Receipt,
 *
 * once determined, is immutable, so use final for a modification.
 *
 */
public final class PurchaseReceipt extends AbstractReceipt {


    /**
     * @param info:message of the receipt;
     */
    public PurchaseReceipt(String info){
        // constructor redirection
        this(info, ReceiptType.PURCHASERECEIPT);
    }

    /**
     * @param info : message of the receipt;
     * @param type : type of the receipt
     */
    protected PurchaseReceipt(String info, ReceiptType type) {
        super(info, type, new PurchaseProvider("purchaseName","purchaseTel","purchaseAdd"));
    }


}