import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

/**
 * Tests for Solution11.
 */
public class Test2022113584_11 {
    /**
     * Testing strategy for solution11:
     *<p>
     *    划分输入数组：
     *    1. 输入数组为空
     *    2. 输入数组长度在0到2之间
     *    3. 输入数组长度大于三，并且全部为0
     *    4. 输入数组长度大于三，并且全部为正数
     *    5. 输入数组长度大于三，并且全部为负数
     *    6. 输入数组长度大于三，不止包含一种数，即不止全为正数、负数或0，但其中没有满足条件的三元组
     *    7. 输入数组长度大于三，不止包含一种数，即不止全为正数、负数或0，但其中有满足条件的三元组
     *</p>
     */
    @BeforeEach
    public void setUp() {
    }
    Solution11 solution11 =new Solution11();

    //覆盖：输入数组为空
    @Test
    public void testNullArray() {
        int[] nums = {};
        List<List<Integer>> result = solution11.threeSum(nums);
        assertEquals(0, result.size());
    }
    //覆盖：输入数组长度在0到3之间
    @Test
    public void testArrayWithLengthLessThanThree() {
        int[] nums = {1, 2};
        List<List<Integer>> result = solution11.threeSum(nums);
        assertEquals(0, result.size());
    }
    //覆盖：输入数组长度大于三，并且全部为0
    @Test
    public void testArrayWithAllZero(){
        int[] nums={0,0,0,0};
        List<List<Integer>> result = solution11.threeSum(nums);
        assertEquals(1, result.size());
    }
    //覆盖：输入数组长度大于三，并且全部为正数
    @Test
    public void testArrayWithAllPositive(){
        int[] nums={4,1,2,3,5};
        List<List<Integer>> result = solution11.threeSum(nums);
        assertEquals(0, result.size());
    }
    //覆盖：输入数组长度大于三，并且全部为负数
    @Test
    public void testArrayWithAllNegative(){
        int[] nums={-3,-4,-1,-2,-5};
        List<List<Integer>> result = solution11.threeSum(nums);
        assertEquals(0, result.size());
    }
    //覆盖：输入数组长度大于三，不止包含一种数，即不止全为正数、负数或0，但其中没有满足条件的三元组
    @Test
    public void testArrayWithNoTriple(){
        int[] nums={5,6,7,1,-2,3,4,8,9};
        List<List<Integer>> result = solution11.threeSum(nums);
        assertEquals(0, result.size());
    }
    //覆盖：输入数组长度大于三，不止包含一种数，即不止全为正数、负数或0，但其中有满足条件的三元组
    @Test
    public void testArrayWithTriple(){
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> result = solution11.threeSum(nums);
        assertEquals(2, result.size());
    }

}
