
package com.tongji.michelin.supplement.receipt.provider;

/**
 * @classname TaxProvider
 * @description Provider of Purchase invoice
 */
public class PurchaseProvider extends Provider {


    /**
     * Constructor with parameters.
     * @param providerName:Person name in charge of provider
     * @param providerTel: tel in charge of provider
     * @param providerAdd: Address in charge of provider
     */
    public PurchaseProvider(String providerName, String providerTel, String providerAdd) {
        super(providerName, providerTel, providerAdd);
    }

    /**
     * Person Address in charge of provider
     */
    public PurchaseProvider() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}