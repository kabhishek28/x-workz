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

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Camera) {
                Camera other = (Camera) object;
                if (this.brand.equals(other.brand) &&
                        this.megapixels == other.megapixels) {
                    return true;
                }
            }
        }
        return false;
    }
}
