package com.tongji.michelin.supplement.receipt.provider;

/**
 * @classname TaxProvider
 * @description Provider of tax invoice
 */
public class TaxProvider extends Provider {


    /**
     * Constructor with parameters.
     * @param providerName:Person name in charge of provider
     * @param providerTel: tel in charge of provider
     * @param providerAdd: Address in charge of provider
     */
    public TaxProvider(String providerName, String providerTel, String providerAdd) {
        super(providerName, providerTel, providerAdd);
    }

    /**
     * Person Address in charge of provider
     */
    public TaxProvider() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}