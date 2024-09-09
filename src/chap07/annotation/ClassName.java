package chap07.annotation;

@AnnotationName(elementNameOne = "값", elementNameTwo = 3)
public class ClassName {

    @AnnotationName(elementNameOne = "값")
    private String fieldName;

    @AnnotationName(elementNameOne = "값")
    void method() {

    }

}
