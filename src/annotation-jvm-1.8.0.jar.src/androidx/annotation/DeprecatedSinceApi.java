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
@Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.CONSTRUCTOR})
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\b\002\030\0002\0020\001B\022\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\006R\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\007¨\006\b"}, d2 = {"Landroidx/annotation/DeprecatedSinceApi;", "", "api", "", "message", "", "()I", "()Ljava/lang/String;", "annotation"})
public @interface DeprecatedSinceApi {
  int api();
  
  String message() default "";
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\annotation-jvm-1.8.0.jar!\androidx\annotation\DeprecatedSinceApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */