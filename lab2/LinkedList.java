package list;

class Node{
	private Node next;
	private Integer data;
	
	public Node() {
	}

	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
}

public class LinkedList {
	private Node begin;
	private Node end;
	private int num_ofEllem;
	
	//����������� ��� ���������
	public LinkedList() {
		begin = new Node();
		end = begin;
		this.num_ofEllem = 0;
	}
	/* ������ ������� � ����� ������ */
	
	public void add(Integer data) {
       end.setNext(new Node());
       end = end.getNext();
       end.setData(data);
       this.num_ofEllem++;
	}
	/* �������� ������� �� �������, ������� null ���� ����� ������� ����������� */
	public Integer get(int index) {
       Node tbegin = begin;
       for(int i = 0; i < index + 1 ; i++)
       {
    	   tbegin = tbegin.getNext();
       }
       return tbegin.getData();
	}
	/* ��������� �������� �� ��������, ������� true � ��� ����� ��� false � ������ ������� */
	public boolean delete(int index) {
		Node tbegin = begin;
        if ((index < 0)||(index >= this.num_ofEllem))
            return false;
        for (int i = 0; i < index; i++) {
            if (tbegin != null)
                tbegin = tbegin.getNext();
            else
                return false;
        }
        if(tbegin.getNext().getNext() != null)
        {
            tbegin.setNext(tbegin.getNext().getNext());
        }
        else 
        {
            tbegin.setNext(null);
            end = tbegin;
        }
        num_ofEllem--;
        return true;
	      
	}
	/*������� ����� ������: ���� �������� � ������ ���� �� ������� 0 (����)*/
	public int size() {
         return this.num_ofEllem;
        
	}
	 

}
