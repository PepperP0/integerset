public class IntegersetTest {
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        Integerset a = new Integerset();
        a.add(30);
        a.add(20);
        a.add(10);
        String s = "[50, 70]";
        if (a.toString().equals(s)) {
            System.out.println("Pass");
            passed++;
        }
        else{
            System.out.println("Fail "+ a.toString());failed++;
        }

        // Test 2: การเพิ่มข้อมูลที่ซ้ำซ้อน
        System.out.println("\n--- Testing adding duplicates ---");
        a.add(10); // เพิ่ม 10 ที่มีอยู่แล้ว
        if (a.size() == 3) {
            System.out.println("PASSED: Adding a duplicate does not change the size.");
            passed++;
        } else {
            System.out.println("FAILED: Size should be 3 but got " + a.size());
            failed++;
        }
        // Test 3: การลบข้อมูล
        System.out.println("\n--- Testing remove() ---");
        a.remove(20);
        String expected2 = "[10, 30]";
        if (a.toString().equals(expected2)) {
            System.out.println("PASSED: Remove works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected2 + " but got " + a.toString());
            failed++;
        }

        // Test 4: การตรวจสอบข้อมูล (contains)
        System.out.println("\n--- Testing contains() ---");
        if (a.contains(10) && !a.contains(20)) {
            System.out.println("PASSED: Contains works correctly after removal.");
            passed++;
        } else {
            System.out.println("FAILED: Contains check is incorrect.");
            failed++;
        }



        //Integerset b = new Integerset();
        //b.add(50);
        //b.add(80);
        //String s1 = "[50, 80]";
        
        //if (b.toString().equals(s1)) {
            //System.out.println("Pass");
            //passed++;
        //}
        //else{
            //System.out.println("Fail "+ b.toString()); failed++;
        //}
        

        
        // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }

    }
}