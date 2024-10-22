public class string {
    //string concatnation

    //using concat()
    public static void main(String[] args) {
        String a = "Sarthak";
        String b = "Gadakh";
        System.out.println(a.concat(b));

        //using +
        String c = "Sarthak " + "Gadakh";
        String d = 90+9 + "Sarthak" + 90+80;
        System.out.println(d);

        //using join
        String e = "Sarthak";
        String f = "Gadakh";
        String g = String.join("",e, " " ,f);
        System.out.println(g);


        //string empty()
        String h = "Sarthak";
        String i = "";
        System.out.println(h.isEmpty());
        System.out.println(i.isEmpty());

        //lenth
        String j = "Sarthak";
        System.out.println(j.length());

        //substring
        String k = "sarthak";
        System.out.println(k.substring(1,6));
        System.out.println(k.substring(4));

        //equles
        String l = "sarthak";
        String m = "gadakh";
        String n = "sarthak";
        String o = "chetan";
        System.out.println(l.equals(n));
        System.out.println(m.equals(o));

        //convert lower case
        String p = "SARTHAK";
        System.out.println(p.toLowerCase());


        //convert upper case
        String q = "sarthak";
        System.out.println(p.toUpperCase());



        // memory allocation in string

        // stack                Heap                      

        // for execution        Str                     Strint Str = "Sarthak";
        //                                              Strint Str1 = "Sarthak";
                                                                    

    }
}
