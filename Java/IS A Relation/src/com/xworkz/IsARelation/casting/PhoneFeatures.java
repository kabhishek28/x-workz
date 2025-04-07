package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.IPhone;
import com.xworkz.IsARelation.internal.Phone;

public class PhoneFeatures {



        public PhoneFeatures() {
            System.out.println("PhoneFeatures Constructor");
        }

        public void getPhoneFeatures(Phone phone) {
            if (phone != null) {
                phone.call();
                phone.message();
                phone.charge();
                phone.turnOn();
                phone.turnOff();

                if (phone instanceof IPhone) {
                    IPhone iPhone = (IPhone) phone;
                    iPhone.useFaceID();
                } else {
                    System.out.println("Phone is not an instance of IPhone");
                }
            }
        }


}
