package OOPS_Abstract;

public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LoginPage page = new LoginPage();
//		page.header();
//		page.url();
//		page.title();
//		page.timeout();
//		page.doLogin();
//		
//		System.out.println(page.time);
//		page.time =12;
//		
//		System.out.println(page.age);
//		page.age =90;
//		
//		//TOP CASTING
//		Page p = new LoginPage();
//		p.header();
//		p.title();
//		p.timeout();
//		p.url();
		
		LoginPage page = new LoginPage(10);
		
		//DOWN CASTING
		//LoginPage p1 =(LoginPage) new Page();
	}

}
