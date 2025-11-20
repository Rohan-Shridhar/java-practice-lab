
public class String_functions {
    public static void main(String[] args){
        String str="Rohan";
        //charAt() function
        System.out.println(str.charAt(3));
        //substring(start,end)
        System.out.println(str.substring(0,3));
        //indexOf()
        System.out.println(str.indexOf('h'));
        //equals(string)
        System.out.println(str.equals("Rohan"));
        System.out.println(str.equals("Johan"));
        // toLowerCase() and toUpperCase()
        System.out.println(str.toLowerCase()+'\n'+str.toUpperCase());
        //trim()
        System.out.println("   Rohan   ".trim());
        //replace()
        System.out.println(str.replace('R','J'));
        //split(regex)
        String strn="Rohan,Naveen,Amma,Pappa";
        String[] arr=strn.split(",");
        for(String ar : arr){
        System.out.print(ar+" ");}
        //contains()
        System.out.println("\n"+str.contains("oh"));
        //startsWith() and endsWith()
        System.out.println(str.startsWith("R"));
        System.out.println(str.endsWith("n"));
        //length()
        System.out.print(str.length());
    }
}