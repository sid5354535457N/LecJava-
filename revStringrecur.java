public class revStringrecur {
    public static void rmv(String str,int idx,StringBuilder sb,boolean map[]) {
        if(str.length()==idx) {
            System.out.println(sb);
            return;
        }
        char curr=str.charAt(idx);
        if(map[curr-'a']==true) {
            rmv(str, idx+1, sb, map);
        }
        else {
            map[curr-'a']=true;
            rmv(str, idx+1, sb.append(curr), map);
        }
    }
    public static void main(String[] args) {
        rmv("siddhant", 0, new StringBuilder(), new boolean[26]);
    }
    
}
