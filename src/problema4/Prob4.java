package problema4;

public class Prob4 {
    public static void main(String[] args) {
        for(int i=2;i<=20;i++){
            int x=0;
            for(int d=1;d*d<=i;d++){
                if(i%d==0){
                    x++;
                }
            }
            if(x==1){
                System.out.println(i);
            }
        }
    }
}

