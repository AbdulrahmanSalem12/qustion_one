package JavaTpoint.JavaObjectToJSON;  
//Creating Employee class  
class EmpDetails {  
    //Creating properties of Employee class  
int  salary;
int experience;
String name, position, educationlevel, contract;  
  
//Getter and setters for getting and setting properties  

public int getSalary() {  
    return salary;  
}  
public void setSalary(int salary) {  
    this.salary = salary;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getPosition(){
    return position;
}
public void setPosition(String position) {
    this.position = position;
}
public int getExperience(){
    return experience;
}
public void setExperience(int experience){
    this.experience = experience;
}
public String getEducationlevel(){
    return educationlevel;
}
    public void setEducationlevel(String educationlevel){
        this.educationlevel = educationlevel;
}
    public String getContract(){
        return contract;
    }
    public void setContract(String contract){
        this.contract = contract;
    }
  
//Overriding toString() method  
@Override  
public String toString() {  
    return "Employee [ Name = "+ name +", position = " + position +" salary = " + salary +
            ", experience = " + experience +
             ", educationlevel = " + educationlevel +" contract = " + contract +"]";  
    }  
      
}  
//Creating main class  
public class Employee{  
    //main() method start  
    public static void main(String args[]) {  
          
        //Creating object of EmployeeDetails class  
        EmpDetails emp = new EmpDetails(); 
        
        //Setting values to the properties  
         
        emp.setName("Abdulrahman Salem");  
        emp.setPosition("Project specialist");  
        emp.setSalary(14000);  
        emp.setExperience(2);  
        emp.setEducationlevel("Bachelor");
        emp.setContract("Part time");
          
        //Showing Employee details  
        System.out.println(emp);  
          
        //Getting salary using getter  
        int sal = emp.getSalary();  
        int increment = 0;  
        //Getting education level using getter
        String edu = emp.getEducationlevel();
        //Getting contract using getter
        String con = emp.getContract();
        //Incrementing salary based on education level  
        if ((edu == "Bachelor") && (con == "Full time")){ 
        
            //incrementing salary 500 and 3% 
            increment += (sal + 500 );  
            sal += (sal*3)/100+500;  
              
            emp.setSalary(sal);  
            System.out.println("\n educational level is Bachelor Degree 500 added to salary and 3% for full time \n");  
            System.out.println(emp);  
            
        }
        else if((edu == "Bachelor") && (con == "Part time")){ 
        
            //incrementing salary 500  and 1.3%
            increment += (sal + 500 );  
            sal += (sal*1.3)/100+500;  
              
            emp.setSalary(sal);  
            System.out.println("\n educational level is Bachelor Degree 500 added to salary and 1.3% for part time \n");  
            System.out.println(emp);
        }
        else if ((edu =="Diploma") && (con == "Full time")){  
            //incrementing salary 250 and 3%
            increment = (sal + 250);  
            sal += (sal*3)/100+250;  
              
            emp.setSalary(sal);  
            System.out.println("\n educational level is Diploma Degree 250 added to salary and 3% for full time\n");  
            System.out.println(emp);  
        }
        else if ((edu =="Diploma") && (con == "Part time")){  
            //incrementing salary 250 and 1.3%
            increment = (sal + 250);  
            sal += (sal*1.3)/100+250;  
              
            emp.setSalary(sal);  
            System.out.println("\n educational level is Diploma Degree 250 added to salary and 1.3% for part time\n");  
            System.out.println(emp);  
        }
        else {  
            System.out.println("\n Salary is not incremented \n");  
            System.out.println(emp);  
        }         
    }  
}  
