package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;

@Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.FIELD, AnnotationTarget.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\021\n\002\b\003\b\002\030\0002\0020\001B\036\022\006\020\002\032\0020\003\022\024\b\002\020\004\032\n\022\006\b\001\022\0020\0030\005\"\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\006R\027\020\004\032\n\022\006\b\001\022\0020\0030\005¢\006\006\032\004\b\004\020\007¨\006\b"}, d2 = {"Landroidx/annotation/ReplaceWith;", "", "expression", "", "imports", "", "()Ljava/lang/String;", "()[Ljava/lang/String;", "annotation"})
public @interface ReplaceWith {
  String expression();
  
  String[] imports() default {};
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\annotation-jvm-1.8.0.jar!\androidx\annotation\ReplaceWith.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */