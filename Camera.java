package musterrrs.SorterApp.camera;

public class Camera {
    private Lens objektiv;
    private String brand;
    private double megapixels;
    private double displaySize;
    private boolean colored;
    public static int anzahlCam = 0;

    public Camera(String marke, Double megapixels, double displaySize, boolean colored, Lens objektiv) {
        this.brand = marke;
        this.megapixels = megapixels;
        this.displaySize = displaySize;
        this.objektiv = objektiv;
        this.colored = colored;
        anzahlCam++;
    }
    public static int getAnzahlCam() {
        return anzahlCam;
    }

    public Lens getObjektiv() {
        return this.objektiv;
    }

    public double getMegapixels() {
        return this.megapixels;
    }

    public String getBrand() {
        return this.brand;
    }

    public boolean isColored() {
        return this.colored;
    }

    public double getDisplaySize() {
        return this.displaySize;
    }

public void setObjektiv(Lens newObjektiv) {
        this.objektiv = newObjektiv;
}
public void setColored(Boolean newcolored){
        this.colored = newcolored;
}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String modus = this.colored ? "Farbe" : "Schwarz-Weiß";
        sb.append("Kamera [Marke=").append(this.brand)
                .append(", MP=").append(this.megapixels)
                .append(", Display=").append(this.displaySize).append("\"")
                .append(", Modus=").append(modus)
                .append(", Aktuelles ").append(this.objektiv.toString()) ;

        return sb.toString();
    }
}

