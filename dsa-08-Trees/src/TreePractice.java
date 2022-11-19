public class TreePractice {

    TNode root;

    public TreePractice(){
    }

    void add(int data){
        TNode newNode = new TNode(data);
        if (root==null){
            root=newNode;
            return;
        }
        TNode current = root;
        while (true){

            if (data<=current.value){

                if (current.leftChild==null){
                    current.leftChild=newNode;
                    break;
                }
                current=current.leftChild;

            }else {

                if (current.rightChild==null){
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;

            }

        }


    }




}
