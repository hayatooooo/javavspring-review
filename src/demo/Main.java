package demo;

import java.util.ArrayList;

import entity.Member;
import service.MemberService;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {
		//シングルトンに変更
//		MemberServiceImpl service = new MemberServiceImpl();
		//型変更
//		MemberServiceImpl service = MemberServiceImpl.getInstance();
		MemberService service = MemberServiceImpl.getInstance();
		System.out.println(service.greet(2));
		System.out.println(service.getAll());
		
		ArrayList<Member> list = service.getAll();
		for(Member mem : list) {
		System.out.println(mem.getId()+","+mem.getName()+","+mem.getEmail());	
		}
		
		System.out.println(service.sumOf(3, 5));
	}

}
