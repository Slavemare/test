
package javaapplication14;


public class JavaApplication14 {

    
    public static void main(String[] args) {
     
      
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        System.out.println("Zadati niz je:  {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87}");
        int a = 0;
        int b = 0;
        int j = 0;
        int k = 0; 
        for (int i=0; i<array.length; i++)
        {
            if (array[i]>0) {
                a=++a ;
            }
            else if (array[i]<0) {
                b=++b;
            }
        }
        int[] pozitivanNiz = new int[a];
        int[] negativanNiz = new int[b];
        for (int i=0; i<array.length -1 ; i++)
        {
            if (array[i]>0) {
                pozitivanNiz[j++]=array[i];
            }
            else if (array[i]<0) {
                negativanNiz[k++]=array[i];
            
            
            }
              
            
           
        }
        int brDup = 0;
        for (int i=0;i<array.length;i++)
         for (int z=i+1;z<array.length;z++)
                {
           if(array[i]==array[z])
             brDup = brDup+1;

      }
      
      
        System.out.print("Niz sa pozitivnim clanovima je ");
        System.out.println(java.util.Arrays.toString(pozitivanNiz));
        System.out.print("Niz sa negativnim clanovima je ");
        System.out.println(java.util.Arrays.toString(negativanNiz));
        System.out.println("Broj duplikata " + brDup );

}
}
 
