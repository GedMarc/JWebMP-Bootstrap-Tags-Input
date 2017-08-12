/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.bootstraptagsinput;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSForm;

/**
 * @author Marc Magon
 */
public class BootstrapTagsInputTest extends BaseTestClass
{
	
	public BootstrapTagsInputTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		BootstrapTagsInput bs = new BootstrapTagsInput();
		bs.getOptions().setFreeInput(true);
		System.out.println(bs.toString(true));
	}
	
	@Test
	public void testSomeMethod2()
	{
		BootstrapTagsInput bs = new BootstrapTagsInput();
		bs.getOptions().setMaxTags(8);
		bs.getOptions().getTypeAhead().getSource().add("New Lookahead Value");
		System.out.println(bs.renderJavascript());
	}
	
	@Test
	public void testJavaScript()
	{
		BootstrapTagsInput bs = new BootstrapTagsInput();
		bs.getOptions().setFreeInput(true);
		System.out.println(bs.renderJavascript());
	}
	
	@Test
	public void testHtml()
	{
		Page p = getInstance();
		BSForm form = new BSForm();
		BootstrapTagsInput bs = new BootstrapTagsInput();
		p.getOptions().setDynamicRender(false);
		p.getBody().add(form);
		form.add(bs);
		System.out.println(p.toString(true));
	}
}
