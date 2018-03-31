package freemarker.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import freemarker.domain.User;

@Controller
public class IndexController {

	@RequestMapping("/show")
	public String show(@RequestParam(value="free", defaultValue="hahaha")String free, Model model) {
		model.addAttribute("free", free);
		model.addAttribute("nullValue", null);
		model.addAttribute("user", initUser());
		return "freemarker";
	}
	
	public User initUser() {
		User user = new User();
		
		user.setId(24);
		user.setBoy(true);
		user.setName("wsz");
		user.setPrice(666666d);
		
		List<String> list = new ArrayList<String>();
		list.add("list1");
		list.add("list2");
		list.add("list3");
		user.setList(list);
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		user.setSet(set);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("m1", "m1");
		map.put("m2", "m2");
		map.put("m3", "m3");
		user.setMap(map);
		
		return user;
	}
}
