public class FiboNum{
    

    public static void main(String[] args){

        try{
        System.out.println(calcFibo(Integer.parseInt(args[0])));
        }
        catch(Exception e){
            System.out.println("Please enter a positive whole number");
        }
    }

    public static int calcFibo(int args){
        int n1 = 0, n2 = 1;
        
        for(int i = 0; i < args; i++){
            int plchldr = n2 + n1;
   
            n1 = n2;
            n2 = plchldr;
        }
    
        return n1;
    }
}
