import java.util.ArrayList;
import java.util.List;

public class testing {

   public static void main(String[] args) throws IntegerSetException {
List<Integer> set1= new ArrayList<>();
set1.add(2);
set1.add(4);
set1.add(6);
set1.add(8);
set1.add(1);
set1.add(2);
set1.add(3);

List<Integer> set2= new ArrayList<>();
set2.add(4);
set2.add(5);
set2.add(6);
set2.add(7);
set2.add(8);
set2.add(9);
set2.add(1);

List<Integer> set3= new ArrayList<>();
set3.add(2);
set3.add(3);
set3.add(4);
set3.add(5);
set3.add(6);
set3.add(7);
set3.add(8);

System.out.println("Set 1: "+set1.toString());
System.out.println("Set 3: "+set3.toString());
System.out.println("Set 2: "+set2.toString());



System.out.println("Set 2 contains the number 6: "+set2.contains(6));
System.out.println("\nSet 1 length: "+set1.size());
System.out.println("Set 1 contains the number 6: "+set1.contains(6));
System.out.println("Set 1 equals Set 2: "+set1.equals(set2));
set3.remove(2);
System.out.println("\nSet 3 remove index 5: "+set3.toString());
System.out.println("Clear Set 2");
set2.clear();
System.out.println("Set 2 empty: "+set2.isEmpty());

IntegerSet intSet1= new IntegerSet(set1);
IntegerSet intSet2= new IntegerSet(set2);

System.out.println("\nThe argest number in Set 1: "+intSet1.largest());
System.out.println("The smallest number in Set 2: "+intSet2.smallest());

IntegerSet setUnion= intSet1.union(intSet2);
System.out.println("\nUnion: "+ setUnion.toString());
IntegerSet setInter= intSet1.intersect(intSet2);
System.out.println("Intersection: "+setInter.toString() );
IntegerSet setDiff= intSet1.diff(intSet2);
System.out.println("Difference: "+setDiff.toString() );
   }
}
