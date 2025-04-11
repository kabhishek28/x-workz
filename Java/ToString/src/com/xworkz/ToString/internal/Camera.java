package com.xworkz.ToString.internal;

public class Camera {
    private String brand;
    private int megapixels;
    private boolean hasZoom;

    public Camera(String brand, int megapixels, boolean hasZoom) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.hasZoom = hasZoom;
    }

    @Override
    public String toString() {
        return "Camera: " + brand + ", " + megapixels + "MP, Zoom: " + hasZoom;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}
