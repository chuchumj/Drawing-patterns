interface BinaryOperator
{ int yield(int a, int b); }

class Binary
{
    public static final int low = 0, high = 2;

    public static void simulate(BinaryOperator op)
    {
        // your code

        int i = 0;
        int j = 0;
        try{

            for( i = 0 ;  i <= high ; i++ ){
                for( j = 0 ;  j <= high ; j++ ){
                    System.out.printf("%d %d => %d\n",i,j,op.yield(i, j));
                }}
        }catch(ArithmeticException e){
            for( i = 0 ;  i <= high ; i++ ){
                for( j = 0 ;  j <= high ; j++ ){

                    if( j == 0 ){
                        System.out.printf("%d %d => %s\n",i,j,"nan");
                    }else if( high != 0){
                        System.out.printf("%d %d => %s\n",i,j,"nan");
                    }
                }}


        }
    }


    public static void simulate(String mode)
    {
        // your code
        int i = 0;
        int j = 0;
        try{

            for( i = 0 ;  i <= high ; i++ ){
                for( j = 0 ;  j <= high ; j++ ){
                    System.out.printf("%d %d => %s\n",i,j,mode);
                }}
        }catch(ArithmeticException e){
            for( i = 0 ;  i <= high ; i++ ){
                for( j = 0 ;  j <= high ; j++ ){


                    System.out.printf("%d %d => %s\n",i,j,mode);

                }}


        }

    }
    public static void main(String[] args)
    {
        // your test code

        simulate((x,y)-> 1 / 0);


        simulate("mul");
    }
}