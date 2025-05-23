package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
@Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FIELD})
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD})
@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\006\b\002\030\0002\0020\001B2\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003\022\b\b\002\020\007\032\0020\003\022\b\b\002\020\b\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\tR\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\nR\017\020\b\032\0020\003¢\006\006\032\004\b\b\020\tR\017\020\007\032\0020\003¢\006\006\032\004\b\007\020\tR\017\020\006\032\0020\003¢\006\006\032\004\b\006\020\t¨\006\013"}, d2 = {"Landroidx/annotation/ChecksSdkIntAtLeast;", "", "api", "", "codename", "", "parameter", "lambda", "extension", "()I", "()Ljava/lang/String;", "annotation"})
public @interface ChecksSdkIntAtLeast {
  int api() default -1;
  
  String codename() default "";
  
  int parameter() default -1;
  
  int lambda() default -1;
  
  int extension() default 0;
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\annotation-jvm-1.8.0.jar!\androidx\annotation\ChecksSdkIntAtLeast.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */