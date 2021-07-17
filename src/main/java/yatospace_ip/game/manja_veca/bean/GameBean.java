package yatospace_ip.game.manja_veca.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

/**
 * ���� ��� �� ������ �� ����, ���� ���. 
 * �������� �� ������� ��� �� 1-100 � �������� 
 * ���� ������ ��� �� ������. ������� �� �� �� 
 * �� �� ���������� ��� ���� ��� ��� �� �������. 
 * �� ���� ���� ������ �� ��� ������ � ����� �� �������. 
 * �������� ����� ����� ��������� ���� ����������� ���� 
 * ������ ����. ������� �������� ���� ������ ����. ������
 * �� �������� ���������� ��� � �������.  
 * @author MV
 * @version 1.0
 */
public class GameBean implements Serializable{
	private static final long serialVersionUID = -7704427549603491168L;
	
	private transient Random random  = new Random(); 
	private int number = 0; 
	private List<Integer> trybox = new ArrayList<>(); 
	private boolean targetpick  = false; 
	private boolean end = false; 
	
	public GameBean() {
		number = Math.abs(random.nextInt()%100)+1; 
	}

	public int getNumber() {
		return number;
	}
	
	public void refresh() {
		number = Math.abs(random.nextInt()%100)+1; 
		trybox = new ArrayList<>(); 
		targetpick = false; 
		end = false;
	}
	
	public void finish() {
		end = true;
	}
	
	public synchronized boolean pick(int num) {
		if(end) return false; 
		if(num<1) return false; 
		if(num>100) return false; 
		if(trybox.contains(num)) return false; 
		trybox.add(num); 
		if(num==number) {
			end = true;
			targetpick = true;
			return true; 
		}
		return true;
	}
	
	public boolean pick(HttpServletRequest request) {
		try {
			return pick(Integer.parseInt(request.getParameter("try_number")));
		}catch(Exception ex) {
			return false; 
		}
	}
	
	public synchronized List<Integer> trybox(){
		return new ArrayList<>(trybox); 
	}
	
	public boolean targetpick() {
		return targetpick; 
	}
	
	public boolean end() {
		return end; 
	}
}
