package com.java.xworkz.Camera;

public class CameraRun {
    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.setBrand("Sony");
        camera.setPrice(20000);
        camera.setType(Type.DSLR);
        camera.setConnectivity("Network Access");

        Camera camera1 = new Camera();
        camera1.setBrand("Nikon");
        camera1.setPrice(25000);
        camera1.setType(Type.SLR);
        camera1.setConnectivity("Remote Access:");

        Camera camera2 = new Camera();
        camera2.setBrand("L.G");
        camera2.setPrice(30000);
        camera2.setType(Type.CCTV);
        camera2.setConnectivity("Cloud Access");

        Camera[] cameras = {camera,camera1,camera2};

        CameraShop cameraShop = new CameraShop();
        cameraShop.getCamera(cameras);

    }
}
