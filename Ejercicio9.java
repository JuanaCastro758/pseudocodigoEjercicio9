import java.util.*;
public class Ejercicio9{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        float t1, t2;
        float s=0,i=0;
        do{
           System.out.println("Ingresar temperatura 1");
           t1=scanner.nextInt();
           System.out.println("Ingresar temperatura 2");
           t2=scanner.nextInt();
           if ((t1<=15) && (t1>=0)){
               s+=t1;
               i++;
               if ((t2<=15) && (t2>=0)){
                  s+=t2;
                  i++;
               }  
           }
        }while(t1!=0);
        float p=s/i;
        System.out.println("promedio: "+p);
    }
}