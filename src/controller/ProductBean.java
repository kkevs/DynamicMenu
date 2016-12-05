package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Category;

@ManagedBean
@SessionScoped
public class ProductBean {
	private String formPath;
	private Category category = new Category();

	public ProductBean() {
		formPath = "hakkimda.xhtml";
	}

	public void chooseCategory(int categoryId) {

		System.out.println("safas");
		formPath = "product_masters.xhtml";

		switch (categoryId) {
		case 3:
			formPath = "hakkimda.xhtml";
			break;

		}
	}

	public String getFormPath() {
		return formPath;
	}

	public void setFormPath(String formPath) {
		this.formPath = formPath;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
