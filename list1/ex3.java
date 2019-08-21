 public void binario(int numero)
    {
        int d = numero;
        int b;
        while ( d > 1){
            b = d % 2;
            System.out.println ( b );
            d -= d / 2 ;
        }
    }