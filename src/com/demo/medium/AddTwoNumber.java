package com.demo.medium;

import com.demo.model.ListNode;

public class AddTwoNumber {
	
	public static void main(String[] args) {
		
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);

        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);

        ListNode node3 = addTwoNumbers(node1, node2);
        
        System.out.println(node3.val);
        System.out.println(node3.next.val);
        System.out.println(node3.next.next.val);
        
        if(node3.next.next.next!=null) {
        	System.out.println(node3.next.next.next.val);
        }
  

    }

    public static ListNode addTwoNumbers(ListNode node1, ListNode node2) {
    	
    	ListNode node3 = new ListNode(0);
    	
    	node3 = foreach(node1, node2, node3);
    	
        return node3;
    }
    
    public static ListNode foreach(ListNode node1,ListNode node2,ListNode node3) {
    	node3.next = new ListNode(0);
    	if(node1!=null && node2!=null) {
    		int sum = node1.val + node2.val; 
    		if(sum >= 10) {
    			node3.val = sum-10;
    			node3.next.val++;
    		} else {
    			node3.val = sum;
    		}
    		
    		foreach(node1.next, node2.next, node3.next);
    	} else if(node1!=null && node2==null) {
    		int sum = node1.val;
    		if(sum >= 10) {
    			node3.val = sum -10;
    		} else {
    			node3.val = node1.val;
    		}
    		foreach(node1.next, null, node3.next);
    	} else if(node1==null && node2!=null) {
    		int sum = node2.val;
    		if(sum >= 10) {
    			node3.val = sum -10;
    		} else {
    			node3.val = node2.val;
    		}
    		foreach(null, node2.next, node3.next);
    	} else {
    		int sum = node3.val++;
    		
    		if(sum >= 10) {
    			node3.val = sum-10;
    		} else {
    			node3.val = sum;
    		}
    	}
    	
    	
    	return node3;
    	
    }
    
    
}
