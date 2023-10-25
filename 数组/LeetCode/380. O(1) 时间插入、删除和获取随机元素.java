class RandomizedSet {
    // 用hash即可
    HashMap map=new HashMap();

    Random random = new Random();
    public  RandomizedSet() {

    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        else{
            map.put(val,0);
            return true;
        }
    }

    public boolean remove(int val) {
        if(map.containsKey(val)){
            map.remove(val);
            return true;
        }
        else{
            return false;
        }
    }

    public int getRandom() {
        Object[] objects = map.keySet().toArray();
        return (int)objects[random.nextInt(objects.length)];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */