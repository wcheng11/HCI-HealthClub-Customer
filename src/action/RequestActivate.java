package action;

import model.VIP;
import service.VIPService;

@SuppressWarnings("serial")
public class RequestActivate extends BaseAction {
	private String v_id;
	private String c_id;
	private VIPService vipService;

	public VIPService getVIPService() {
		return vipService;
	}

	public void setVIPService(VIPService vipService) {
		this.vipService = vipService;
	}

	public String execute() throws Exception {
		int card_id = Integer.parseInt(c_id);
		int vip_id = Integer.parseInt(v_id);
		VIP vip = vipService.requestActivate(card_id, vip_id);
		if (vip == null) {
			return "failure";
		} else {
			request.setAttribute("vip", vip);
			return "success";
		}
	}

	public String getV_id() {
		return v_id;
	}

	public void setV_id(String v_id) {
		this.v_id = v_id;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
}
