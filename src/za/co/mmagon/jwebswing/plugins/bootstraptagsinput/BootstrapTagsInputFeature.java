package za.co.mmagon.jwebswing.plugins.bootstraptagsinput;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Creates toast messages
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class BootstrapTagsInputFeature extends Feature<BootstrapTagsInputOptions, BootstrapTagsInputFeature>
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new BootstrapTagsInputFeature
	 */
	public BootstrapTagsInputFeature(ComponentHierarchyBase component)
	{
		super("BootstrapTagsInputFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "tagsinput(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}

	/**
	 * Returns the options
	 *
	 * @return
	 */
	@Override
	public BootstrapTagsInputOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			setOptions(new BootstrapTagsInputOptions());
		}
		return super.getOptions();
	}

}
