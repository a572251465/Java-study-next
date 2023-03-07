package plus.chendd.DI;

import java.util.List;
import java.util.Map;

public class Animal {
    List<String> list;
    Map<String, String> map;

    public Animal() {
    }

    public Animal(List<String> list, Map<String, String> map) {
        this.list = list;
        this.map = map;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "list=" + list +
                ", map=" + map +
                '}';
    }
}
