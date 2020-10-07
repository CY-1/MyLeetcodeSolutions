class RandomizedCollection {

        HashMap<Integer, LinkedList<Integer>> a;
        ArrayList<Integer> b;
        /** Initialize your data structure here. */
        public RandomizedCollection() {
            this.a=new HashMap<>();
            this.b=new ArrayList<>();
        }

        /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
        public boolean insert(int val) {
            this.b.add(val);
            if(this.a.containsKey(val)){
                this.a.get(val).add(this.b.size()-1);
            }
            else{
                LinkedList<Integer> b=new LinkedList();
                b.add(this.b.size()-1);
                this.a.put(val,b);
            }
            return true;
        }

        /** Removes a value from the collection. Returns true if the collection contained the specified element. */
        public boolean remove(int val) {

            if(this.a.containsKey(val)&&this.a.get(val).size()>0){
                LinkedList<Integer> c = this.a.get(val);

                int last = c.get(c.size()-1);
                int value = this.b.get(this.b.size() - 1);
                if(value==val){
                    LinkedList<Integer> cc = this.a.get(value);
                    cc.remove(cc.size()-1);
                    this.b.remove(this.b.size()-1);
                    Collections.sort(cc);
                    return true;
                }
                this.b.set(last,value);
                this.b.remove(this.b.size()-1);
                LinkedList<Integer> cc = this.a.get(value);
                cc.remove(cc.size()-1);
                cc.addFirst(last);
                c.remove(c.size()-1);
                Collections.sort(cc);
                return true;
            }else{
                return false;
            }

        }

        /** Get a random element from the collection. */
        public int getRandom() {
            return this.b.get((int) (Math.random()*(this.b.size()-0)+0));
        }
    }
