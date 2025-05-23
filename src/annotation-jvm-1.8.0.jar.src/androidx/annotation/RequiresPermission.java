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
@Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\021\n\002\b\002\n\002\020\013\n\002\b\006\b\002\030\0002\0020\001:\002\f\rB4\022\b\b\002\020\002\032\0020\003\022\016\b\002\020\004\032\b\022\004\022\0020\0030\005\022\016\b\002\020\006\032\b\022\004\022\0020\0030\005\022\b\b\002\020\007\032\0020\bR\025\020\004\032\b\022\004\022\0020\0030\005¢\006\006\032\004\b\004\020\tR\025\020\006\032\b\022\004\022\0020\0030\005¢\006\006\032\004\b\006\020\tR\017\020\007\032\0020\b¢\006\006\032\004\b\007\020\nR\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\013¨\006\016"}, d2 = {"Landroidx/annotation/RequiresPermission;", "", "value", "", "allOf", "", "anyOf", "conditional", "", "()[Ljava/lang/String;", "()Z", "()Ljava/lang/String;", "Read", "Write", "annotation"})
public @interface RequiresPermission {
  String value() default "";
  
  String[] allOf() default {};
  
  String[] anyOf() default {};
  
  boolean conditional() default false;
  
  @Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER})
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
  @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\n\022\b\b\002\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004¨\006\005"}, d2 = {"Landroidx/annotation/RequiresPermission$Read;", "", "value", "Landroidx/annotation/RequiresPermission;", "()Landroidx/annotation/RequiresPermission;", "annotation"})
  public static @interface Read {
    RequiresPermission value() default @RequiresPermission;
  }
  
  @Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER})
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
  @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\n\022\b\b\002\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004¨\006\005"}, d2 = {"Landroidx/annotation/RequiresPermission$Write;", "", "value", "Landroidx/annotation/RequiresPermission;", "()Landroidx/annotation/RequiresPermission;", "annotation"})
  public static @interface Write {
    RequiresPermission value() default @RequiresPermission;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\annotation-jvm-1.8.0.jar!\androidx\annotation\RequiresPermission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */