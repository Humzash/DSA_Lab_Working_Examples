/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dsu13
 */
public class Element {
    static int findElement(int arr[], int n, int key)
    {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        return -1;
}
    public static void main(String[] args){
        int arr[] = {12,34,10,6,40};
        int n = arr.length;
        
        int key = 40;
        
         int position = findElement(arr,n,key);
         
         if (position == -1)
             System.out.println("Element not found");
         else
             System.out.println("Element Found at Position: " +(position +1));
    }
}
