class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterList = new ArrayList<>(); // 문자 로그를 저장할 문자 리스트
        List<String> digitList = new ArrayList<>(); // 숫자 로그를 저장할 숫자 리스트
       
       // testcase logs = ["id1 8 1 5 1","id2 art can","id3 3 6","id4 own kit dig","id5 art zero"]

        for(String log : logs) {
            // log값
            // id2 8 1 5 1
            // id2 art can
            // id3 3 6
            // id4 own kit dig
            // id5 art zero

            // 8 a 3 o a 이 값으로 아래 분기처리
            if(Character.isDigit(log.split(" ")[1].charAt(0))) { // 로그 종류 확인 후 숫자 로그라면 숫자 리스트에 삽입
                digitList.add(log);
            } else {
                letterList.add(log); // 숫자 로그가 아니라면 문자 리스트에 삽입
            };
        };

        letterList.sort((s1, s2) -> {
            System.out.println("::s1:: "+s1);
            System.out.println("::s2:: "+s2);

            // 식별자와 식별자 외 나머지 부분, 이렇게 두 부분으로 나눈다.
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);

            System.out.println("::s2:: "+s2);
            


            // 문자 로그 사전순 비교
            int compared = s1x[1].compareTo(s2x[1]);
            // 문자가 동일한 경우 식별자 비교
            if(compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                // 비교 대상의 순서가 동일한 경우 0, 순서가 앞인 경우 1, 순서가 뒤인 경우 -1이 된다.
                return compared;
            }
        });

        // // 문자 리스트 뒤로 숫자 리스트를 이어 붙인다.
        // // 숫자 로그는 '입력 순서대로'라는 제약 조건이 있으므로 따로 정렬하지 않는다.
        letterList.addAll(digitList);
       
        // // 리스트를 String 배여로 변환해 리턴한다.
        return letterList.toArray(new String[0]);
    };
};