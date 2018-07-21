/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.bootstraptagsinput;

import com.jwebmp.core.Page;
import com.jwebmp.core.PageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;

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
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapTagsInput.jar/download") class BootstrapTagsInputPageConfigurator
		extends PageConfigurator
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
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(BootstrapTagsInputReferencePool.BootstrapTagsInput.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BootstrapTagsInputReferencePool.BootstrapTagsInput.getCssReference());
		}
		return page;
	}
}
