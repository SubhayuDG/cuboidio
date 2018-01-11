import java.util.*;
import java.lang.*;

class armul
{
    
 double[][] a = new double[4][2];
double[][] b = new double[2][1];
 double[][] c = new double[4][1];
 double[][] d = new double[4][1];
      public  void ma()
    {
        
        int i,j,k;
        for ( i = 0; i < 4; i++)
        {
            for ( j = 0; j < 1; j++)
            {
                for ( k = 0; k < 2; k++)
                {
                    d[i][j] = d[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        
        
        
    }
    
    public void showmat()
    {
        int i,j;
        for (i = 0; i < 2; i++)
        {
            for ( j = 0; j < 1; j++)
            {
                System.out.println(b[i][j]);
            }
        }
    }
    public void main()
    {   
        
        int i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of 1st martix row wise \n");
        for ( i = 0; i < 4; i++)
        {
            for ( j = 0; j < 2; j++)
            {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of product martix row wise \n");
        for (i = 0; i < 4; i++)
        {
            for ( j = 0; j < 1; j++)
            {
                c[i][j] = input.nextInt();
            }
        }
        int c=0,k;
        for(k=0;;k++)
        {
             for (i = 0; i < 2; i++)
        {
            for ( j = 0; j < 1; j++)
            {
                b[i][j] = Math.random();
            }
        }
        ma();
            for (i = 0; i < 4; i++)
        {
            for ( j = 0; j < 1; j++)
            {
                if(c[i][j]==d[i][j])
                {   
                    c++;
                    
                }
                if(c==4)
                {
                    showmat();
                    break;
                }
            }
        }
    }
                
            }
        }
        
               
   