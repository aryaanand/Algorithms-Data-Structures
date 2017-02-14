package problems;

import java.util.ArrayList;

public class Problem4 {

	public static void main(String[] args) {

		Meeting mt = new Meeting(1, 10);
		Meeting mt1 = new Meeting(2, 6);
		Meeting mt2 = new Meeting(3, 5);
		Meeting mt3 = new Meeting(7,9);
//		Meeting mt4 = new Meeting(9, 10);
		Meeting mNew = null;
		int newStartTime;
		int newEndTime = 0;
		boolean changed;

		ArrayList<Meeting> myList = new ArrayList<Meeting>();
		ArrayList<Meeting> newList = new ArrayList<Meeting>();
		myList.add(mt);
		myList.add(mt1);
		myList.add(mt2);
		myList.add(mt3);
//		myList.add(mt4);

		// newList = myList;

		for (int i = 0; i < myList.size(); i++) {
			// myList = newList;
			// newList.clear();
			
			for (int j = i + 1; j < myList.size(); j++) {
				changed = false;
				if (myList.get(i).startTime > myList.get(j).startTime
						|| myList.get(i).endTime >= myList.get(j).startTime) {
					
					if (myList.get(i).startTime > myList.get(j).startTime)
						newStartTime = myList.get(j).startTime;
					else
						newStartTime = myList.get(i).startTime;

					if (myList.get(i).endTime > myList.get(j).endTime)
						newEndTime = myList.get(i).endTime;
					else
						newEndTime = myList.get(j).endTime;
					mNew = new Meeting(newStartTime, newEndTime);
					changed = true;
				}
				if (changed) {
					myList.set(i, mNew);
					
					myList.remove(j);
					j--;
					
				}

			}

		}
		for (int i = 0; i < myList.size(); i++)
			System.out.println(myList.get(i));
	}

}
