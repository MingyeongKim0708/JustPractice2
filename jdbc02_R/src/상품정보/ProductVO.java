package 상품정보;

public class ProductVO {
	// table 명과 동일
	String id;
	String name;
	String content;
	int price;
	String company;
	String img;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	// 가방 안에 어떤 데이터가 들어있는지 String으로 프린트하고 싶음 --> toString
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", content=" + content + ", price=" + price + ", company="
				+ company + ", img=" + img + "]";
	}
	
	
}
