public class Start {

    static void binary(int n){
        if(n/2 <= 0){
            System.out.print(1);
            return;
        }
        binary(n/2);
        System.out.print(n%2);

    }

    public static void main(String[] args) {

        binary(18);

    }
}
