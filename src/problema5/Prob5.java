package problema5;
import java.util.Scanner;
public class Prob5
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int n=scanner.nextInt();
        int t1=0,t2=1,s;
            System.out.println("0");
            for(int i=2;i<=n;++i){

                s=t1+t2;

                 if(i==2){
                    System.out.print("1 \n");
                }
                else if(t2<=n && i!=1 && i!=2){
                    System.out.println(t2);
                }
                t1=t2;
                t2=s;
            }
    }
}
