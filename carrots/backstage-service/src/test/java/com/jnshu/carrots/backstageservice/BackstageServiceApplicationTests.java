package com.jnshu.carrots.backstageservice;

import com.jnshu.carrots.backstageservice.dao.BannerMapper;
import com.jnshu.carrots.backstageservice.model.Banner;
import com.jnshu.carrots.backstageservice.model.Te;
import com.jnshu.carrots.backstageservice.service.BannerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackstageServiceApplicationTests {
	@Autowired
	BannerService bannerService;
	@Autowired
	BannerMapper bannerDao;
	@Test
	public void contextLoads() {

//		System.out.println(bannerService.getImageList(0, 0, "a", 999, 999, null, 1, 10));
//		System.out.println(bannerService.getImage(1));
//		System.out.println(bannerService.deleteImage(10));
//		Banner banner = new Banner();
//		banner.setCreateName("ljl");
//		banner.setCreateTime(15244338L);
//		banner.setImageName("啦啦啦");
//		banner.setImageUrl("aaaaaaaaaaaaaa");
//		banner.setImageStatus(0);
//		banner.setImageTime(3);
//		banner.setImageTrade(1);
//		banner.setImageJumpUrl("adsadasda");
//		banner.setUpdateAt(45164641L);
//		banner.setUpdateName("dfk");
//		banner.setImageType(3);
////		banner.setImageId(5L);
////		bannerDao.updateByPrimaryKeySelective(banner);
//		System.out.println(bannerDao.insertSelective(banner));


		Te te = new Te();
		System.out.println(te.getA());

		int[] a = {};
		for (int b:
			 a) {
			
		}


	}


}
