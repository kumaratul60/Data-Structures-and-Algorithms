package NumberPattern;

import java.util.Scanner;

public class PATTERNS{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num of Star : ");
		int n = sc.nextInt();
		//int n=5;
//****************************************************************
		System.out.println(1);

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				System.out.print("* ");
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				System.out.print("* ");
			System.out.println();
		}
		
//**************************************************************
		System.out.println("2");
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			//for(int j=n-1;j>=i;j--)
				System.out.print(" ");
			
			for(int j=1;j<=i*2-1;j++)
				System.out.print("*");
				
			/*  for(int j=1;j<=i;j++)
			System.out.print("* ");
			*/
		
		System.out.println();
	}
		//for(int i=n-1;i>=1;i--)
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=i;j--)
			System.out.print(" ");
		for(int j=1;j<=i*2-1;j++)
			System.out.print("*");
		System.out.println();
	}
//*************************************************************	
	System.out.println("3");

		for(int i=1;i<=n;i++)
		{
			for(int j=n;j<i;j++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				System.out.print("*");
			System.out.println();
		}
		
//******************************************************************

//******************************************************************
		
		System.out.println(4);

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			for(int j=1;j<=n;j++)
				System.out.print("*");
			System.out.println();
	}
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
			System.out.print(" ");
		for(int j=1;j<=n;j++)
			System.out.print("*");
		System.out.println();
}
//*******************************************************************	
	System.out.println("5");

	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>i;j--)
			System.out.print(" ");
			for(int j=1;j<=(i*2)-1;j++)
		System.out.print("*");
		System.out.println();
	}
//	for(int i=n-1;i>=1;i--)
	for(int i=n-1;i>=1;i--)
	{
		for(int j=n-1;j>=i;j--)
			System.out.print(" ");
		for(int j=1;j<=i*2-1;j++)
			System.out.print("*");
		System.out.println();
	}
	
//********************************************************************
	System.out.println("6");

	for(int i=1;i<=n;i++)
	{
		for(int j=n-1;j>=i;j--)
			System.out.print(" ");
		for(int j=1;j<=i;j++)
			System.out.print("*");
		System.out.println();
	}
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		System.out.print(" ");
		//for(int j=n-1;j>=i;j--)
		for(int j=1;j<=n-i;j++)
			System.out.print("*");
		System.out.println();
		}
//****************************************************************
	System.out.println("7");

    for(int i=n;i>=1;i--)
     	{
		for(int j=i;j>=1;j--)
			System.out.print("*");
     System.out.println();
	}
    for(int i=2;i<=n;i++)
    {
   	 for(int j=i;j>=1;j--)
				System.out.print("*");
      System.out.println();
    }
 //****************************************************************
    System.out.println("8");

    for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
			System.out.print("*");
		System.out.println();
	}

		for(int i=1;i<=n;i++)
		{
			//for(int j=1;j<=n-i+1;j++)
		for(int j=1;j<=n-i;j++)
		//for(int j=n;j>=i;j--)
			System.out.print("*");
		System.out.println();
		}
//**************************************************************	
	      System.out.println(9);
	      
	      for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i+1;j++)
					System.out.print("*");
				System.out.println();
			}
//***************************************************************
	      System.out.println(10);
	      
	      for(int i=1;i<=n;i++)
			{
				//for(int j=n-1;j>=i;j--)
				for(int j=1;j<=n-i;j++)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
					//System.out.print("* ");
					System.out.print("*");
				System.out.println();
			}
//**************************************************************
	      System.out.println(11);

	      for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
				if(i==1||j==i||j==n)
					System.out.print("*");
				else
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
					System.out.print(" ");
				System.out.println();
			}

			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
					System.out.print(" ");
				for(int j=n;j>=i;j--)
				{
					if(i==j||j==n||i==1)
					System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}

