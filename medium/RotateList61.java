/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 
//1 2 3 (4 5) null 
//(5) 1 2 3 4 null rotate 1
//(4 5) 1 2 3 null rotate 2

// 하나씩 떼어다 붙이지 않고 rotate할 조각을 뚝 떼어내어 linkedList 맨 앞에 붙이면 끝날 것 같다.
// index 연산을 용이하게 하기 위해 dummy node를 head node 앞에 둔다.
// dummy node에 first node와 second node를 놓는다.
// Getting the total length : first node의 next가 null을 만날 때 까지 first node를 이동(리스트의 총 길이를 얻는다.) 
// Getting the i-n%i th node : second node를 linkedList에서 떼어낼 조각 list의 첫번째 node의 전 node에 둔다. ex) 12345에서 45를 떼어내려고 한다면 3에 둔다.
// rotation : 조각 list의 마지막 노드의 next에 head 레퍼런스 변수의 값을 넣는다. (맨 뒤 node와 맨 앞 node 연결)
// rotation : 조각 list의 첫번째 노드의 전 node의 next에 null을 초기화한다. (리스트의 끝을 표시 && 기존 연결을 끊음)
 
class Solution {
	 public ListNode rotateRight(ListNode head, int k) {
		    if (head==null || head.next==null) return head;
		    
        ListNode dummy=new ListNode(0);
		    dummy.next=head;
        
		    ListNode first = dummy
        ListNode second = dummy;
		 
        //Getting the total length      
		    int i;
		    for (i=0 ;first.next!=null;i++){
		        first=first.next;
        }    
		    
        //Getting the i-n%i th node
		    for (int j=i-k%i;j>0;j--){
            second=second.next;
        }	
		    
        //rotation
		    first.next=dummy.next; 
		    //dummy.next=second.next;
		    second.next=null;
		    
		    return dummy.next;
		}
}
