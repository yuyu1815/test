/*     */ package androidx.collection;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\013\032\006\020\002\032\0020\003\032\006\020\004\032\0020\003\032\026\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\006\032&\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\006\0326\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\006\032F\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\0062\006\020\r\032\0020\006\032V\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\0062\006\020\r\032\0020\0062\006\020\016\032\0020\0062\006\020\017\032\0020\006\032\006\020\020\032\0020\001\032\026\020\020\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\006\032&\020\020\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\006\0326\020\020\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\006\032F\020\020\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\0062\006\020\r\032\0020\006\032V\020\020\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\0062\006\020\r\032\0020\0062\006\020\016\032\0020\0062\006\020\017\032\0020\006\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\021"}, d2 = {"EmptyFloatFloatMap", "Landroidx/collection/MutableFloatFloatMap;", "emptyFloatFloatMap", "Landroidx/collection/FloatFloatMap;", "floatFloatMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableFloatFloatMapOf", "collection"})
/*     */ public final class FloatFloatMapKt
/*     */ {
/*     */   @NotNull
/*  40 */   private static final MutableFloatFloatMap EmptyFloatFloatMap = new MutableFloatFloatMap(0);
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final FloatFloatMap emptyFloatFloatMap() {
/*  45 */     return EmptyFloatFloatMap;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final FloatFloatMap floatFloatMapOf() {
/*  50 */     return EmptyFloatFloatMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final FloatFloatMap floatFloatMapOf(float key1, float value1) {
/*  58 */     MutableFloatFloatMap mutableFloatFloatMap1 = new MutableFloatFloatMap(0, 1, null), map = mutableFloatFloatMap1; int $i$a$-also-FloatFloatMapKt$floatFloatMapOf$1 = 0;
/*  59 */     map.set(key1, value1);
/*     */     return mutableFloatFloatMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final FloatFloatMap floatFloatMapOf(float key1, float value1, float key2, float value2) {
/*  71 */     MutableFloatFloatMap mutableFloatFloatMap1 = new MutableFloatFloatMap(0, 1, null), map = mutableFloatFloatMap1; int $i$a$-also-FloatFloatMapKt$floatFloatMapOf$2 = 0;
/*  72 */     map.set(key1, value1);
/*  73 */     map.set(key2, value2);
/*     */     return mutableFloatFloatMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final FloatFloatMap floatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3) {
/*  87 */     MutableFloatFloatMap mutableFloatFloatMap1 = new MutableFloatFloatMap(0, 1, null), map = mutableFloatFloatMap1; int $i$a$-also-FloatFloatMapKt$floatFloatMapOf$3 = 0;
/*  88 */     map.set(key1, value1);
/*  89 */     map.set(key2, value2);
/*  90 */     map.set(key3, value3);
/*     */     return mutableFloatFloatMap1;
/*     */   }
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
/*     */   @NotNull
/*     */   public static final FloatFloatMap floatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3, float key4, float value4) {
/* 106 */     MutableFloatFloatMap mutableFloatFloatMap1 = new MutableFloatFloatMap(0, 1, null), map = mutableFloatFloatMap1; int $i$a$-also-FloatFloatMapKt$floatFloatMapOf$4 = 0;
/* 107 */     map.set(key1, value1);
/* 108 */     map.set(key2, value2);
/* 109 */     map.set(key3, value3);
/* 110 */     map.set(key4, value4);
/*     */     return mutableFloatFloatMap1;
/*     */   }
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
/*     */   @NotNull
/*     */   public static final FloatFloatMap floatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3, float key4, float value4, float key5, float value5) {
/* 128 */     MutableFloatFloatMap mutableFloatFloatMap1 = new MutableFloatFloatMap(0, 1, null), map = mutableFloatFloatMap1; int $i$a$-also-FloatFloatMapKt$floatFloatMapOf$5 = 0;
/* 129 */     map.set(key1, value1);
/* 130 */     map.set(key2, value2);
/* 131 */     map.set(key3, value3);
/* 132 */     map.set(key4, value4);
/* 133 */     map.set(key5, value5);
/*     */     return mutableFloatFloatMap1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final MutableFloatFloatMap mutableFloatFloatMapOf() {
/* 139 */     return new MutableFloatFloatMap(0, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableFloatFloatMap mutableFloatFloatMapOf(float key1, float value1) {
/* 147 */     MutableFloatFloatMap mutableFloatFloatMap1 = new MutableFloatFloatMap(0, 1, null), map = mutableFloatFloatMap1; int $i$a$-also-FloatFloatMapKt$mutableFloatFloatMapOf$1 = 0;
/* 148 */     map.set(key1, value1);
/*     */     return mutableFloatFloatMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableFloatFloatMap mutableFloatFloatMapOf(float key1, float value1, float key2, float value2) {
/* 160 */     MutableFloatFloatMap mutableFloatFloatMap1 = new MutableFloatFloatMap(0, 1, null), map = mutableFloatFloatMap1; int $i$a$-also-FloatFloatMapKt$mutableFloatFloatMapOf$2 = 0;
/* 161 */     map.set(key1, value1);
/* 162 */     map.set(key2, value2);
/*     */     return mutableFloatFloatMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableFloatFloatMap mutableFloatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3) {
/* 176 */     MutableFloatFloatMap mutableFloatFloatMap1 = new MutableFloatFloatMap(0, 1, null), map = mutableFloatFloatMap1; int $i$a$-also-FloatFloatMapKt$mutableFloatFloatMapOf$3 = 0;
/* 177 */     map.set(key1, value1);
/* 178 */     map.set(key2, value2);
/* 179 */     map.set(key3, value3);
/*     */     return mutableFloatFloatMap1;
/*     */   }
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
/*     */   @NotNull
/*     */   public static final MutableFloatFloatMap mutableFloatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3, float key4, float value4) {
/* 195 */     MutableFloatFloatMap mutableFloatFloatMap1 = new MutableFloatFloatMap(0, 1, null), map = mutableFloatFloatMap1; int $i$a$-also-FloatFloatMapKt$mutableFloatFloatMapOf$4 = 0;
/* 196 */     map.set(key1, value1);
/* 197 */     map.set(key2, value2);
/* 198 */     map.set(key3, value3);
/* 199 */     map.set(key4, value4);
/*     */     return mutableFloatFloatMap1;
/*     */   }
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
/*     */   @NotNull
/*     */   public static final MutableFloatFloatMap mutableFloatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3, float key4, float value4, float key5, float value5) {
/* 217 */     MutableFloatFloatMap mutableFloatFloatMap1 = new MutableFloatFloatMap(0, 1, null), map = mutableFloatFloatMap1; int $i$a$-also-FloatFloatMapKt$mutableFloatFloatMapOf$5 = 0;
/* 218 */     map.set(key1, value1);
/* 219 */     map.set(key2, value2);
/* 220 */     map.set(key3, value3);
/* 221 */     map.set(key4, value4);
/* 222 */     map.set(key5, value5);
/*     */     return mutableFloatFloatMap1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\FloatFloatMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */