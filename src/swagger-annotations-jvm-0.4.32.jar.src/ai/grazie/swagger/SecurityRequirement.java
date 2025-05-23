package ai.grazie.swagger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Repeatable;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.internal.RepeatableContainer;

@Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(AnnotationRetention.RUNTIME)
@Repeatable
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Repeatable(SecurityRequirement.Container.class)
@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\021\n\002\b\003\b\002\030\0002\0020\001B\030\022\006\020\002\032\0020\003\022\016\b\002\020\004\032\b\022\004\022\0020\0030\005R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\006R\025\020\004\032\b\022\004\022\0020\0030\005¢\006\006\032\004\b\004\020\007¨\006\b"}, d2 = {"Lai/grazie/swagger/SecurityRequirement;", "", "name", "", "scopes", "", "()Ljava/lang/String;", "()[Ljava/lang/String;", "swagger-annotations"})
public @interface SecurityRequirement {
  String name();
  
  String[] scopes() default {};
  
  @Target(allowedTargets = {AnnotationTarget.CLASS})
  @Retention(AnnotationRetention.RUNTIME)
  @RepeatableContainer
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.TYPE})
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  public static @interface Container {
    SecurityRequirement[] value();
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\swagger-annotations-jvm-0.4.32.jar!\ai\grazie\swagger\SecurityRequirement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */