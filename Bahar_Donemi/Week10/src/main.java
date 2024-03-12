
public class main {
	public static void main(String[] args) {

		LinkedIntList LinkList = new LinkedIntList();
		LinkList.add(5);
		LinkList.add(7);
		System.out.println(LinkList.toString());
        LinkList.remove(2);
        System.out.println(LinkList.toString());
	}
}
