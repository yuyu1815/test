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
@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\033\n\000\n\002\020\025\n\002\020\b\n\000\n\002\020\013\n\002\b\004\b\002\030\0002\0020\001B\"\022\f\b\002\020\002\032\0020\003\"\0020\004\022\b\b\002\020\005\032\0020\006\022\b\b\002\020\007\032\0020\006R\017\020\005\032\0020\006¢\006\006\032\004\b\005\020\bR\017\020\007\032\0020\006¢\006\006\032\004\b\007\020\bR\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\t¨\006\n"}, d2 = {"Landroidx/annotation/IntDef;", "", "value", "", "", "flag", "", "open", "()Z", "()[I", "annotation"})
public @interface IntDef {
  int[] value() default {};
  
  boolean flag() default false;
  
  boolean open() default false;
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\annotation-jvm-1.8.0.jar!\androidx\annotation\IntDef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */