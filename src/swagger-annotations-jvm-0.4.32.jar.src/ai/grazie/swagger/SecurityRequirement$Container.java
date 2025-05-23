package ai.grazie.swagger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.internal.RepeatableContainer;

@Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(AnnotationRetention.RUNTIME)
@RepeatableContainer
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
public @interface Container {
  SecurityRequirement[] value();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\swagger-annotations-jvm-0.4.32.jar!\ai\grazie\swagger\SecurityRequirement$Container.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */