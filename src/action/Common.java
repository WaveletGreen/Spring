package action;

import com.opensymphony.xwork2.ActionSupport;

public class Common extends ActionSupport {

	public String getName() {
		System.out.println("-----------这里是Common Action-------------");
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("-----------这里是Common Action-------------");
		return super.execute();
	}
}
