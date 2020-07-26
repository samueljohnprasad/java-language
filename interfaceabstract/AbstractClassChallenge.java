package interfaceabstract;

public class AbstractClassChallenge {
    public static void main(String aa[]){


    }
    
}
abstract class ListItem{
    protected ListItem rightLink;
    protected ListItem leftLink;

    protected Object value;

    public ListItem(Object value){
        this.value=value;

    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPreviou(ListItem item);

    abstract int compareIn(ListItem item);

    public Object getValue(){
        return this.value;
    }
    public void setValue(Object value){
        this.value=value;
    }
    


}

interface NodeList{
    ListItem getRoot();
    boolean addItem(ListItem items);
    boolean moveItem(ListItem items);
    void tranverse(ListItem root);
}

class MyLinkedList implements NodeList{
    private ListItem root =null;

    public MyLinkedList(ListItem root){
        this.root=root;
    }

    @Override
    public ListItem getRoot() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean addItem(ListItem items) {
       
        return false;
    }

    @Override
    public boolean moveItem(ListItem items) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void tranverse(ListItem root) {
        // TODO Auto-generated method stub

    }

}