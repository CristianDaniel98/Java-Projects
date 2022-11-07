public class MyLinkedList implements NodeList{
    protected ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem listItem){
        return false;
    }

    @Override
    public void traverse(ListItem listItem){

    }
}
