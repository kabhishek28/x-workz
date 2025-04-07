package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.INR;
import com.xworkz.IsARelation.internal.Currency;

public class CurrencyUtil {


        public CurrencyUtil() {
            System.out.println("CurrencyUtil Constructor");
        }

        public void getCurrencyDetails(Currency currency) {
            if (currency != null) {
                currency.currency();
                currency.rate();
                currency.convert();
                currency.GDP();
                currency.amount();

                if (currency instanceof INR) {
                    INR inr = (INR) currency;
                    inr.showCurrencySymbol();
                } else {
                    System.out.println("currency is not an instance of INR");
                }

                System.out.println("----- Currency Behavior Displayed -----");
            } else {
                System.out.println("Currency object is null");
            }
        }


}
