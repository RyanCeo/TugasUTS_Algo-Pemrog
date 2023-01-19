public class Nomer6 {
    public static void main(String[]args){

        System.out.println("Contoh 1:");
        for(int i=0; i<=4; i++){
            for(int j=0 ; j<=4 ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Contoh 2:");

        for(int i=0; i<=4; i++){
            for(int j=0 ; j<=4 ; j++){
                System.out.print("*");
                if(i==j){
                    break;
                }
            }
            System.out.println("");
        }
        System.out.println("Contoh 3");

        for(int i=0; i<=4; i++){
            for(int j=0 ; j<=4 ; j++){
                System.out.print("*");
                if((i+j)==4){
                    break;
                }
            }
            System.out.println("");
        }
    }
}
