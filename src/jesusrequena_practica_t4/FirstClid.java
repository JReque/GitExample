package jesusrequena_practica_t4;

public class FirstClid{
 public static int elemento(int fila, int columna) {
      int resultado=0;
      if (columna == 1 || fila == 1){
          resultado =1;
      }else{
        resultado = elemento(fila-1,columna)+elemento(fila,columna-1);
      }
      return resultado;
    }
 
    public static void cuadrado(int filas){
        int columnas = filas;
        int maximo=elemento(filas,columnas);
         
        int cifras=Integer.toString(maximo).length();
         
        for (int i = 1; i <=filas; i++) {
            for (int j = 1;j <= columnas; j++) {
                int pintar = elemento(i,j);
                if(pintar>0){
                    System.out.printf("%"+cifras+"d ", pintar);
                }
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        cuadrado(5);
        System.out.println("Este mensaje es para un ejemplo de que es una modificación más reciente.");
    }
}
