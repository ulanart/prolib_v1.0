package lv.revolt;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class signup extends WebPage
{
	private TextField email;
	private TextField login;
	private TextField pass;
	private Button signup;
	public signup(final PageParameters parameters)
	{
		super(parameters);
		Form form = new Form("form");
		form.add(new Button("confirm")
		{
			@Override
			public void onSubmit()
			{
				String value = (String)email.getModelObject();
				String value1 = (String)login.getModelObject();
				String value2 = (String)pass.getModelObject();
			}
		});
		add(form);
		add(new Label("message","Please fill the fields below and press Confirm Button"));
	}
}