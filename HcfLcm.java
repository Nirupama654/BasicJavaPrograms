public class HcfLcm{
    public static void main(String [] str){
        int x=12,y=15,hcf=1,lcm=1;
        for(int i=1; i<x; i++){
            int r=x%i;
            int r1=y%i;
            if(r==0&&r1==0)
                hcf=i;
        }
        System.out.println("Hcf of "+x+" and "+y+" is "+hcf);
        
        lcm=(x*y)/hcf;
        System.out.println("Hcf of "+x+" and "+y+" is "+lcm);
    }
}