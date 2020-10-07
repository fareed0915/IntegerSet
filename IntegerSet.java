

import java.util.*;

public class IntegerSet  {
// Hint: probably best to use an array list.  You will need to do a little research
private List<Integer> set = new ArrayList <Integer>();

public IntegerSet(List<Integer> set) {
      this.set = set;
}
// Clears the internal representation of the set
public void clear() {
set.clear();
};

// Returns the length of the set
public int length() {
return set.size();
}; // returns the length

/*
* Returns true if the 2 sets are equal, false otherwise;
* Two sets are equal if they contain all of the same values in ANY order.
*/
public boolean equals(IntegerSet b) {
ArrayList<Integer> y = (ArrayList<Integer>) b.set;
        ArrayList<Integer> x = (ArrayList<Integer>) set;
   if(x.size()!=y.size()) {
    return false;
   }  
     
   Collections.sort(x);
   Collections.sort(y);
       
   for(int i=0; i<x.size(); i++) {
    if(x.get(i)!=y.get(i)) {
    return false;
    }
   }
   return true;
};

// Returns true if the set contains the value, otherwise false
public boolean contains(int value) {
for(int i=0; i<set.size(); i++) {
if(set.get(i)==value) {
return true;
}
}
return false;
};    

// Returns the largest item in the set; Throws a IntegerSetException if the set is empty
public int largest() throws IntegerSetException {
if(set.size()==0) {
throw new IntegerSetException("set is empty");
   }
int max = set.get(0);
for(int i=0; i<set.size(); i++) {
if(set.get(i)>max) {
max = set.get(i);
}
}
return max;
};

// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
public int smallest() throws IntegerSetException{
if(set.size()==0) {
throw new IntegerSetException("set is empty");
   }
int min = set.get(0);
for(int i=0; i<set.size(); i++) {
if(set.get(i)<min) {
min = set.get(i);
}
}
return min;
}

// Adds an item to the set or does nothing it already there
  public void add(int item) {
  int present = 0;
       
        for(int i=0;i<set.size();i++) {
            if(set.get(i)==item) {
                present=1;
            }
        }
        if(present==0) {
            set.add(item);
        }
}; // adds item to s or does nothing if it is in set

// Removes an item from the set or does nothing if not there
public void remove(int item) {
for(int i=0;i<set.size();i++) {
            if(set.get(i)==item) {
                set.remove(item);
            }
        }
};

// Set union
public IntegerSet union(IntegerSet intSetb) {//public static
ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.set;
        Set<Integer> y = new HashSet<>();
        y.addAll(set);
        y.addAll(temp);      
        ArrayList<Integer> temp3= new ArrayList<>(y);
        IntegerSet temp4= new IntegerSet(temp3);
return temp4;
   
};

// Set intersection
public IntegerSet intersect(IntegerSet intSetb) {
ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.set;
   set.retainAll(temp);
   IntegerSet x= new IntegerSet(set);
   return x;
};

// Set difference, i.e., s1 –s2
public IntegerSet diff(IntegerSet intSetb) { // set difference, i.e. s1 - s2
ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.set;
set.removeAll(temp);
IntegerSet x= new IntegerSet(set);
   return x;
}
// Returns true if the set is empty, false otherwise
boolean isEmpty() {
if(set.size()==0) {
return true;
}
return false;
}

// Return String representation of your set
public String toString() {
String strSet = "[";
for(int i=0;i<set.size();i++) {
if(i==(set.size()-1)) {
String x = String.valueOf(i);
strSet += x;
}
else {
String x = String.valueOf(i) +", ";
strSet += x;
}
}
strSet += "]";
return strSet;
}; // return String representation of your set
}

