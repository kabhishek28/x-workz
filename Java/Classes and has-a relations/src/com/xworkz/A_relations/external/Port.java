package com.xworkz.A_relations.external;

import com.xworkz.A_relations.internal.PortType;

public class Port {
    private boolean isPort;
    private boolean isBluetooth;





    public void setIsPort(boolean port) {
        this.isPort=isPort;
    }

    public void setIsBluetooth(boolean isBluetooth) {
        this.isBluetooth=isBluetooth;
    }


    public boolean getIsPort(){
        return this.isBluetooth;
    }
    public boolean getIsBluetooth() {
        return this.isBluetooth;
    }

    public void getPortType(PortType portType){
        portType.setNoOfPort(3);
        portType.setPortType("C type");
        System.out.println("Port Type :"+portType.getPortType());
        System.out.println("Number of Port :"+portType.getNoOfPort());

    }


}
