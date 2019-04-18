package com.example.entity;

import java.util.List;

public class MenuInfo {
	
	
	private Integer menuId;
	private String menuName;
	private Integer parentId;
	private String url;
	private String menuDescribe;
	private List<MenuInfo> secondMenu;
	
	public MenuInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the menuId
	 */
	public Integer getMenuId() {
		return menuId;
	}

	/**
	 * @param menuId the menuId to set
	 */
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	/**
	 * @return the menuName
	 */
	public String getMenuName() {
		return menuName;
	}

	/**
	 * @param menuName the menuName to set
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/**
	 * @return the parentId
	 */
	public Integer getParentId() {
		return parentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the menuDescribe
	 */
	public String getMenuDescribe() {
		return menuDescribe;
	}

	/**
	 * @param menuDescribe the menuDescribe to set
	 */
	public void setMenuDescribe(String menuDescribe) {
		this.menuDescribe = menuDescribe;
	}

	/**
	 * @return the secondMenu
	 */
	public List<MenuInfo> getSecondMenu() {
		return secondMenu;
	}

	/**
	 * @param secondMenu the secondMenu to set
	 */
	public void setSecondMenu(List<MenuInfo> secondMenu) {
		this.secondMenu = secondMenu;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MenuInfo [menuId=" + menuId + ", menuName=" + menuName + ", parentId=" + parentId + ", url=" + url
				+ ", menuDescribe=" + menuDescribe + ", secondMenu=" + secondMenu + "]";
	}
	
	
	
}
