package com.practice.q3;

import java.util.LinkedList;
import java.util.Scanner;

public class CourseApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Course> list = new LinkedList<>();
		while (true) {
			System.out.println("1 Add 2 Remove 3 Update Fees 4 Change Status 5 Display 6 Exit");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("1 Online 2 Offline");
				int type = sc.nextInt();

				System.out.println("Enter id name duration fees status");
				int id = sc.nextInt();
				String name = sc.next();
				int duration = sc.nextInt();
				double fees = sc.nextDouble();
				String status = sc.next();

				if (type == 1) {
					System.out.println("Enter platform and instructor");
					String p = sc.next();
					String i = sc.next();

					list.add(new OnlineCourse(id, name, duration, fees, status, p, i));
				} else {
					System.out.println("Enter classroomNumber and location");
					int c = sc.nextInt();
					String loc = sc.next();

					list.add(new OfflineCourse(id, name, duration, fees, status, c, loc));
				}
				break;

			case 2:
				int rid = sc.nextInt();
				list.removeIf(c -> c.courseId == rid);
				break;

			case 3:
				int uid = sc.nextInt();
				double nf = sc.nextDouble();

				for (Course c : list) {
					if (c.courseId == uid) {
						c.fees = nf;
					}
				}
				break;

			case 4:
				int sid = sc.nextInt();

				for (Course c : list) {
					if (c.courseId == sid) {
						if (c.status.equals("active"))
							c.status = "inactive";
						else
							c.status = "active";
					}
				}
				break;
			
		case 5:
		    for(Course c : list) {
		        System.out.println(c);
		    }
		    break;
		    
		case 6:
			sc.close();
			System.out.println("BYE..........");
		    System.exit(0);
		}
	}
	}
}
