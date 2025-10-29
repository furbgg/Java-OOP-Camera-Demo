package musterrrs.SorterApp.camera;

public class CameraApp {
    public static void main(String[] args) {
        Lens standartLens = new Lens(18,55);
        Lens zoomLens = new Lens(70 ,200);
        Camera nikon = new Camera("Nikon",36.3,3.4, true,standartLens);
        Camera canon = new Camera("Canon" , 24.5,3.0,false,standartLens);

        System.out.println(nikon);
        System.out.println(canon);

        nikon.setObjektiv(zoomLens);
        System.out.println("Das Lens der Nikon wurde ausgetauscht.");
        System.out.println(nikon);

        System.out.println("Anzahl ist ::" + Camera.getAnzahlCam());
    }
}
