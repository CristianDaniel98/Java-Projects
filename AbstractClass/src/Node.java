public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    protected ListItem next(){
        return this.rightLink;
    }

    @Override
    protected ListItem setNext(ListItem listItem){
        this.rightLink = listItem;
        return this.rightLink;
    }

    @Override
    protected ListItem previous(){
        return this.leftLink;
    }

    @Override
    protected ListItem setPrevious(ListItem listItem){
        this.leftLink = listItem;
        return listItem.leftLink;
    }

    @Override
    protected int compareTo(ListItem listItem){
        if(listItem != null) {
            return ((String) super.getValue()).compareTo((String) listItem.getValue());
        } else {
            return -1;
        }
    }
}
