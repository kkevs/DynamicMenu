package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import model.MenuItem;

@ManagedBean(name="dynMenu")
public class DynamicMenu {

	public List<MenuItem> getMenuItems() {

		List<MenuItem> menuItems = new ArrayList<MenuItem>();

		menuItems.add(new MenuItem("Menu Item #1", 1));
		menuItems.add(new MenuItem("Menu Item #2", 2));
		menuItems.add(new MenuItem("Menu Item #3", 3));

		return menuItems;
	}
}
