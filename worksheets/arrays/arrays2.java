public class arrays2 {
	
	public static void main (String[] args) 
	{
		double grade[] = new double[8];

        System.out.println("Ronit");
        String subject = IBIO.inputString("Enter the subject name: ");

         grade=storearray();
        
         IBIO.out(subject+": "+"| ");
         display(grade);

        IBIO.output("");

         IBIO.output("Lowest: " + minimum(grade));
         IBIO.output("Highest: " + maximum(grade));
         double y = trend(grade);

         if(y>=4.0){
             IBIO.output("Improving");
         }

         if(y<4.0){
             IBIO.output("Worsening");
         }

         mode (grade);
         median (grade);
	}


    public static void display(double[] grade ){
        for(int i = 0; i<8; i++){
            IBIO.out(grade[i]+ " | ");
        }
    }

    public static double maximum(double[] grade ){

        double max = grade[0];
        
        for(int i = 1; i<8; i++){

            if(grade[i]>max){
                max = grade[i];
            }
        }
return max;
    }

    public static double minimum(double[] grade ){

        double min = grade[0];
        
        for(int i = 1; i<8; i++){

            if(grade[i]<min){
                min = grade[i];
            }
        }
return min;
    }


    public static double trend(double[] grade){

        double total = 0.0;
        double average = 0.0;

        for(int i = 0; i<8; i++){
            total = total + grade[i];
        }

            average = (total/8);
   return average;
 }


    public static void mode(double[] grade){

        int mode = 1;
        int max = 0;
        double number=0;

        for(int i = 0; i<7; i++){
            for(int n =i+1; n<8;n++){
                if(grade[i]==grade[n]){
                    mode++;
                }
           
                if(max<mode){
                    max=mode;
                    number = grade[i];
                }

            }
       
        }
  
                IBIO.output(number + " occured " + max + " times.");
    }

    public static void median (double[] B) {
	    
	    double median = 0;
	    
	    median =  B[B.length/2];
	    
	    System.out.println("The median is = "+ median);
	    
	}


    public static double[] storearray(){

            double[] grade = new double[8];
            int i = 0;

            while(i < 8){

                double x = IBIO.inputDouble("Enter grade #" + (i+1) +"?: ");
                if((x>=1.0)&&(x<=7.9)){
                    grade[i] = x;
                    i++;
                }
                
                else{
                    IBIO.output("Error-grade must be between 1.0 and 7.9 inclusive.");
                }

            }

            return grade;
        }


}

