package org.jsq.antlr;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Variables implements Map<String, Variable> {

    private Map<String, Variable> variableMap = new HashMap<>();

    public boolean add(Variable variable) {
        if(variableMap.containsKey(variable.id())) {
            return false;
        } else {
            variableMap.put(variable.id(), variable);
            return true;
        }
    }

    public boolean update(String key, Variable variable) {
        if(key==null || !key.equals(variable.id())) {
            return false;
        } else {
            variableMap.put(key, variable);
            return true;
        }
    }

    public Object getValue(String key) {
        return variableMap.get(key).getValue();
    }

    @Override
    public int size() {
        return variableMap.size();
    }

    @Override
    public boolean isEmpty() {
        return variableMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return variableMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return variableMap.containsValue(value);
    }

    @Override
    public Variable get(Object key) {
        return variableMap.get(key);
    }

    @Override
    public Variable put(String key, Variable value) {
        return variableMap.put(key, value);
    }

    @Override
    public Variable remove(Object key) {
        return variableMap.remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ? extends Variable> m) {
        variableMap.putAll(m);
    }

    @Override
    public void clear() {
        variableMap.clear();
    }

    @Override
    public Set<String> keySet() {
        return variableMap.keySet();
    }

    @Override
    public Collection<Variable> values() {
        return variableMap.values();
    }

    @Override
    public Set<Entry<String, Variable>> entrySet() {
        return variableMap.entrySet();
    }
}
