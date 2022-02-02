public class ConversionFun {
    public static void main(String args[]) {

        float myFloat = 3.14f;
        double myDouble = 3.14;            //narrowing lossy conversion
        double yourDouble = myFloat;
        System.out.println(yourDouble);//widening lossless conversion
    }
}