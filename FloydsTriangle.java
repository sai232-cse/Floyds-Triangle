import java.util.Scanner;
public class FloydsTriangle{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter the number of rows to print");
        int n=snr.nextInt(),num=0;
	System.out.println("The floyds traingle pattern is: ");
        for(int i=0;i<=n;i++){
            for(int j=0;j<i+1;j++){
                num++;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}