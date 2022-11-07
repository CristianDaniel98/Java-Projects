public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem setPrevious(ListItem listItem);
    abstract ListItem previous();
    abstract ListItem setNext(ListItem listItem);
    abstract ListItem next();

    abstract int compareTo(ListItem listItem);


}
