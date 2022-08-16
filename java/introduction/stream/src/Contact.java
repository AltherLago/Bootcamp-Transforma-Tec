import java.util.Objects;

public class Contact {

   private String name;
   private Integer number;

   public Contact(String name, Integer number){
       this.name = name;
       this.number = number;
   }

   public String getName() {
       return name;
   }

   public Integer getNumber() {
       return number;
   }

   public boolean equals(Object o){
       if(this == o) return true;
       if(o == null || getClass() != o.getClass()) return false;
       Contact contact = (Contact) o;
       return name.equals(contact.name) && number.equals(contact.number);
   }

   public int hashCode(){
       return Objects.hash(name, number);
   }

   public String toString(){
       return "\nContact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}' + "\n";
    }

}
