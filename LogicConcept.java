public class LogicConcept {
    public static void main(String args[]){
        int a=5,b=4,c=3;
        System.out.print("First condition:");
        System.out.println( a++ + b * ++c);
        
        System.out.println("second condition:");
        System.out.println("a = " + a + " b= " + b + " c = " + c);

        System.out.println("Third condition");
        System.out.println(b*5/a + b++ + b);

        System.out.println("Fourth condition");
        System.out.println("a = " + a + " b= " + b + " c = " + c);
    }
}
