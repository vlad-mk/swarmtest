package xxx.inc.app;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Something {
    int id;
    String name;

    public Something() {
    }

    public Something(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
