package launcher;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launch("firefoxbrowser");
		navigateUrl("amazonurl");

	}

}