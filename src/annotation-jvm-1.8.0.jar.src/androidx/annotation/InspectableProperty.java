/*     */ package androidx.annotation;
/*     */ 
/*     */ import java.lang.annotation.ElementType;
/*     */ import java.lang.annotation.Retention;
/*     */ import java.lang.annotation.RetentionPolicy;
/*     */ import java.lang.annotation.Target;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.annotation.AnnotationRetention;
/*     */ import kotlin.annotation.AnnotationTarget;
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
/*     */ @Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
/*     */ @Retention(AnnotationRetention.SOURCE)
/*     */ @Deprecated(message = "Replaced by the androidx.resourceinpsection package.")
/*     */ @Retention(RetentionPolicy.SOURCE)
/*     */ @Target({ElementType.METHOD})
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\n\b\002\030\0002\0020\001:\003\025\026\027BH\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t\022\016\b\002\020\n\032\b\022\004\022\0020\f0\013\022\016\b\002\020\r\032\b\022\004\022\0020\0160\013R\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\017R\025\020\n\032\b\022\004\022\0020\f0\013¢\006\006\032\004\b\n\020\020R\025\020\r\032\b\022\004\022\0020\0160\013¢\006\006\032\004\b\r\020\021R\017\020\006\032\0020\007¢\006\006\032\004\b\006\020\022R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\023R\017\020\b\032\0020\t¢\006\006\032\004\b\b\020\024¨\006\030"}, d2 = {"Landroidx/annotation/InspectableProperty;", "", "name", "", "attributeId", "", "hasAttributeId", "", "valueType", "Landroidx/annotation/InspectableProperty$ValueType;", "enumMapping", "", "Landroidx/annotation/InspectableProperty$EnumEntry;", "flagMapping", "Landroidx/annotation/InspectableProperty$FlagEntry;", "()I", "()[Landroidx/annotation/InspectableProperty$EnumEntry;", "()[Landroidx/annotation/InspectableProperty$FlagEntry;", "()Z", "()Ljava/lang/String;", "()Landroidx/annotation/InspectableProperty$ValueType;", "EnumEntry", "FlagEntry", "ValueType", "annotation"})
/*     */ public @interface InspectableProperty
/*     */ {
/*     */   String name() default "";
/*     */   
/*     */   int attributeId() default 0;
/*     */   
/*     */   boolean hasAttributeId() default true;
/*     */   
/*     */   ValueType valueType() default ValueType.INFERRED;
/*     */   
/*     */   EnumEntry[] enumMapping() default {};
/*     */   
/*     */   FlagEntry[] flagMapping() default {};
/*     */   
/*     */   @Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
/*     */   @Retention(AnnotationRetention.SOURCE)
/*     */   @Retention(RetentionPolicy.SOURCE)
/*     */   @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\003\b\002\030\0002\0020\001B\020\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\006R\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\007¨\006\b"}, d2 = {"Landroidx/annotation/InspectableProperty$EnumEntry;", "", "name", "", "value", "", "()Ljava/lang/String;", "()I", "annotation"})
/*     */   public static @interface EnumEntry
/*     */   {
/*     */     String name();
/*     */     
/*     */     int value();
/*     */   }
/*     */   
/*     */   @Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
/*     */   @Retention(AnnotationRetention.SOURCE)
/*     */   @Retention(RetentionPolicy.SOURCE)
/*     */   @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\004\b\002\030\0002\0020\001B\032\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005R\017\020\006\032\0020\005¢\006\006\032\004\b\006\020\007R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\bR\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\007¨\006\t"}, d2 = {"Landroidx/annotation/InspectableProperty$FlagEntry;", "", "name", "", "target", "", "mask", "()I", "()Ljava/lang/String;", "annotation"})
/*     */   public static @interface FlagEntry
/*     */   {
/*     */     String name();
/*     */     
/*     */     int target();
/*     */     
/*     */     int mask() default 0;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\t\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\t¨\006\n"}, d2 = {"Landroidx/annotation/InspectableProperty$ValueType;", "", "(Ljava/lang/String;I)V", "NONE", "INFERRED", "INT_ENUM", "INT_FLAG", "COLOR", "GRAVITY", "RESOURCE_ID", "annotation"})
/*     */   public enum ValueType
/*     */   {
/* 131 */     NONE,
/*     */ 
/*     */     
/* 134 */     INFERRED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     INT_ENUM,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     INT_FLAG,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     COLOR,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 166 */     GRAVITY,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 173 */     RESOURCE_ID;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\annotation-jvm-1.8.0.jar!\androidx\annotation\InspectableProperty.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */