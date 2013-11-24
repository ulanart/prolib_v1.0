package lv.revolt;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class Index extends WebPage {
	Form form = new Form("form");
	private static final long serialVersionUID = 1L;
	
	public Index(final PageParameters parameters) {
		super(parameters);
		add(new Label("message","Welcome!"));
	}
}