//**************************************************************	      
			System.out.println(12);

			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
				System.out.print(" ");
				}
			for(int j=1;j<=(i*2)-1;j++)
			{ 
				if(j==1||j==(i*2)-1||i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
			
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=1;j--)
				{
				System.out.print(" ");
				}
			for(int j=1;j<=(i*2)-1;j++)
			{ 
				if(j==1||j==(i*2)-1||i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
//*************************************************************
			System.out.println(13);

			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i*2-1;j++)
				{ 
					if(j==1||j==i*2-1||i==n)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();

				for(int j=n;j>=i;j--)
					System.out.print(" ");
			}
			for(int i=n;i>=1;i--)
			{
			
				for(int j=1;j<=i*2-1;j++)
				{ 
					if(j==1||j==i*2-1||i==n)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();

				for(int j=n;j>=1;j--)
					System.out.print(" ");

			}
//*******************************************************************
			System.out.println(14);

			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
					System.out.print(" ");
				for(int j=1;j<=i*2-1;j++)
					System.out.print("*");
				System.out.println();
			}
			for(int i=n-1;i>=1;i--)
			{
				for(int j=n;j>=i;j--)
					System.out.print(" ");
				for(int j=1;j<=i*2-1;j++)
					System.out.print("*");
				System.out.println();
			}
		//*********************************************************************
			System.out.println(15);

			 for (int i=1; i<=n; i++)
		     {
		                                     // Print space in decreasing order
		         for (int j=n; j>i; j--)
		             System.out.print(" ");
		                                    // Print star in increasing order
		         for (int k=1; k<=(i * 2) -1; k++)
		         {
		             if( k == 1 || k == (i * 2) -1)
		                 System.out.print("*");
		             else
		                 System.out.print(" ");
		         }
		         System.out.println();
		     }
		     for (int i=n-1; i>=1; i--)
		     {
		                                           // Print space in increasing order
		         for (int j=n-1; j>=i; j--)
		             System.out.print(" ");
		                                             // Print star in decreasing order
		         for (int k=1; k<=(i * 2) -1; k++)
		         {
		             if( k == 1 || k == (i * 2) -1 )
		                 System.out.print("*");
		             else
		                 System.out.print(" ");
		         }
		         System.out.println();
		     }		
//************************************************************************************
	         System.out.println(16);

		     for (int i=1; i<=n; i++)
		        {
					for(int j=n;j>i;j--)
						System.out.print(" ");
					for(int j=0;j<i*2-1;j++)
					{
						if(j==0||j==i*2-2||i==0)
							System.out.print("*");
							else
								System.out.print(" ");
						}
					System.out.println();
					}
				for (int i=n; i>=1; i--)
		        {
					for(int j=n;j>i;j--)
					//for(int j=0;j<n-1;j++)
						System.out.print(" ");
					for(int j=0;j<i*2-1;j++)
					{
						if(j==0||j==i*2-2||i==0)
							System.out.print("*");
							else
								System.out.print(" ");
						}
					System.out.println();
					}

//****************************************************************************
 //************************************************************************
	         System.out.println(17);

				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=i;j++)
						System.out.print("*");
					for(int k=i*2;k<=n*2-1;k++)
						System.out.print(" ");
					for(int l=1;l<=i;l++)
						System.out.print("*");
					System.out.println();
				}
				
			for(int i=1;i<=n;i++)
			{
				for(int j=n-1;j>=i;j--)
					System.out.print("*");
				for(int k=1;k<=i*2;k++)
					System.out.print(" ");
				for(int l=n-1;l>=i;l--)
					System.out.print("*");
				System.out.println();
				}
//*****************************************************************************
	         System.out.println(18);
	
			for(int i=1;i<=n;i++)
			{

				//for(int j=1;j<=i;j++)
				for(int j=n;j>=i;j--)
					System.out.print("*");
				for(int k=i*2;k<=n*2-1;k++)
					System.out.print(" ");
				for(int l=1;l<=i;l++)
				//for(int l=n;l>=i;l--)
					System.out.print("*");
				System.out.println();
		}


//****************************************************************************
			System.out.println(19);

				for(int i=1;i<=n;i++)
				{
					for(int j=n-1;j>=i;j--)
						System.out.print("*");
					for(int k=1;k<=i*2;k++)
						System.out.print(" ");
					for(int l=n-1;l>=i;l--)
						System.out.print("*");
					System.out.println();
					}
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=i;j++)
						System.out.print("*");
					for(int k=i*2;k<=n*2-1;k++)
						System.out.print(" ");
					for(int l=1;l<=i;l++)
						System.out.print("*");
					System.out.println();

				}
