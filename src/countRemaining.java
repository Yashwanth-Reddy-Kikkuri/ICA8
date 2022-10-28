import java.util.ArrayList;

public class countRemaining {

    public int countRemaining(String str) {

        int i,v = 0;
        if (str.equals(null)){
            return -1;
        }

        int prevOne = -1;
        for(i=0; i<str.length(); i++){

            if(str.charAt(i) =='0' || str.charAt(i) == '1') {
                if (str.charAt(i) == '1') {
                    if (prevOne == -1) {
                        prevOne = i;
                    } else {
                        if (prevOne + 1 == i) {
                            return -1;
                        } else {
                            prevOne = i;
                        }
                    }
                }
            }
            else{
                return -1;
            }
        }

        int l = -1,p=0,q=0;

        char[] ca = str.toCharArray();

        for(i=0;i<ca.length; i++){
            if(ca[i] == '0') {
                if (i == 0 || ca[i - 1] == '0') {
                    p = 1;
                } else {
                    p = 0;
                }

                if (i == ca.length - 1 || ca[i + 1] == '0') {
                    q = 1;
                } else {
                    q = 0;
                }
                if(p==1 && q==1){
                    v++;
                    ca[i] = '1';
                }
            }

        }

        return v;


    }
}
