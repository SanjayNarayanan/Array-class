package practise;

public class arrayclass {
    public static void main(String[] args) {
       int exam[]=new int[5];

       exam[1]=44;
       exam[2]=33;
       exam[3]=44;
       exam[4]=55;
      

    //    System.out.println(exam[9]);
    // System.out.println(exam[5]+" "+exam[8]);
    System.out.println("----------------------");
           
    // for(int i=0;i< exam.length;i++){
    //     System.out.println(exam[i]);

        // for(int j=exam.length-1;j>0;j--){
        //     System.out.println(exam[j]);
        // }

    // }
                for(int i=0;i<exam.length;i++){
                    System.out.println(exam[i]);
                }

                for(int j=exam.length-1;j>0;j--){
                    System.out.println(exam[j]);
                }
                for(int e:exam);{
                    System.out.println(e);
                }

        
    }
    
    
}
