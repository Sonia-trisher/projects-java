public class Pair <k,v>{
    private k key;
    private v value;

    public static <k,v>  Pair <k,v> create(k key, v value){
        return new Pair<>(key,value);
    }

    public Pair(k key, v value) {
        if(key == null){
            throw new NullPointerException("key cannot be null");
        }
        this.key = key;
        this.value = value;
    }

    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
