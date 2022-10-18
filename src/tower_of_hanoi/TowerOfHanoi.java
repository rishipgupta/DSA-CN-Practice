package tower_of_hanoi;

public class TowerOfHanoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Write your code here
        if (disks == 0) { //base case
            return;
        }

        //recursion call to shift n-1 disks from source to auxiliary
        towerOfHanoi(disks - 1, source, destination, auxiliary);
        System.out.println(source + " " + destination);
        //recursion call to shift n-1 disks from auxiliary to destination
        towerOfHanoi(disks - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,'a','b','c');
    }
}
