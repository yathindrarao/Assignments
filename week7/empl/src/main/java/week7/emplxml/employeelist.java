package week7.emplxml;

import java.util.Map;

public class employeelist {
	private Map<Integer,employee> maps;

	public Map<Integer,employee> getMaps() {
		return maps;
	}

	public void setMaps(Map<Integer,employee> maps) {
		this.maps = maps;
	}
    public void disp()
    {
    	System.out.println(23);
    }
	@Override
	public String toString() {
		return "employeelist [maps=" + maps + "]";
	} 
	



}