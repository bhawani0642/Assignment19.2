/*
 * Creating a class Student
 */
public class Student implements Comparable<Student> {
	//Creating three fields
		private String name;
		private int rollNO;
		private String department;
		public Student(String name, int rollNO, String department) {
			super();
			this.name = name;
			this.rollNO = rollNO;
			this.department = department;
		}
		//Creating getters and setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNO() {
			return rollNO;
		}
		public void setRollNO(int rollNO) {
			this.rollNO = rollNO;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		//Creating toString method
		public  String toString(){
		return "Name of student is "+ name+" :Roll number is "+rollNO+" :Department is "+department;
		
	}
		@Override
		public int compareTo(Student s) {
			if(rollNO>s.rollNO){  
		        return 1;  
		    }else if(rollNO<s.rollNO){  
		        return -1;  
		    }else{  
		    return 0;  
		    }  
		}
	}

