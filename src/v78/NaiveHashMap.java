package v78;

import java.util.LinkedList;
import java.util.Map;

public class NaiveHashMap<K, V> {

    private LinkedList<Node<K, V>>[] buckets = new LinkedList[8];

    public V put(K key, V value) {
        int index = key == null ? 0 : key.hashCode() % buckets.length;

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        LinkedList<Node<K, V>> bucket = buckets[index];
        Node<K, V> foundNode = null;
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).getKey().equals(key)) {
                foundNode = bucket.get(i);
                break;
            }
        }

        V oldValue;
        if (foundNode == null) {
            bucket.add(new Node<>(key, value));
            oldValue = null;
        } else {
            oldValue = foundNode.setValue(value);
        }
        return oldValue;
    }

    public V get(Object key) {
        int index = key == null ? 0 : key.hashCode() % buckets.length;
        if (buckets[index] == null) {
            return null;
        }
        LinkedList<Node<K, V>> bucket = buckets[index];
        Node<K, V> foundNode = null;
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).getKey().equals(key)) {
                foundNode = bucket.get(i);
                break;
            }
        }
        if (foundNode != null) {
            return foundNode.getValue();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        boolean first = true;
        for (int i = 0; i < buckets.length; i++) {
            LinkedList<Node<K, V>> bucket = buckets[i];
            if (bucket != null) {
                for (int j = 0; j < bucket.size(); j++) {
                    if (!first) {
                        builder.append(", ");
                    } else {
                        first = false;
                    }
                    builder.append(bucket.get(j));
                }
            }
        }
        return builder.append("}").toString();
    }

    private static class Node<K, V> implements Map.Entry<K, V> {

        private final K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

}
