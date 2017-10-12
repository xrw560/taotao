package com.taotao.portal.pojo;

import com.taotao.pojo.TbItem;

/**
 * 商品pojo
 * @author Administrator
 *
 */
public class ItemInfo extends TbItem {

	public String[] getImages() {
		String image = getImage();
		if (image != null) {
			String[] images = image.split(",");
			return images;
		}
		return null;
	}

}
