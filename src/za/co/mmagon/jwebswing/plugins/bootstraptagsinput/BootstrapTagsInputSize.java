package za.co.mmagon.jwebswing.plugins.bootstraptagsinput;

/**
 * Bootstrap Tags Input Size
 *
 * @author Marc Magon
 * @since 10 Jun 2017
 */
public enum BootstrapTagsInputSize
{
	/**
	 * Have large tag inputs
	 */
	Big,
	/**
	 * Have small tag inputs
	 */
	Small;
	/**
	 * Any sub data
	 */
	private String data;
	
	/**
	 * A new BootstrapTagsInputSize
	 */
	private BootstrapTagsInputSize()
	{
	
	}
	
	/**
	 * A new BootstrapTagsInputSize with data
	 */
	private BootstrapTagsInputSize(String data)
	{
	
	}
	
	/**
	 * Returns the name or the data contained within
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		if (data != null && !data.isEmpty())
		{
			return data;
		}
		else
		{
			return name().toLowerCase();
		}
	}
}
