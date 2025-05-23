package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Retention(AnnotationRetention.SOURCE)
@Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.ANNOTATION_TYPE})
@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\033\n\000\n\002\020\021\n\002\020\016\n\000\n\002\020\013\n\002\b\003\b\002\030\0002\0020\001B \022\024\b\002\020\002\032\n\022\006\b\001\022\0020\0040\003\"\0020\004\022\b\b\002\020\005\032\0020\006R\017\020\005\032\0020\006¢\006\006\032\004\b\005\020\007R\027\020\002\032\n\022\006\b\001\022\0020\0040\003¢\006\006\032\004\b\002\020\b¨\006\t"}, d2 = {"Landroidx/annotation/StringDef;", "", "value", "", "", "open", "", "()Z", "()[Ljava/lang/String;", "annotation"})
public @interface StringDef {
  String[] value() default {};
  
  boolean open() default false;
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\annotation-jvm-1.8.0.jar!\androidx\annotation\StringDef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */