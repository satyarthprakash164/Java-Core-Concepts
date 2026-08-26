public class NullPointerExceptionQ3 {
    public static void main(String[] args){
        String myString=null;
        try{
            System.out.println("length of the string");
            int length=myString.length();
            System.out.println("Length is:"+length);
        } 
	    catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
