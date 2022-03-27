package at.campus02.iwi.pictures;

public class Picture {

    int length;
    int width;

    //metoda racuna broj pixela
    public int totalPixels(){
        int totalNumberOfPixels=0;
        totalNumberOfPixels=length*width;

        return totalNumberOfPixels;
    }
//metoda racuna kapacitet koji slika zauzme u memoriji
    public int totalSize(int bytePerPixel){
        int totalSizeVariable=0;
        totalSizeVariable=totalPixels()*bytePerPixel;

        return totalSizeVariable;
    }

    //racuna skaliranje, kolika je slika ako se smanji ili povca po nekom faktoru
    public void scale(double factor){

     length= (int) (length*factor);  //ovako se pretvara u int kad imam double u nekom racunu
     width= (int) (width*factor);
    }

}
//[1 Point] Create a class Picture in the package at.campus02.iwi.pictures with the two
//        properties length and width (each integer).
//        [2 Points] Create a method totalPixels() which calculates the total number of pixels (multiply
//        length with width).
//        [3 Points] Create a method totalSize(int bytePerPixel), which calculates the total storage
//        space for the image. Depending on the file format, the number of pixels must be multiplied by
//        a value (storage space per pixel). This is given in the parameter bytePerPixel. The method
//        totalPixels() can be used and multiplied with bytePerPixel to get the total size.
//        [2 Points] Create a method scale(double factor) that increases/decreases all properties by
//        a factor (given by parameter).
//        [2 Points] Test all methods of the class in a main() method in PictureApp class.