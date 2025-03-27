package com.xworkz.A_relations;

import com.xworkz.A_relations.external.*;
import com.xworkz.A_relations.internal.*;


public class Projector {

    Lens lens = new Lens();
    Lamp lamp = new Lamp("Plane","Table Lamp");

    Port port = new Port();
    PortType portType = new PortType();
    Wire wire =new Wire();
    Quality quality = new Quality();

    Board board = new Board();
    Capacitor capacitor = new Capacitor();

    Button button = new Button();

    Material material = new Material();

    Remote remote =new Remote();
    Battery battery =new Battery();
    Voltage voltage=new Voltage();


    public void getLens(){
        lens.setSize(25);
        lens.setType("Convex");

        System.out.println("Lens Type :"+lens.getType());
        System.out.println("Lens Size :"+lens.getSize());
    }

    public void getLamp(){
        lamp.getLamp();
        lamp.getWarranty();
    }

    public void getPort(){
        port.setIsPort(true);
        port.setIsBluetooth(true);
        System.out.println("port is there :"+port.getIsPort());
        System.out.println("Bluetooth is there :"+port.getIsBluetooth());
        port.getPortType(portType);
    }

    public void getWire(){
        wire.setTypeOfWire("Single Wire");
        wire.setNoOfWire(1);
        System.out.println("Wire Type :"+wire.getTypeOfWire());
        System.out.println("wire noOf Wire :"+wire.getNoOfWire());
        wire.getQuality(quality);
    }

    public void getBoard(){
        board.setIpAddress(1120564);
        board.setModelNumber(6575);
        System.out.println("Board IP Address :"+board.getIpAddress());
        System.out.println("Board Model Number :"+board.getModelNumber());
        board.getCapacitor(capacitor);

    }


    public void getButton(){
        button.setNoOfButton(2);
        button.setTypeOfButton("3 pin");
        System.out.println("Number of button :"+button.getNoOfButton());
        System.out.println("Types of Button :"+button.getTypeOfButton());
        button.getMaterial(material);
    }

    public void getRemote(){
        remote.setBatteryLevel(1000);
        remote.setModeButton("Netflix");
        System.out.println("Remote Battery level :"+remote.getBatteryLevel());
        System.out.println("Remote Battery Button :"+remote.getModeButton());
        remote.getBattery(battery,voltage);

    }


}
