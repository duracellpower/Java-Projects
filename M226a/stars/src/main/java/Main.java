public class Main {


    public static void main(String args[]){

    }

    public char []newLine(){
        for(int line = 0; line < 10; line++){
            for(int stars = 0; stars < 10; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        return newLine();
    }
}
