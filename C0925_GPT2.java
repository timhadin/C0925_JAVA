import java.util.*; // 패키지에서 제공하는 여러 클래스를 사용하기 위해 * (이렇게하면 Set, HashSet, Arrays 등 사용 가능)

public class C0925_GPT2 {
    public static int[] rmvDup(int[] numbers) {
        Set<Integer> unique = new HashSet<>(); // Set은 중복된 요소를 허용하지 않는 자료 구조
                                               // HashSet을 사용하여 중복된 숫자를 자동으로 제거할 수 있음
        for (int number : numbers) { // numbers의 모든 숫자를 하나씩 순회하면서,
            unique.add(number); // HashSet인 unique에 추가
        }
        int[] result = new int[unique.size()];
        int index = 0; // 새 배열에 중복이 제거된 숫자를 저장할 때 사용
        for (int number : unique) { // unique에서 중복이 제거된 요소들을 number에 대입
            result[index++] = number; // number를 result배열에 저장 한후 index + 1
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 1, 3, 7, 5, 9, 2};
        int[] unique = rmvDup(numbers);

        System.out.println("중복이 제거된 배열: " + Arrays.toString(unique));
    }
}
