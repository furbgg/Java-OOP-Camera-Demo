package musterrrs.SorterApp.camera;

public class Lens {
    private int minBrenn;
    private int maxBrenn;
    public static int anzahl = 0;

    public Lens(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Maximale Brennweite muss größer als die minimale sein!");

        } else {
            this.minBrenn = min;
            this.maxBrenn = max;
        }
        anzahl++;
    }

    public int getMinBrenn() {
        return minBrenn;
    }

    public int getMaxBrenn() {
        return maxBrenn;
    }

    public void setBrenn(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Fehler ; Ungultige Brennweite\");");
        } else {
            this.minBrenn = min;
            this.maxBrenn = max;

        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Objektiv [")
                .append(this.minBrenn)
                .append("mm - ")
                .append(this.maxBrenn)
                .append("mm]");
        return sb.toString();

    }
}