//******************************************************************************
				System.out.println(20);

			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
					System.out.print("*");
				for(int k=i*2;k<=n*2-1;k++)
					System.out.print(" ");
				for(int l=1;l<=i;l++)
					System.out.print("*");
				System.out.println();

			}
			//for(int i=n-1;i>=1;i--)
			for(int i=n;i>=1;i--)

			{
				for(int j=1;j<=i;j++)
					System.out.print("*");
				for(int k=i*2;k<=n*2-1;k++)
					System.out.print(" ");
				for(int l=1;l<=i;l++)
					System.out.print("*");
				System.out.println();
			}
//****************************************************************************
			  System.out.println(21);

				for(int i=1;i<=n;i++)
				{
					//for(int j=1;j<=i;j++)
					for(int j=i;j<=n;j++)
						System.out.print("*");
					//for(int k=i*2;k<=n*2-2;k++)
					for(int k=1;k<=i*2-2;k++)
						System.out.print(" ");
					//for(int l=1;l<=i;l++)
					//for(int l=i;l>=n;l--)
					for(int l=i;l<=n;l++)
						System.out.print("*");
					System.out.println();
				}
				
			for(int i=1;i<=n;i++)
			{
				//for(int j=n-1;j>=i;j--)
				for(int j=1;j<=i;j++)
					System.out.print("*");
				for(int k=i*2-2;k<=n*2-2;k++)
					System.out.print(" ");
			//	for(int l=n-1;l>=i;l--)
				for(int l=1;l<=i;l++)
					System.out.print("*");
				System.out.println();
				}
//**************************************************************************
		/*	System.out.println();
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<i;j++)
					System.out.println(" ");
				for(int j=i;j<=n;j++)
				{
					if(i==1||j==n||j==i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
				}
			for(int i=n-1;i>=1;i--)
			{
				for(int j=1;j<i;j++)
					System.out.println(" ");
				for(int j=i;j<=n;j++)
				{
					if(i==1||j==n||j==i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
				}
			*/
//********************************************************************************************
			System.out.println(22);
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(i==1||i==n||j==n||j==1)
						System.out.print("*");
					else
						System.out.print(" ");		
				}
				System.out.println();
			}
            System.out.println(); 

//************************************************************************
                System.out.println(23);
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(i==1||i==n||j==n||j==1)
						System.out.print("*");
					else
						System.out.print(" ");		
				}
				System.out.println();
			}
            System.out.println(); 

	
//************************************************************************
        System.out.println(24);
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=1;j++)
		{
			if(i==1||i==n||j==n||j==1)
				System.out.print("*");
			else
				System.out.print(" ");		
		}
		System.out.println();
	}	
    System.out.println(); 

//**********************************************************************
	System.out.println(25);

	for(int i=1;i<=n*2-1;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==i||j==n-i+1)
			//if(1==i||j==n-i+1)
			//if(j==1||j==n-i+1)
		
				System.out.print("*");
				else 
					System.out.print(" ");
		}
		
			System.out.println();
	}	
    System.out.println(); 

//********************************************************************
       System.out.println(26);
       
	  for (int i = 1; i <= n * 2 - 1; i++)
      {
          if (i == 1 || i == n || i == n * 2 - 1)
          {
              for (int j = 1; j <= n; j++)
                  if (j == 1 || j == n)
                      System.out.print(" ");
                  else
                      System.out.print("*");
          }
          else
          {
              for (int k = 1; k <= n; k++)
                  if (k == 1 || k == n)
                      System.out.print("*");
                  else
                      System.out.print(" ");
          }
          System.out.println();
      }
      System.out.println(); 

//*******************************************************************
      System.out.println(27);
      

      for(int i=1; i<= n; i++)
      {
          if(i%2 != 0)
          {
              for(int j=1; j<= n/2+1; j++)
              {
                  System.out.print("*  ");
              }
          }
          else
          {
          	for(int j=1; j<= n/2; j++)
              {
                  System.out.print(" * ");
              }
          }
          System.out.println("");
      }
      System.out.println();
      System.out.println(); 

  //**********************************************************************
      System.out.println(28);

      for (int i=1; i<=(n * 2 -1); i++)
      {
          if( i == n)
          {
                                            // Printing Horizontal Line of Stars
              for (int j=1; j<=(n * 2 -1); j++)
                  System.out.print("*");
          }
          else
          {
                                  // Printing space before Vertical Line of Stars
              for(int k=1; k<=n-1; k++)
              {
                  System.out.print(" ");
              }
              System.out.print("*");
          }
          System.out.println();
      }
      System.out.println(); 

  //************************************************************************
      System.out.println(29);

      int counter =1;
      for(int i=1; i<=n; i++)
      {
          if(i%2 != 0)
          {
              for(int j=1; j<= Math.pow(2, counter); j++)
              {
                  System.out.print("* ");
              }
              counter++;
          }
          else
          {
              System.out.print("*");
          }
          System.out.println("");
      }
      System.out.println(); 

