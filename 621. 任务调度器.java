import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0){
            return tasks.length;
        }
        int[][] a=new int[26][2];
        for(int i=0;i<tasks.length;i++){
            a[tasks[i]-65][0]++;
            a[tasks[i]-65][1]=tasks[i];
        }

        boolean flag;
        ArrayList<Character> b=new ArrayList<>();
        for(int i=0;i<tasks.length;){
            flag=true;
            Arrays.sort(a, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return (o1[0]-o2[0])*-1;
                }
            });
            for(int j=0;j<a.length;j++){
                if(check(b,(char) a[j][1],n)&&a[j][0]>0){
                    b.add((char) a[j][1]);
                    flag=false;
                    i++;
                    a[j][0]--;
                    break;
                }
                if(a[j][0]==0)
                    break;
            }
            if(flag){
                b.add(' ');
            }
        }
        return b.size();
    }
    public boolean check(ArrayList<Character> a,char z,int n){
        if(a.size()-n<=0){
            for(int i=0;i<a.size();i++){
                if(a.get(i)==z){
                    return false;
                }
            }
            return true;
        }
        for(int i=1;i<=n;i++){
            if(a.get(a.size()-i)==z){
                return false;
            }
        }
        return true;
    }
}
