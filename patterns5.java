import java.util.Scanner;
    class patterns5
    {
        public static void main(String args[])
        {
            int n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();// scan value for pattern
            for(int i=0;i<n;i++)//n=5->i=0,,i=1
            {
                for(int j=n;j>=1;j--)//j=5,j=4,j=3,j=2,j=1//,,j=5,j=4,j=3,j=2,j=1
                {
                    if((i+j)>n)//0+5>5,0+4,0+3,0+2,0+1>5?no//1+5=6>5,1+4>5
                        System.out.print(j);
                    else
                        System.out.print(n-i);//5-0=5 ,5-0=5,5,5,5
                }
                System.out.println();
            }
        }
    }


