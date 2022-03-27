package at.campus02.iwi.pictures;

public class PictureApp {
    public static void main(String[] args) {
//pravim instancu klase
        Picture picture = new Picture();
        picture.width = 640;
        picture.length = 480;
//pozivam metodu
       double ergebniss= picture.totalPixels();
        System.out.println(" prva "+ergebniss);
//pozivam metodu

        double i=picture.totalSize(3);
        System.out.println("druga "+i);
//pozivam metodu skaliranja


        picture.scale(2);
        System.out.println(picture.length);
        System.out.println(picture.width);

    }
}
