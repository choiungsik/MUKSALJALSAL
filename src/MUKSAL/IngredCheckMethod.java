package MUKSAL;

import java.util.ArrayList;

public class IngredCheckMethod {

	public static void IngredCheck() { /// ���� üũ�� �޼ҵ�

		IngredientDAO dao = new IngredientDAO();
		ArrayList<IngredientVO> list = dao.ingred(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getIngredcode() + list.get(i).getMenuname1() + list.get(i).getMenuname2()
					+ list.get(i).getMenuname3() + list.get(i).getMenuname4() + list.get(i).getMenuname5()
					+ list.get(i).getMenuname6());
		}
	}
}
