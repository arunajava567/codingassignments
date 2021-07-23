package test.set2021;
class Operator {
	String name;
	String ssn;
	String dept;
	int  salary;
	public Operator() {}
	public Operator(String name, String ssn, String dept, int salary) {
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Operator [name=" + name + ", ssn=" + ssn + ", dept=" + dept + ", salary=" + salary + "]";
	}
}
class OperatorImplementation {
	public Operator getOperatorInfo(String info){
		String name=info.substring(0,info.indexOf('@'));
	    String ssn=info.substring(info.indexOf('@')+1 ,info.indexOf('-'));
	    String dept=info.substring(info.indexOf('-')+1 ,info.indexOf('#'));
	    int salary=Integer.parseInt(info.substring(info.indexOf('#')+1));
		Operator o=new Operator(name,ssn,dept,salary);
		return o;
	}
	
	
	public String getOperatorLevel(Operator o){
		String ssn=o.ssn;
		String level=null;
	String newssn=ssn.substring(ssn.length()-3, ssn.length());
		int newssn1=Integer.parseInt(newssn);
		if(newssn1>=50 && newssn1<=100)
			level="L1";
		else if(newssn1>=101 && newssn1<=150)
			level="L2";
		else if(newssn1>=151 && newssn1<=200)
			level="L3";
		else if(newssn1>=201 && newssn1<=250)
			level="L4";
		else
			level="NA";
		return level;
	}
}
public class Source {
	public static void main(String[] args) {
		String s="David@1PC16C061-SDE#8";
		OperatorImplementation om=new OperatorImplementation();
		Operator o=om.getOperatorInfo(s);
		System.out.println(o);
		System.out.println(om.getOperatorLevel(o));
	}
}

