package net.braniumacademy.l81.other;

public class Bai9 {
    public static void main(String[] args) {
        int i, j, k;
        int ccao = 5;

        for(i = 1; i <= ccao; i++){
            for(j = 1; j <= ccao - i; j++){
                System.out.printf("   ");
            }
            for(k = 1; k <= 2*i-1; k++){
                System.out.printf(" %d ", i - Math.abs(i - k));
            }
            System.out.printf("\n");
        }
    }
}
