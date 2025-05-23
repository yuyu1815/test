/*     */ package androidx.annotation;
/*     */ 
/*     */ import java.lang.annotation.Documented;
/*     */ import java.lang.annotation.ElementType;
/*     */ import java.lang.annotation.Retention;
/*     */ import java.lang.annotation.RetentionPolicy;
/*     */ import java.lang.annotation.Target;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.annotation.AnnotationRetention;
/*     */ import kotlin.annotation.AnnotationTarget;
/*     */ import kotlin.annotation.MustBeDocumented;
/*     */ import kotlin.annotation.Retention;
/*     */ import kotlin.annotation.Target;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @MustBeDocumented
/*     */ @Retention(AnnotationRetention.BINARY)
/*     */ @Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD, AnnotationTarget.FILE})
/*     */ @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
/*     */ @Documented
/*     */ @Retention(RetentionPolicy.CLASS)
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\033\n\000\n\002\020\021\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001:\001\006B\024\022\022\020\002\032\n\022\006\b\001\022\0020\0040\003\"\0020\004R\027\020\002\032\n\022\006\b\001\022\0020\0040\003¢\006\006\032\004\b\002\020\005¨\006\007"}, d2 = {"Landroidx/annotation/RestrictTo;", "", "value", "", "Landroidx/annotation/RestrictTo$Scope;", "()[Landroidx/annotation/RestrictTo$Scope;", "Scope", "annotation"})
/*     */ public @interface RestrictTo
/*     */ {
/*     */   Scope[] value();
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\b\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\b¨\006\t"}, d2 = {"Landroidx/annotation/RestrictTo$Scope;", "", "(Ljava/lang/String;I)V", "LIBRARY", "LIBRARY_GROUP", "LIBRARY_GROUP_PREFIX", "GROUP_ID", "TESTS", "SUBCLASSES", "annotation"})
/*     */   public enum Scope
/*     */   {
/*  77 */     LIBRARY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     LIBRARY_GROUP,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     LIBRARY_GROUP_PREFIX,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     GROUP_ID,
/*     */ 
/*     */     
/* 104 */     TESTS,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     SUBCLASSES;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\annotation-jvm-1.8.0.jar!\androidx\annotation\RestrictTo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */