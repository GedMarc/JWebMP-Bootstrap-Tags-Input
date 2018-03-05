package za.co.mmagon.jwebswing.plugins.bootstraptagsinput;

import za.co.mmagon.jwebswing.base.html.inputs.InputTextType;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

import java.util.Objects;

/**
 * Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select
 * elements.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Bootstrap Tags Input",
		description = "jQuery plugin providing a Twitter Bootstrap user interface for managing tags",
		url = "https://github.com/GedMarc/JWebSwing-Bootstrap-Tags-Input")
public class BootstrapTagsInput
		extends InputTextType<BootstrapTagsInput>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The feature for this select
	 */
	private BootstrapTagsInputFeature feature;

	/*
	 * Constructs a new BootstrapTagsInput
	 */
	public BootstrapTagsInput()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns the feature for this component
	 *
	 * @return
	 */
	public BootstrapTagsInputFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BootstrapTagsInputFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the feature for this bootstrap drop down
	 *
	 * @param feature
	 */
	public void setFeature(BootstrapTagsInputFeature feature)
	{
		this.feature = feature;
	}

	@Override
	public BootstrapTagsInputOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BootstrapTagsInput))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BootstrapTagsInput that = (BootstrapTagsInput) o;
		return Objects.equals(getFeature(), that.getFeature());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getFeature());
	}
}
