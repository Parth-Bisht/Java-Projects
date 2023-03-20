import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Code implements Comparable<Code>{
    private String sectionNo;
    private String lectureNo;

    public Code(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public String toString() {
        return "Code{" +
                "sectionNo='" + sectionNo + '\'' +
                ", LectureNo='" + lectureNo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo()+o.getLectureNo();
        return code1.compareTo(code2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Code code)) return false;
        return Objects.equals(getSectionNo(), code.getSectionNo()) && Objects.equals(getLectureNo(), code.getLectureNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSectionNo(), getLectureNo());
    }
}
public class Main {
    public static void main(String[] args) {
        Map<Code,String> lectures = new TreeMap<>();
        lectures.put(new Code("S01","L03"),"Generics");
        lectures.put(new Code("S01","L01"),"Files under Java");
        lectures.put(new Code("S02","L02"),"Network programming");
        lectures.put(new Code("S01","L07"),"OOPS");
        lectures.put(new Code("S01","L05"),"Methods");
        lectures.put(new Code("S01","L03"),"Expressions");

//        for(Map.Entry<Code,String> entry: lectures.entrySet()){
//            System.out.println("Key: "+entry.getKey()+" Value:"+entry.getValue());
//        }
//    System.out.println(lectures.get(new Code("S01","L03")));
        Code code = null;
        for(Map.Entry<Code,String> entry: lectures.entrySet()){
            if(entry.getValue().equals("OOPS")){
                code = entry.getKey();
            }
        }
        System.out.println("The key for value \"OOPS\" : "+code);
    }
}