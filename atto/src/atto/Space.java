package atto;

import java.util.HashMap;
import java.util.Map;

public class Space {
    String name;
    Map<String, Object> members = new HashMap<String, Object>();

    public Space(String name) {
        Assert.notNull(name);
        this.name = name;
    }

    public Object get(String id) {
        Assert.notNull(id);
        return members.get(id);
    }

    public void put(String id, Object value) {
        Assert.notNull(id);
        members.put(id, value);
    }

    @Override
    public String toString() {
        return name + ":" + members;
    }
}
