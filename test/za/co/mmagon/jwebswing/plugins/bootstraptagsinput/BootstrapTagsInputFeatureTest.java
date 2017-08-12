/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.bootstraptagsinput;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;

/**
 * @author Marc Magon
 */
public class BootstrapTagsInputFeatureTest extends BaseTestClass
{

	public BootstrapTagsInputFeatureTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BootstrapTagsInputFeature bsf = new BootstrapTagsInputFeature(getInstance().getBody());
		bsf.getOptions().setItemText("New Value");
		System.out.println(bsf.renderJavascript());
	}

}
