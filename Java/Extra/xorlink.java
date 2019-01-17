import java.util.*;
public class xorlink
{
    class node
    {
        int n;
        node link;
        node(int x)
        {
            n = x;
            link = 0;
        }
    }
    node root;
    node insert(node x)
    {
        if(root == null)
        {
            root = x;
        }
        else
        {
            
        }
        return root;
    }
    node delete(int x)
    {
        return node;
    }
    void search(int x)
    {

    }
    void traverse()
    {

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        xorlink xl = new xorlink();
        System.out.println("1.Insert 2.Delete 3.Search 4.Traverse");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Element to be inserted");
                node r = new node(sc.nextInt());
                start = xl.insert(r);
                break;
            case 2:
                System.out.println("Element to be deleted");
                start = xl.delete(sc.nextInt());
                break;
            case 3:
                System.out.println("Element to be search");
                xl.search(sc.nextInt());
                break;
            case 4:
                xl.traverse();
                break;
            default :
                exit(0);
        } 
    }
}