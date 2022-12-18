package com.tongji.michelin.supplement.receipt.provider;

/**
 * @classname TaxProvider
 * @description Provider of Common invoice
 */
public class CommonProvider extends Provider {


    /**
     * Constructor with parameters.
     * @param providerName:Person name in charge of provider
     * @param providerTel: tel in charge of provider
     * @param providerAdd: Address in charge of provider
     */
    public CommonProvider(String providerName, String providerTel, String providerAdd) {
        super(providerName, providerTel, providerAdd);
    }

    /**
     * Person Address in charge of provider
     */
    public CommonProvider() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}