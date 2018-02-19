package cn.itcast.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.core.dao.TestDao;
import cn.itcast.core.pojo.Admin;
@Service
@Transactional
public class TestServiceImpl implements TestService{
	@Resource
	private TestDao testDao;
	@Override
	public void addTset(Admin admin) {
		testDao.addTset(admin);
		//throw new RuntimeException("≤‚ ‘“Ï≥£");
	}
}
