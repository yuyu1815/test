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
@Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.ANNOTATION_CLASS})
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\020\t\n\002\b\003\b\002\030\0002\0020\001B\024\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\005R\017\020\004\032\0020\003¢\006\006\032\004\b\004\020\005¨\006\006"}, d2 = {"Landroidx/annotation/IntRange;", "", "from", "", "to", "()J", "annotation"})
public @interface IntRange {
  long from() default -9223372036854775808L;
  
  long to() default 9223372036854775807L;
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\annotation-jvm-1.8.0.jar!\androidx\annotation\IntRange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */