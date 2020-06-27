public class SymmetricalNumber {
    public static void main(String[] args) {
        
    
    String number = "9239";
    boolean isSymmetric = true;

    for (int i=0;i<number.length()&&isSymmetric==true;i++) {
        
        isSymmetric = (number.charAt(i)==number.charAt(number.length()-1-i)) ? true : false;

        System.out.println (number.charAt(i) + " " + number.charAt(number.length()-1-i) + " ---> " + isSymmetric);
    }
   System.out.println(isSymmetric); 
}
}