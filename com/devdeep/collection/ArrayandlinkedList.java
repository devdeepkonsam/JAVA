package com.devdeep.collection;
//Collection is a interface that extends iterable
import java.util.List;
//List is also a interface that extends collection

import java.util.ArrayList;
//ArrayList extends AbstractList implements List
/* Its a dynamic array as its internal implemenation
 * Its better in get and set operations
*/

import java.util.LinkedList;
//LinkedList extends AbstractSequentialList implements List
/* Its uses doubly linked list as its internal implementation
 * Its is better in adding and removing operations
 */

public class ArrayandlinkedList{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);
    }
}
