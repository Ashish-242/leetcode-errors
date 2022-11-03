class SnapshotArray {
      HashMap<Integer,Integer>[] snapshot;
      int currentsnap;
    
    public SnapshotArray(int length) {
        snapshot=new HashMap[length];
        currentsnap=0;
        for(int i=0;i<length;i++){
            snapshot[i]=new HashMap<Integer,Integer>();
        }
        
    }
    
    public void set(int index, int val) {
        snapshot[index].put(currentsnap,val);
    }
    
    public int snap() {
         currentsnap++;
        return currentsnap-1;
        
    }
    
    public int get(int index, int snap_id) {
        for(int sn=snap_id;sn>=0;sn--){
            if(snapshot[index].containsKey(sn)){
                return snapshot[index].get(sn);
            }
        }
        return 0;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */