package rmuti.lab4;

public class ArraysListExt	extends	ArraysList {
	public int countItem(Object e){
		int cc=0;
		for(int i=0;i<size;i++){
			if(elementData[i].equals(e))cc++;
		}
		return cc;
	}
	public static void main(String[]	args){
		ArraysListExt	show=new	ArraysListExt();
		int z=show.countItem(9);
		System.out.println(z);
	}
}

