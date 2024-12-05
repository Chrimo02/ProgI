package BinaryTree;

public class Baum {
    Knoten root;

    public void insert(Knoten k){
        if (root == null) root = k;
        else insert(root,k);
    }
    private void insert(Knoten temp, Knoten k){
        if (k.getWort().compareTo(temp.getWort()) < 0){
            if (temp.left == null) temp.left = k;
            else insert(temp.left,k);
        }
        else {
            if (temp.right == null) temp.right = k;
            else insert(temp.right,k);
        }
    }
    public void print(){
        print(root);
    }
    private void print(Knoten temp){
        if (temp.left != null) print(temp.left);
        System.out.print(temp.getWort() + " : " + temp.getBedeutung() + "\n");
        if (temp.right != null) print(temp.right);
    }

    public String search(String wort){
        return wort + ": " + search(root, wort);
    }
    private String search(Knoten temp, String wort){
        boolean gefunden = false;
        String suchergebnis = null;
        while (!gefunden) {
            if (temp.getWort().equals(wort)) {
                suchergebnis = temp.getBedeutung();
                gefunden = true;
                continue;
            }
            if (wort.compareTo(temp.getWort()) < 0) {
                if (temp.left == null) System.out.println("Das gesuchte Wort existiert nicht!");
                else search(temp.left, wort);
            }
            if (wort.compareTo(temp.getWort()) > 0) {
                if (temp.right == null) System.out.println("Das gesuchte Wort existiert nicht!");
                else search(temp.right, wort);
            }
        }
        return suchergebnis;
    }

}
