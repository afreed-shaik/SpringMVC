package SpringDemo.SpringDemo.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example {
	
	private int id;
	private String name;
	private List<String> skillset;
	private Map<String, String> projects;
	private Set<Long> phone_nos;
		
	public Example() {
		super();
	}

	public Example(int id, String name, List<String> skillset, Map<String, String> projects, Set<Long> phone_nos) {
		super();
		this.id = id;
		this.name = name;
		this.skillset = skillset;
		this.projects = projects;
		this.phone_nos = phone_nos;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(List<String> skillset) {
		this.skillset = skillset;
	}
	public Map<String, String> getProjects() {
		return projects;
	}
	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}
	public Set<Long> getPhone_nos() {
		return phone_nos;
	}
	public void setPhone_nos(Set<Long> phone_nos) {
		this.phone_nos = phone_nos;
	}

	@Override
	public String toString() {
		return "Example [id=" + id + ", name=" + name + ", skillset=" + skillset + ", projects=" + projects
				+ ", phone_nos=" + phone_nos + "]";
	}
	
	
	
	
	

}


