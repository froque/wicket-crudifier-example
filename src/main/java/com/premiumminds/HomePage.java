package com.premiumminds;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.premiumminds.wicket.crudifier.form.CrudifierForm;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);
    }
	
	@Override
	protected void onInitialize() {
		super.onInitialize();
		
		final Label resultLabel = new Label("result", "");
        resultLabel.setOutputMarkupId(true);
        add(resultLabel);
        
        CrudifierForm<Pojo> form = new CrudifierForm<Pojo>("crudifierForm", Model.of(new Pojo())){

            private static final long serialVersionUID = 1L;

            @Override
            protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
            	super.onSubmit(target, form);
				resultLabel.setDefaultModelObject(getModelObject());
				target.add(resultLabel);
			}
        };
        add(form);
	}
}
