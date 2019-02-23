package strings;

public class StringDemo {

    public static void main(String[] args) {

        String telcoma = "telcoma", anil = "Anil", thakur = "Thakur";

        StringBuilder sb = new StringBuilder();

        sb.append(telcoma + anil + thakur);

        System.out.println(sb);

        sb.replace(sb.indexOf("Anil"), sb.indexOf("Anil") + 4, "Anal");

        System.out.println(sb.delete(sb.indexOf("Tha"), sb.indexOf("Tha") + 3).replace(sb.indexOf("kur"), sb.indexOf("kur")+1, "K").reverse());






//        String str1 = "telcoma";
//        str1 = str1.concat("technology");
//        String str2 = str1;
//        System.out.println(str1);
//
//        System.out.println(str1.equals(str2 + "a"));
//        System.out.println(str1.compareTo(str2));
//        System.out.println(str1 == str2);
//
//        String atil = "Anil";
//        String thakur = "Thakur";
//
//        String n1 = atil + thakur;
//
//        String n2 = atil.concat(thakur);
//
//        System.out.println(n1 + "\n" + n2);
//
//        System.out.println(n2.substring(4, n2.indexOf("Tha")+3));
//
//        System.out.println(n2.startsWith("Anal"));
//        System.out.println(n2.endsWith("kur"));
//
//        System.out.println(str1.intern());
//
//        System.out.println(String.valueOf(123));
//
//        System.out.println(str1.replace("coma", "koma"));
//
//        StringBuffer str_buf = new StringBuffer("telcoma");
//
//        System.out.println(str_buf.append(123));
//
//        System.out.println(str_buf.replace(str_buf.indexOf("coma"), str_buf.indexOf("coma")+4, "koma"));
//
//        System.out.println(str_buf.insert(2, "tech").reverse());
//
//        System.out.println(str_buf.reverse().delete(2, 4));
//
//        System.out.println(str_buf.charAt(4));
//
//        System.out.println(str_buf.substring(2, 6));
//
//        System.out.println(str_buf.append(str_buf));
//
//        System.out.println(str_buf.capacity());

//
//        String str1 = "str1";
//
//        String str2 = new String("str2");
//
//        char[] carr = {'t', 'e', 'l', 'c', 'o', 'm'};
//
//        String str3 = new String(carr);
//
//        System.out.println(str3);
//
//        System.out.println(str3.chars());
//
//        System.out.println(str1);
//        System.out.println(str2);
//
//        String[] sarr = new String[1];
//
//        sarr[0] = "asdasd";
//        //sarr[1] = "11asdasd";
//
//        System.out.println(sarr[0]);
        //System.out.println(sarr[1]);
    }
}
