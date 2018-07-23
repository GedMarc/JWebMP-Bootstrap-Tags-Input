import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.bootstraptagsinput.BootstrapTagsInputPageConfigurator;

module com.jwebmp.plugins.bootstraptagsinput {
	exports com.jwebmp.plugins.bootstraptagsinput;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap;
	requires java.validation;

	provides IPageConfigurator with BootstrapTagsInputPageConfigurator;

}
