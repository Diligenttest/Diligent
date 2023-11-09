package genericFunctions;

import java.util.Arrays;
import java.util.List;

public class Constant {
	
	public static List<String> ONBOARDCUSTOMERHEADERS=Arrays.asList("Application ID","Customer Name","Relationship Type","Entity Type","Sub Entity Type","Risk Rating","Initiation Date","Last Modified Date","Assigned Date","File Status","Profile Status","Next Review Date");
	public static List<String> ONBOARDINGTABS=Arrays.asList("Internal Information","Entity Information","Connected Party & Screening","Due Diligence","Documentation","Risk Assessment","Profile Summary");
	public static List<String> ADDRESSFIELDS=Arrays.asList("Line 1","Line 2","Street","City","State","Country","Pincode");
	public static List<String> BUSSINESSINFORMATIONDROPDOWNS=Arrays.asList("Industry","Countries of Operation","Countries of Principal Suppliers");
	public static List<String> CONTACTINFORMATION_ADDRESSFIELDS=Arrays.asList("Line 1","Line 2","Street","Area","City","State","Country","Pincode","Contact Person Name","Contact Person Number");
	public static List<String> 	BENEFICIALOWNERIDENTIAL_LABELS=Arrays.asList("Customer Name","Country of Incorporation","Relationship Type","Registration Number","Booking Location(s)","Risk Rating","Unwrapping Source");
	public static List<String> NONINDIVIDUAL_PRINICIPALOFFICEADDRESS=Arrays.asList("Line 1","Line 2","Street","Area","City","State","Country","Pincode");
	public static List<String> 	DOC_CUSTOMER_TABLE_HEADER=Arrays.asList("Document Name", "Legal Name", "Nature of Business", "Purpose of Account Opening", "Principal Office address (if different from Registered address)", "Former Name (if any)", "Industry", "Products Required", "Contact Person Name", "Date of Incorporation", "Mandatory Document", "Country of Incorporation", "Countries of Operation", "Contact Person Number", "Registered Address", "Countries of Principal Suppliers");
	public static List<String> 	DOC_NONINDIVIDUAL_TABLE_HEADER=Arrays.asList("Document Name", "Legal Name", "Nature of Business", "Purpose of Account Opening", "Industry", "Products Required","Currency", "Contact Person Name", "Date of Incorporation", "Mandatory Document", "Country of Incorporation", "Countries of Operation", "Contact Person Number", "Registered Address");
	public static List<String> 	RISKASSESMENT_LABELS_FIELDS=Arrays.asList("Countries Risk Atr High", "Outcome of Risk Based Assessment N/A", "N/A", "Final Assessment Refinitiv screening outcome", "Risk Rating (Requirement Generation) Medium", "System Risk Rating N/A", "Decision – Frontline   Decision – Frontline *", "Recommended Risk Rating   Recommended Risk Rating *", "Comments (on Recommended Risk Rating) *");
	public static List<String> 	PROFILEDETAILS_LABELS=Arrays.asList("Diligent Application ID:", "Onboarding Date:", "Next Review Date:", "Waiver Applied:");
	public static List<String> 	PROFILEDETAILS_TABLEINFO=Arrays.asList("Customer Details", "Customer Name", "Country of Incorporation", "Testing 01", "India", "Relationship Details", "Risk Rating", "Booking Location(s)", "Relationship Type", "Entity Type", "Sub Entity Type", "Medium", "Australia, Hong Kong,","Privately Owned", "Private Company", "Regulated FI", "Industries Risk", "Countries Risk");
	public static List<String> 	PROFILEHISTORY_TABLEHEADER=Arrays.asList("Version", "Customer Name", "Process", "Profile Status", "Date Initiated", "Date Completed", "Risk Rating", "Booking Location(s)", "Products", "Download");
}
