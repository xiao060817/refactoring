package theater;

/**
 * Represents a play with a name and type.
 *
 * <p>This class does not accept null values for name or type.</p>
 *
 * @null No fields in this class may be null.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
