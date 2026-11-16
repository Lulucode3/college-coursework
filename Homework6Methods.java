public class Homework6Methods {
    public static void main(String[] args){
        int result = getMaxOf2Ints(2,5);

        int min = getMinOf2Ints(2, 5);

        int max = getMaxOf3Ints(2, 5, 6);

        String Title = getStringTitleCased("thIs iS the tiTile");



        System.out.println(result);
        System.out.println(min);
        System.out.println(max);
        System.out.println(Title);

    }
    public static int getMaxOf2Ints(int a, int b){

        int max = Math.max(a, b);

        return max;

    }
    public static int getMinOf2Ints(int a, int b){

        int min = Math.min(a, b);

        return min;

    }
    public static int getMaxOf3Ints(int a, int b, int c){

        if(a <= b && c <= b){
            return b;
        }
        else if(a >= b && a >= c){
            return a;
        }
        else{
            return c;
        }

    }
    public static int getMedianOf3Ints(int a, int b, int c){

        if((a <= b && b <= c) || (c <= b && b <= a)){
            return b;
        }
        else if((b <= a && a <= c) || (c <= a && a <= b)){
            return a;
        }
        else{
            return c;
        }

    }
    public static String getStringTitleCased(String s){

        if(s == null || s.length() == 0){
            return "";
        }

        String sMod = s.toLowerCase();


        String result = "";
        boolean capNext = true;

        for(int i = 0; i < sMod.length(); i++){
            char c = sMod.charAt(i);

            if(c == ' '){
                result += c;

                capNext = true;

            }
            else{
                if(capNext){
                    result += Character.toUpperCase(c);
                    capNext = false;
                }
                else{
                    result += c;
                }
            }


        }
        return result;
    }

}
