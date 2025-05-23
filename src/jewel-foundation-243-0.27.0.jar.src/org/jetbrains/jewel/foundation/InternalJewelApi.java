package org.jetbrains.jewel.foundation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;

@Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.TYPEALIAS, AnnotationTarget.VALUE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR})
@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\n\n\002\030\002\n\002\020\033\n\000\b\002\030\0002\0020\001B\000¨\006\002"}, d2 = {"Lorg/jetbrains/jewel/foundation/InternalJewelApi;", "", "foundation"})
@RequiresOptIn(message = "This is an internal API for Jewel and is subject to change without notice.", level = RequiresOptIn.Level.WARNING)
public @interface InternalJewelApi {}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\InternalJewelApi.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */