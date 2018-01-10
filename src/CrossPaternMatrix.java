import java.util.Scanner;

class Matrix
{
    static void draw(int width, int height)
    {
        boolean flag;
        int k = height/2 ;
        for(int i = 0; i < height; i++){
            for(int j = 0;j< width ; j++){

                if(((height / 2) == i && (width / 2) == j) ) {

                  flag = (height / 2) == i && (width / 2) == j;
                    System.out.print(flag ? "x" : "o");

                }
                if((height / 2) != i || (width / 2) != j)  {
                    flag = (height / 2 - k) == i && (width / 2 - k) == j || (height / 2 - k) == i && (width / 2 + k) == j || (height / 2 + k) == i && (width / 2 - k) == j || (height / 2 + k) == i && (width / 2 + k) == j;
                    System.out.print(flag ? "x" : "o");

                }
            }
            System.out.println();
           k =  --k;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        draw(w, h);
    }
}