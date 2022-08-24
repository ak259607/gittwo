package org.company;


public class CampanyInfo {
public void companyName(String name,String Add,char doorno) {
	// TODO Auto-generated method stub
System.out.println("CompanyInfo is:"+'\n'+name+'\t'+doorno+'\t'+Add);

}
public static void main(String[] args) {
	CampanyInfo c = new CampanyInfo();
	c.companyName("AK Solutions", "OMR Road", '2');
}
}
