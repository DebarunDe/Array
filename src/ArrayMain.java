
public class ArrayMain {

	public static void main(String[] args) {

		//variable declaration
       Dice dice1 = new Dice();
       Dice dice2 = new Dice();
       
       //array declaration
       int[]values = new int[13];
       
       //roll dice 1000x
       for(int i = 0; i < 1000; i++)
       {
    	 
    	  //Roll Declaration 
    	  int roll1 = dice1.roll();
    	  int roll2 = dice2.roll();
    	  int sum = roll1 + roll2;
    	   
    	  //Finding Values of Rolls
    	   if(sum == 2)
    	   {
    		   values[2]++;
    	   }
    	   if(sum == 3)
    	   {
    		   values[3]++;
    	   }
    	   if(sum == 4)
    	   {
    		   values[4]++;
    	   }
    	   if(sum == 5)
    	   {
    		   values[5]++;
    	   }
    	   if(sum == 6)
    	   {
    		   values[6]++;
    	   }
    	   if(sum == 7)
    	   {
    		   values[7]++;
    	   }
    	   if(sum == 8)
    	   {
    		   values[8]++;
    	   }
    	   if(sum == 9)
    	   {
    		   values[9]++;
    	   }
    	   if(sum == 10)
    	   {
    		   values[10]++;
    	   }
    	   if(sum == 11)
    	   {
    		   values[11]++;
    	   }
    	   if(sum == 12)
    	   {
    		   values[12]++;
    	   }
       }
       
       //End print stage
       int rolls = values[2] + values[3] + values[4] + values[5] + values[6] + values[7] + values[8] + values[9] + values[10] + values[11] + values[12];
       System.out.println("2: " + values[2]);
       System.out.println("3: " + values[3]);
       System.out.println("4: " + values[4]);
       System.out.println("5: " + values[5]);
       System.out.println("6: " + values[6]);
       System.out.println("7: " + values[7]);
       System.out.println("8: " + values[8]);
       System.out.println("9: " + values[9]);
       System.out.println("10: " + values[10]);
       System.out.println("11: " + values[11]);
       System.out.println("12: " + values[12]);
       System.out.println("Total Rolls: " + rolls);

	}

}
