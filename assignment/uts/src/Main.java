public class Main {

    public static void main (String [] args){
        library arr = new library();
        String in = arr.In_Stack();

        if (arr.conversiStringToStack(in) != "x"){
            arr.cekInput(arr.stackPoint,in);
        }
    }
}