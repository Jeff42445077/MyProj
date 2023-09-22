import java.util.Collections;
import java.util.List;

class Solution1 {
    public List isFlip(String s) {

        //s = abcde
        //output = badce
        //s -> a,b,c,d,e
        //length.s odd
        // s remove last     //s add last at last
        //length.s even
        //i+=2
        //swap / i->i+1 scanner i+1->i#

        List ans = null;

        List sList = List.of(s.split(""));
        if (sList.size()%2 !=0){
            String a = sList.get(sList.size() - 1).toString();
            sList.remove(sList.size()-1);

            for (int i =0; i < sList.size();i+=2){
                Collections.swap(sList,i,(i+1));
            }

            sList.add(a);

            ans = sList;

        } else if (sList.size()%2 ==0){
            for (int i =0; i < sList.size();i+=2){
                Collections.swap(sList,i,(i+1));
            }

            ans = sList;
        }


        return ans;
    }
}