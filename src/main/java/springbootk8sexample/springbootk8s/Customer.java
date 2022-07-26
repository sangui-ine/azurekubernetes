package springbootk8sexample.springbootk8s;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data

public class Customer {
	@Id
	@GeneratedValue
	    private int id;
		private String name;
		private int age;
		private String gender;
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Customer(int id, String name, int age, String gender) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		@Override
		public int hashCode() {
			return Objects.hash(age, gender, id, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			return age == other.age && Objects.equals(gender, other.gender) && id == other.id
					&& Objects.equals(name, other.name);
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
		
		

}
