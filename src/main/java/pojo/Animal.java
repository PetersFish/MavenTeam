package pojo;

public abstract class Animal {
	private String id;
	private String name;
	private Integer age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	//以下三个为抽象方法，供实体类重写使用
	public abstract void eat();

	public abstract void sleep();

	public abstract void makesound();
}
