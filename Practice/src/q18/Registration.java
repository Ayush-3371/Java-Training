package q18;

public class Registration {
		private String name;
		private int age;
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
		public void setAge(int age) throws UnderAgeException {
			if(age < 18) {
				throw new UnderAgeException("The age should be 18 or above");
			}
			
			else this.age = age;
		}
		
		public int getAge() {
			return this.age;
		}
}
