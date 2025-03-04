public class substr {
    public static void main(String[] args) {
        String st =new String("v venuma mangu!");
        String naa = st.substring(7, 12); 
        System.out.println(" String: " + naa);

        StringBuilder sb = new StringBuilder("enada pakura venga");
        String nooo = sb.substring(3, 16);
        System.out.println(" StringBuilder: " + nooo);

        StringBuffer sbf = new StringBuffer("navf pallu vv");
        String lahh = sbf.substring(0, 12); 
        System.out.println(" StringBuffer: " + lahh);
    }
}
