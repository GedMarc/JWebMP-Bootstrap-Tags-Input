package za.co.mmagon.jwebswing.plugins.bootstraptagsinput;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Bootstrap Tags Input",
		pluginDescription = "jQuery plugin providing a Twitter Bootstrap user interface for managing tags",
		pluginUniqueName = "jwebswing-tags-input",
		pluginVersion = "2.1.3",
		pluginCategories = "multi input, text input, tags, , dropdown, bootstrap, ui,web ui, framework",
		pluginSubtitle = "jQuery plugin providing a Twitter Bootstrap user interface for managing tags",
		pluginSourceUrl = "https://github.com/bootstrap-tagsinput/bootstrap-tagsinput",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Bootstrap-Tags-Input/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Bootstrap-Tags-Input",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://bootstrap-tagsinput.github.io/bootstrap-tagsinput/examples/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapTagsInput.jar/download"
) class BootstrapTagsInputPageConfigurator extends PageConfigurator
{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * Constructs a new BootstrapTagsInputPageConfigurator
	 */
	public BootstrapTagsInputPageConfigurator()
	{
		//Nothing needed
	}
	
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(page.getBody(), true);
			BootstrapPageConfigurator.setRequired(page.getBody(), true);
			page.getBody().addJavaScriptReference(BootstrapTagsInputReferencePool.BootstrapTagsInput.getJavaScriptReference());
			page.getBody().addCssReference(BootstrapTagsInputReferencePool.BootstrapTagsInput.getCssReference());
		}
		return page;
	}
}
