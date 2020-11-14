class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> a=new HashMap();
        int[] result=new int[arr1.length];
        for(int i=0;i<arr2.length;i++){
            a.put(arr2[i],i);
        }
        Integer[] arr3=new Integer[arr1.length];
        for(int i=0;i<arr3.length;i++){
            arr3[i]=arr1[i];
        }
        Arrays.sort(arr3, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if(!a.containsKey(o1)&&!a.containsKey(o2))
                            return o1-o2;
                        return a.getOrDefault(o1,Integer.MAX_VALUE)-a.getOrDefault(o2,Integer.MAX_VALUE);
                        
                    }
                }


        );
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr3[i];
        }
        return arr1;
    }
}
