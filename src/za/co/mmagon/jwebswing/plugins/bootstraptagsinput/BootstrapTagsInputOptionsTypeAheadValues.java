package za.co.mmagon.jwebswing.plugins.bootstraptagsinput;

import java.util.ArrayList;
import java.util.List;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * The type ahead values available for tags input
 *
 * @author Marc Magon
 * @since 10 Jun 2017
 */
public class BootstrapTagsInputOptionsTypeAheadValues extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;
    /**
     * Allow creating tags which are not returned by typeahead's source (default: true)
     * <p>
     * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
     */
    private List<String> source;

    /*
     * Constructs a new BootstrapTagsInputOptionsTypeAheadValues
     */
    public BootstrapTagsInputOptionsTypeAheadValues()
    {
        //Nothing needed
    }

    /**
     * Allow creating tags which are not returned by typeahead's source (default: true)
     * <p>
     * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
     *
     * @return
     */
    public List<String> getSource()
    {
        if (source == null)
        {
            source = new ArrayList<>();
        }
        return source;
    }

    /**
     * Allow creating tags which are not returned by typeahead's source (default: true)
     * <p>
     * This is only possible when using string as tags. When itemValue option is set, this option will be ignored.
     *
     * @param source
     */
    public void setSource(List<String> source)
    {
        this.source = source;
    }

}
