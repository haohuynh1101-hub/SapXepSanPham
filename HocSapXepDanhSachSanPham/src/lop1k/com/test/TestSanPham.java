package lop1k.com.test;

import java.util.ArrayList;
import java.util.Collections;

import lop1k.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		ArrayList<SanPham>dsSp=new ArrayList<SanPham>();
		SanPham coca=new SanPham(5,"Cocacola",25);
		SanPham pepsi=new SanPham(1,"Pepsi",28);
		SanPham redbull=new SanPham(2,"Redbull",30);
		dsSp.add(coca);
		dsSp.add(pepsi);
		dsSp.add(redbull);
		System.out.println("Danh sách sản phẩm");
		Collections.sort(dsSp);
		for (int i = 0; i < dsSp.size(); i++) {
			System.out.println(dsSp.get(i));
		}

	}

}
