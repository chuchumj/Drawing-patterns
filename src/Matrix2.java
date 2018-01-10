class Matrix2 {
    public static void main(String[] args) {
        int m = 1;
        for (int i = 0; i <= 4; i++) {

            for ( int k = 4; k>i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                if (j==0||i==0)
                    m=1;
                else
                    m=m*(i-j+1)/j;
                System.out.print(" "+m);
            }
            System.out.println("");
        }

    }

}

