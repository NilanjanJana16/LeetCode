class Solution {
    public int tribonacci(int n) {

 
    //    if(n==0){
    //        return 0;
    //    }else if(n<=2){
    //        return 1;
    //    }

    //    return tribonacci (n-1) + tribonacci (n-2) + tribonacci (n-3);
        
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }else{

            int first_term= 0;
            int second_term= 1;
            int third_term = 1;

            for(int i=0; i<n; i++){
                int fourth_term = first_term + second_term + third_term; 

                first_term = second_term;
                second_term = third_term;
                third_term= fourth_term;


            }

            return first_term;

        }







    }
}