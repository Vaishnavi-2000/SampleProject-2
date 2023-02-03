package StringBuffer;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Vaishnavi");
		System.out.println(sb.length());
		sb.append(" Matam");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(1001);
		System.out.println(sb.capacity());

	}

}
