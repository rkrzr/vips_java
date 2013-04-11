package org.fit.vips;

import java.awt.List;

//public class Test {
//    public static void main(final String[] args) throws Exception {
//        System.out.println("bla");
//        
//        String[] url = {"http://www.selectorgadget.com/"};
//        VipsTester tester = new VipsTester();
//        VipsTester.main(url);
//    }
//}

public class Test {

	/**
	 * Main function
	 * @param args Internet address of web page.
	 */
	public static void main(String args[])
	{
		// we've just one argument - web address of page
		if (args.length != 1)
		{
			System.err.println("We've just only one argument - web address of page!");
			System.exit(0);
		}

		String url = args[0];
//		String url = "http://www.selectorgadget.com/";

		try
		{
			Vips vips = new Vips();
			// disable graphics output
			vips.enableGraphicsOutput(false);
			// disable output to separate folder (no necessary, it's default value is false)
			vips.enableOutputToFolder(false);
			// set permitted degree of coherence
			vips.setPredefinedDoC(8); // default is 8
			
			vips.enableOutputEscaping(false);
			
			// start segmentation on page
			vips.startSegmentation(url);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
