package cn.yang.array;

import cn.yang.common.List;
import cn.yang.list.LinkedList;

/**
 * Test
 *
 * @author yang
 * @date 2022/3/28
 */
public class Test {

    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            arrayList.add(i);
//        }
//        System.out.println(arrayList);

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(9);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }
    }
}
