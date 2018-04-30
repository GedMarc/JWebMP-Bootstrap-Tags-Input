# JWebMP-Bootstrap-Tags-Input
Use the Bootstrap Tags Input directly through JWebMP

Example for simple tags input : 
```
BootstrapTagsInput bs = new BootstrapTagsInput();
bs.getOptions().setFreeInput(true);
```

Example for look ahead values : 
```
BootstrapTagsInput bs = new BootstrapTagsInput();
bs.getOptions().setMaxTags(8);
bs.getOptions().getTypeAhead().getSource().add("New Lookahead Value");
```

As a feature on any component :
```
BootstrapTagsInputFeature bsf = new BootstrapTagsInputFeature(getInstance().getBody());
bsf.getOptions().setItemText("New Value");
```

# Bootstrap Tags Input

jQuery plugin providing a Twitter Bootstrap user interface for managing tags

Bootstrap Link
https://bootstrap-tagsinput.github.io/bootstrap-tagsinput/examples/

