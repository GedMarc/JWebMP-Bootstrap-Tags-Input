module com.jwebmp.plugins.bootstraptagsinput {
	exports com.jwebmp.plugins.bootstraptagsinput;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bootstraptagsinput.BootstrapTagsInputPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bootstraptagsinput.implementations.BootstrapTagsInputExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bootstraptagsinput.implementations.BootstrapTagsInputExclusionsModule;

	opens com.jwebmp.plugins.bootstraptagsinput to com.fasterxml.jackson.databind, com.jwebmp.core;
}
