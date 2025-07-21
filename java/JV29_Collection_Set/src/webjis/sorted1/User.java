package webjis.sorted1;

public class User implements Comparable<User> {
	private String userId;
	private int age;
	
	public User(String userId, int age) {
		
		this.userId = userId;
		this.age = age;
		
	}

	public String getUserId() {
		return userId;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", age=" + age + "]";
	}

	@Override
	public int compareTo(User o) {
		// age로 비교해서 정렬 (오름차순 정렬)


//		Integer a1 = age;
//		Integer a2 = o.age;
//		return a1.compareTo(a2);

		return this.age < o.age ? -1 : (this.age == o.age) ? 0 : 1;	
		
		
	}
	
	
}
