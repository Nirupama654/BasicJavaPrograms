public class BonusCal{
    int bonus=0;
    String analyst,associate,consultant;
    public void Bonus(int exp,String des){
        if(des.equals("Analyst")&&exp>0){
            if(exp>0&&exp<2)
                bonus=5000;
            else if(exp>2&&exp<5)
                    bonus=10000;
                else
                    bonus=15000;
        }
        if(des.equals("Associate")&&exp>0){
            if(exp>0&&exp<2)
                bonus=7000;
            else if(exp>2&&exp<5)
                    bonus=12000;
                else
                    bonus=15000;
        }
        if(des.equals("Consultant")&&exp>0){
            if(exp>0&&exp<2)
                bonus=10000;
            else if(exp>2&&exp<5)
                    bonus=15000;
                else
                    bonus=20000;
        }
        System.out.println(des+" with experience "+exp+" will get Rs."+bonus+"/-  as bonus.");
    }
    
    public static void main(String [] str){
        BonusCal bcal=new BonusCal();
        bcal.Bonus(3,"Analyst");
        bcal.Bonus(5,"Associate");
        bcal.Bonus(4,"Consultant");
        bcal.Bonus(9,"Consultant");
    
    }
}