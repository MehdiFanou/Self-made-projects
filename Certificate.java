 /**
 * @author: Mehdi Fanou
 * 
 * 
 **/

class Assessor 
{
private String name, id;

public Assessor(String name, String id){
this.name=name;
this.id=id;
}
public String getName(){return this.name;}
public String getId(){return this.id;}
public void verifyCertificate (CertificationTest test, CertificationCriteria criteria){
if(test.getTestScore()<criteria.getPassingScore()){

System.out.println("Not eligible for certification.");}
else{
System.out.println("\n*******Certificate of Completion******");
System.out.println("\nCertification name:" +criteria.getTestName());
System.out.println("\nRecipient's name:" +test.getName());
System.out.println("Recipient's email:" +test.getEmail());
System.out.println("\nAssessor's name:" +this.name);
System.out.println("Assessor's id:" +this.id);}
}
}
class CertificationTest{

private String name,email;
private int testScore;

public CertificationTest(String name, String email, int testScore){
this.name=name;
this.email=email;
this.testScore=testScore;
}
public String getName(){return this.name;}
public String getEmail(){return this.email;}
public int getTestScore(){return this.testScore;}
}
class CertificationCriteria{

private String testName;
private int passingScore;

public CertificationCriteria(String testName, int passingScore){
this.testName=testName;
this.passingScore=passingScore;
}
public String getTestName(){return this.testName;}
public int getPassingScore(){return this.passingScore;}
}
public class Certificate{

public static void main(String[]args){

Assessor assessor=new Assessor("Mehdi Fanou","A105");
CertificationTest test= new CertificationTest("Alex Brent","alexb@tmail.com",81);
CertificationCriteria criteria= new CertificationCriteria("Data Structures and Algorithms",40);

assessor.verifyCertificate(test,criteria);
}
}