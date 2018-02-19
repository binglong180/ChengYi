package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import cn.itcast.core.common.SpringJunitClassRunner;
import cn.itcast.core.pojo.Admin;
import cn.itcast.core.service.TestService;

public class MyTest extends SpringJunitClassRunner {
	@Autowired
	private TestService testService;
	@Test
	public void test() {
		Admin admin=new Admin();
		admin.setName("ţţ1");
		try {
			testService.addTset(admin);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
