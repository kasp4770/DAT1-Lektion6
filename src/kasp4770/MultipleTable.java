package kasp4770;

public class MultipleTable {
    public static void main(String[] args) {

        int i, j, resultat;
        for (j=1; j<=10; j++){ //kolonner
            for(i=1; i<=10; i++){ //rækker
            resultat = i*j;
            if(resultat % 10 == 0)
                System.out.print("*");
            if(resultat % 10 != 0)
                System.out.print(" ");

            System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
