public class string {
    public static void main(String[] args) {
        String a = "Sarthak";             
        String b = new String("Sarthak"); 
    
        char charct[] = {'S','A','I'};  
        String str = new String(charct);      
        
        System.out.println("using literal = " +a);
        System.out.println("using new keyword = " +b);
        System.out.println("using array = " +str);
    }
}