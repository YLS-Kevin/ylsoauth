package com.monkeyk.sos.web.controller.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.monkeyk.sos.domain.dto.UserJsonDto;
import com.monkeyk.sos.service.UserService;

/**
 * 2018/3/12
 *
 * @author Tim
 */
@Controller
@RequestMapping("/m/")
public class MobileController {

	@Autowired
	private UserService userService;

	@RequestMapping("dashboard")
	public String dashboard() {
		return "mobile/dashboard";
	}

	@RequestMapping("user_info")
	@ResponseBody
	public UserJsonDto userInfo() {
		return userService.loadCurrentUserJsonDto();
	}

}