package player;
public class Player {
     public String name;
     private String contact;
     private String email;
     private String collegeName;
     private int age;
     public int pos;
     public Player(){
        this.pos=0;
     }
     public void setName(String name){
        this.name=name;
     }
     public void setEmail(String email){
        this.email=email;
     }
     public boolean setContact(String contact){
        if(contact.length()==10){
            this.contact=contact;
          return true;
        }
          else
          return false;
     }
     public boolean setAge(int age){
        if(age<=0)
        {
            return false;
        }
        else{
            this.age=age;
            return true;
        }
     }
     public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
     }
     public void getPlayer(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("CollegeName: "+collegeName);
        System.out.println("Email-ID: "+email);
        System.out.println("Contact: "+contact);

   }

}
