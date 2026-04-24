class LRUCache {
    private LinkedList<Integer> dll; // store keys in ordder
    private Map<Integer, Integer> cache; // key -> [listIndex, value]
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.dll = new LinkedList<>();
        this.cache = new HashMap<>();
    }

    private void makeMostRecentlyUsed(int key) {
        dll.remove((Integer) key); // remove by value not index
        dll.addFirst(key);
    }

    public int get(int key) {
        if (!cache.containsKey(key)) // FIX 1: containsKey(), not contains()
            return -1;
        makeMostRecentlyUsed(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.put(key, value);
            makeMostRecentlyUsed(key);
        } else {
            dll.addFirst(key);
            cache.put(key, value);
            capacity--;
        }

        if (capacity < 0) {
            int lruKey = dll.removeLast();
            cache.remove(lruKey);
            capacity++;
        }
    }
}
