package constantvalues;

public class LocatorValues {

	public static String membershiplink_login_click1 = "linktext:Log In";
	public static String membershiplink_emailid_sendkey= "xpath://input[@id='si_popup_email']";
	public static String membershiplink_password_sendkey="xpath://input[@id='si_popup_passwd']";
	public static String membershiplink_login_click2="xpath://button[@class='clik_btn_log btn-block pagesense_en_track']";

	public static String allcourse_list="tagName:a";
	
	public static String user_courses_click="xpath://a[@id='dropdownMenu3']";
	public static String user_myclassroom_click="xpath://div[@class='dropdown menu-dropdown open']//*[contains(text(),'My Classroom')]";
	public static String user_mycourses_validate_visibility="xpath://a[@class='browse_course']";
	
	public static String blog_community_click="xpath://div[@class='btn-group open']//button[@class='dropdown-toggle']";
	public static String blog_blog_click= "xpath://*[@id=\\\"navbar\\\"]/ul/li[4]/a";
	public static String blog_blog_search_sendkey_submit="xpath://input[@class='search_inp collapse searchinputbox']";
	public static String blog_blog_interviewQuestion_click="xpath://li//a[contains(text(),'Interview Questions')]";
	
	
	public static String exploringCourse_allcourse_click="xpath://a[@id='dropdownMenu1']";
	public static String exploringCourse_course_sendkey_submit="xpath://input[@id='search-inp']";
	public static String exploringCourse_course_select_click="xpath://h3//a[contains(text(),'Selenium')]";
	public static String exploringCourse_course_addtowishlist_click="xpath://div//a[@class='wishlisticon allcourse-wishlist-heart-535']";
	public static String exploringCourse_course_addtowishlist_validation="xpath://div[@class='we-are-sorry-no-res']";
	public static String exploringCourse_course_enroll_click="xpath://button[contains(text(),'Enroll')]";
	
	
	public static String profile_navigateto_profile_click= "xpath://span[@class='user_name']']";
	public static String profile_myprofile_click="xpath://ul[@class='dropdown-menu user-menu profile-xs hidden-sm hidden-xs']//a[@class='trackButton'][contains(text(),'My Profile')]";	
	public static String profile_myprofile_edit_click="ByCssSelector:body.autofoot:nth-child(2) div.container.my_profile:nth-child(3) div.col-lg-12.col-md-12.col-xs-12.col-sm-12.no-padding div.col-lg-10.col-md-10.col-xs-12.col-sm-12.no-padding div.col-lg-12.col-md-12.col-xs-12.col-sm-12.no-padding div.tab-content div.tab-pane.active div.col-lg-8.col-md-8.col-sm-12.col-xs-12.prof-career-other-details div.col-lg-12.col-md-12.col-xs-12.col-sm-12.professional-details:nth-child(1) div.details-heading:nth-child(1) a.profile-edit-icon:nth-child(2) i.icon-pr-edit > <pseudo:before>";

	
	public static String profile_profdetails_click="xpath://a[@aria-controls='professionalDetails']";
	public static String profile_profdetails_companyname_sendkey="xpath://input[@placeholder='Enter Company Name']";
	public static String profile_profdetails_job_sendkey="xpath://select[@name='currentjob']";
	public static String profile_profdetails_industry_sendkey="xpath://select[@name='currentIndustry']";
	public static String profile_profdetails_skills_sendkey="xpath://input[@placeholder='Enter skills (separated by commas)']";
	public static String profile_profdetails_upload_click="xpath://input[@id='resume']";
	
	public static String pagelogout_back_click_="xpath://li[@class='brand-logo']//i[@class='icon-Arrow-Left']";
	public static String pagelogout_usename_click="xpath://span[@class='user_name']";
	public static String pagelogout_btn_click="xpath://a[contains(text(),'Log Out')]";
	
	
}