//********************************************************************  
      System.out.println(30);

      for(int i=1; i<= n; i++)
      {
          if(i%2 != 0)
          {
              for(int j=1; j<=n; j++)
              {
                  System.out.print("_*");
              }
          }
          else
          {
          	System.out.print("_");
          	for(int j=1; j<=n-1; j++)
              {
                  System.out.print("_*");
              }
          	System.out.print("_");
          }
          System.out.println("");
      }
      System.out.println(); 

 //********************************************************************  
      System.out.println(31);

      for(int i=1; i<=n; i++)
		{
			for(int j=n-i; j >= 1; j--)
			{
				System.out.print("_ ");
			}
			for(int k=i*2-1; k>=1; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
//		for(int i=1; i<n; i++)
//		{
//			for(int l=n*2-1; l>=1; l--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//********************************************************************  
		System.out.println(32);

		 for(int i=1; i<=n; i++)
	        {
	            for (int k=1; k<=i; k++)
	            {
	                System.out.print(" ");
	            }
	            for(int j=1; j<=n-i+1; j++)
	            {
	                if(j == 1)
	                    System.out.print("*");
	                else
	                    System.out.print("_*");
	            }
	            
	            System.out.println();
	        }
		 for(int i=n; i>=1; i--)
	        {
	            for (int k=1; k<=i; k++)
	            {
	                System.out.print(" ");
	            }
	            for(int j=1; j<=n-i+1; j++)
	            {
	                if(j == 1)
	                    System.out.print("*");
	                else
	                    System.out.print("_*");
	            }
	            
	            System.out.println();
	        }
         System.out.println(); 

//*************************************************************************
         System.out.println(33);

		  for (int i = 1; i <= n; i++) 
	        { 
	            for (int j = 1; j <= i; j++) 
	            { 
	                System.out.print("* "); 
	            } 
	            System.out.println(); 
	        } 
	        for (int i = n; i >= 1; i--) 
	        { 
	            for (int j = 1; j < i; j++) 
	            { 
	                System.out.print("* "); 
	            } 
	            System.out.println(); 
	        }
            System.out.println(); 

//*************************************************************************
            System.out.println(34); 

	        for (int i = n; i >= 1; i--) 
	        { 
	            for (int j = i; j <= n; j++) 
	            { 
	                System.out.print("* "); 
	            }  
	            for (int k = n-1; k >= i; k--) 
	            { 
	                System.out.print("* "); 
	            } 
	            System.out.println(); 
	        } 
	        for (int i = 2; i <= n; i++) 
	        { 
	            for (int j = i; j <= n; j++) 
	            { 
	                System.out.print("* "); 
	            } 
	            for (int k = n-1; k >= i; k--)
	            { 
	                System.out.print("* "); 
	            } 
	            System.out.println(); 
	        } 
            System.out.println(); 

//**************************************************************************
	        
            System.out.println(35); 
            System.out.println(); 


	        for(int i=1; i<=n; i++)
	    	{
	    		for(int j=1;j<=i;j++)
	    		{
	    			System.out.print("*");
	    		}
	    		for(int j=i;j<=n-1;j++)
	    		{
	    			System.out.print("#");
	    		}
	    		System.out.println();
	    	}	        
//****************************************************************************
    		System.out.println(36);
    		System.out.println();

	        for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=n+1;j++)
				{
					if(i==0 && j%3!=0 || i==1 && j%3==0 || i-j==2 ||  i+j==8)
					{
						System.out.print("*");
					}
					else 
						System.out.print(" ");
				}
				System.out.println();
			}
 //*******************************************************************************
	        System.out.println(37);
    		System.out.println();
    		int num=1;

	        for(int i=0;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
					System.out.print(" ");
				        ++num;
				}
				for(int k=0;k<=i;k++)
				{
					System.out.print(" "+num);
				}
				System.out.println();
			}
	
//*******************************************************************************

	        
      }
	}

