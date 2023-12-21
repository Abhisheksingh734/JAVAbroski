package DSAjava.LL;
// https://leetcode.com/problems/merge-two-sorted-lists/

public class InterviewQstons {
    public static void main(String[] args) {


    }

    public static LinkedList mergeClass(LinkedList list1, LinkedList list2){
        LinkedList mergedList = new LinkedList();
        LinkedList tail = mergedList;

        while(list1!=null && list2!= null){

            if(list1.data < list2.data ){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }

        }
        while(list1!=null){
            tail.next = list1;
            list1 = list1.next;
            tail = tail.next;
        }
        while(list2!=null){
            tail.next = list2;
            list2 = list2.next;
            tail = tail.next;
        }

        return mergedList.next;
    }




}
