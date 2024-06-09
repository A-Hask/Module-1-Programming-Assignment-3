import java.util.Scanner;

class Main {
    public static boolean equals(int[][] m1, int[][] m2){
        if (m1.length != m2.length){
            System.out.println("The arrays are not identical");
            return false;
        }
            for (int i = 0; i < m1.length; i++){
                for (int j = 0; j < m1[i].length; j++){
                    if (m1[i][j] != m2[i][j]){
                        System.out.println("The arrays are not identical");
                        return false;
                    }
                }
            }
            System.out.println("The arrays are identical");
            return true;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        
        System.out.println("Enter a 3x3 array: ");
        for (int i = 0; i <= 2; i++){
          for (int j = 0; j <= 2; j++){
               m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter another 3x3 array: ");
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                m2[i][j] = sc.nextInt();
            }
        }

        boolean result = equals(m1, m2);
    }
}