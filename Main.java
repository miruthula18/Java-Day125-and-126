import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int product=N*M;
        int root=(int) Math.sqrt(product);
        if(root*root==product){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
        
    }
}