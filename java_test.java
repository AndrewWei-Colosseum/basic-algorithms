public class java_test {
    public static void main(String[] args) {
        person[] one = new person[3];
        one[0] = new person("Andy", 19);
        one[1] = new person("bill", 30);
        one[2] = new person("fdsf", 32);
        for(int i = 0; i < one.length; i++) {
            System.out.println(one[i].getInfo());
        }
        // String()
        char[] arr = {'1','1','2','5','7','a'};
        String s = new String(arr,1,2);
        System.out.println(s);
        // charAt()
        char a = s.charAt(1);
        System.out.println(a);
        // toCharArray()
        String str = "helloworld";
        char[] arr1 = str.toCharArray();
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] -= 32;
            System.out.print(arr1[i] + ",");
        }
        System.out.println();
        System.out.println(new String(arr1));
        // isNumber()
        String str1 = "123456";
        System.out.println(isNumber(str1) ? "fully composite of number" : "not fully composite of number");

        // convert the string into byte array
        String str2 = "dfvsdg";
        byte[] data = str2.getBytes();
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println();
        
        // compareTo() "==" return 0, "<" return <0, ">" return >0
        System.out.println("A".compareTo("a"));

        // indexOf(), return the first location of searching result.  
        // contains()
        String str3 = "Helloworld";
        System.out.println(str3.indexOf("world"));

        // replace()
        String str4 = "helloworld";
        System.out.println(str4.replaceAll("l", "_"));
        System.out.println(str4.replaceFirst("l", "_"));

        // split()
        String str5 = "hello world hello midn";
        String[] result = str5.split(" ");
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        // subString()
        
        // intern()
        String str6 = "hello";
        String str7 = new String("hello");
        System.out.println(str6==str7.intern());
    }

    public static boolean isNumber(String str) {
        char[] arr2 = str.toCharArray();
        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i] < '0' || arr2[i] > '9') {
                return false;
            }
        }
        return true;
        }

    
    

}
class person {
    private String name;
    private int age;

    public person(String na, int ag) {
        name = na;
        age = ag;
    }
    public String getInfo() {
        return "name: " + name + "age: " + age; 
    }
}

