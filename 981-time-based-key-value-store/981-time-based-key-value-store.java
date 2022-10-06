class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;
    
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new TreeMap<Integer,String>());
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
       TreeMap<Integer,String> s=map.get(key);
       Integer f= s.floorKey(timestamp);
        if(f==null) return "";
       return s.get(f);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */