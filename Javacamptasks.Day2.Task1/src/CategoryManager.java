
public class CategoryManager {
	public void add(Category category) {
		System.out.println(category.getId() + " : added.");
	}
	public void delete(Category category) {
		System.out.println(category.getContent() + " : deleted.");
	}
	public void update(Category category) {
		System.out.println(category.getContent() + " : updated.");
	}
	
	public Category[] getAll() {
	Category category1 = new Category(1,"Front-end");
	Category category2 = new Category(2,"Back-end");
	Category[] categories = {category1,category2};
	
	return categories;
	}
}
