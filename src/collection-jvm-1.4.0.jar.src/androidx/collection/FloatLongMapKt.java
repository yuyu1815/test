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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\000\n\002\020\t\n\002\b\n\032\006\020\002\032\0020\003\032\006\020\004\032\0020\003\032\026\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b\032&\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b\0326\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b\032F\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b\032V\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b2\006\020\017\032\0020\0062\006\020\020\032\0020\b\032\006\020\021\032\0020\001\032\026\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b\032&\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b\0326\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b\032F\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b\032V\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b2\006\020\017\032\0020\0062\006\020\020\032\0020\b\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\022"}, d2 = {"EmptyFloatLongMap", "Landroidx/collection/MutableFloatLongMap;", "emptyFloatLongMap", "Landroidx/collection/FloatLongMap;", "floatLongMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableFloatLongMapOf", "collection"})
/*     */ public final class FloatLongMapKt
/*     */ {
/*     */   @NotNull
/*  40 */   private static final MutableFloatLongMap EmptyFloatLongMap = new MutableFloatLongMap(0);
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final FloatLongMap emptyFloatLongMap() {
/*  45 */     return EmptyFloatLongMap;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final FloatLongMap floatLongMapOf() {
/*  50 */     return EmptyFloatLongMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final FloatLongMap floatLongMapOf(float key1, long value1) {
/*  58 */     MutableFloatLongMap mutableFloatLongMap1 = new MutableFloatLongMap(0, 1, null), map = mutableFloatLongMap1; int $i$a$-also-FloatLongMapKt$floatLongMapOf$1 = 0;
/*  59 */     map.set(key1, value1);
/*     */     return mutableFloatLongMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final FloatLongMap floatLongMapOf(float key1, long value1, float key2, long value2) {
/*  71 */     MutableFloatLongMap mutableFloatLongMap1 = new MutableFloatLongMap(0, 1, null), map = mutableFloatLongMap1; int $i$a$-also-FloatLongMapKt$floatLongMapOf$2 = 0;
/*  72 */     map.set(key1, value1);
/*  73 */     map.set(key2, value2);
/*     */     return mutableFloatLongMap1;
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
/*     */   public static final FloatLongMap floatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3) {
/*  87 */     MutableFloatLongMap mutableFloatLongMap1 = new MutableFloatLongMap(0, 1, null), map = mutableFloatLongMap1; int $i$a$-also-FloatLongMapKt$floatLongMapOf$3 = 0;
/*  88 */     map.set(key1, value1);
/*  89 */     map.set(key2, value2);
/*  90 */     map.set(key3, value3);
/*     */     return mutableFloatLongMap1;
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
/*     */   public static final FloatLongMap floatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3, float key4, long value4) {
/* 106 */     MutableFloatLongMap mutableFloatLongMap1 = new MutableFloatLongMap(0, 1, null), map = mutableFloatLongMap1; int $i$a$-also-FloatLongMapKt$floatLongMapOf$4 = 0;
/* 107 */     map.set(key1, value1);
/* 108 */     map.set(key2, value2);
/* 109 */     map.set(key3, value3);
/* 110 */     map.set(key4, value4);
/*     */     return mutableFloatLongMap1;
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
/*     */   public static final FloatLongMap floatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3, float key4, long value4, float key5, long value5) {
/* 128 */     MutableFloatLongMap mutableFloatLongMap1 = new MutableFloatLongMap(0, 1, null), map = mutableFloatLongMap1; int $i$a$-also-FloatLongMapKt$floatLongMapOf$5 = 0;
/* 129 */     map.set(key1, value1);
/* 130 */     map.set(key2, value2);
/* 131 */     map.set(key3, value3);
/* 132 */     map.set(key4, value4);
/* 133 */     map.set(key5, value5);
/*     */     return mutableFloatLongMap1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final MutableFloatLongMap mutableFloatLongMapOf() {
/* 139 */     return new MutableFloatLongMap(0, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableFloatLongMap mutableFloatLongMapOf(float key1, long value1) {
/* 147 */     MutableFloatLongMap mutableFloatLongMap1 = new MutableFloatLongMap(0, 1, null), map = mutableFloatLongMap1; int $i$a$-also-FloatLongMapKt$mutableFloatLongMapOf$1 = 0;
/* 148 */     map.set(key1, value1);
/*     */     return mutableFloatLongMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableFloatLongMap mutableFloatLongMapOf(float key1, long value1, float key2, long value2) {
/* 160 */     MutableFloatLongMap mutableFloatLongMap1 = new MutableFloatLongMap(0, 1, null), map = mutableFloatLongMap1; int $i$a$-also-FloatLongMapKt$mutableFloatLongMapOf$2 = 0;
/* 161 */     map.set(key1, value1);
/* 162 */     map.set(key2, value2);
/*     */     return mutableFloatLongMap1;
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
/*     */   public static final MutableFloatLongMap mutableFloatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3) {
/* 176 */     MutableFloatLongMap mutableFloatLongMap1 = new MutableFloatLongMap(0, 1, null), map = mutableFloatLongMap1; int $i$a$-also-FloatLongMapKt$mutableFloatLongMapOf$3 = 0;
/* 177 */     map.set(key1, value1);
/* 178 */     map.set(key2, value2);
/* 179 */     map.set(key3, value3);
/*     */     return mutableFloatLongMap1;
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
/*     */   public static final MutableFloatLongMap mutableFloatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3, float key4, long value4) {
/* 195 */     MutableFloatLongMap mutableFloatLongMap1 = new MutableFloatLongMap(0, 1, null), map = mutableFloatLongMap1; int $i$a$-also-FloatLongMapKt$mutableFloatLongMapOf$4 = 0;
/* 196 */     map.set(key1, value1);
/* 197 */     map.set(key2, value2);
/* 198 */     map.set(key3, value3);
/* 199 */     map.set(key4, value4);
/*     */     return mutableFloatLongMap1;
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
/*     */   public static final MutableFloatLongMap mutableFloatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3, float key4, long value4, float key5, long value5) {
/* 217 */     MutableFloatLongMap mutableFloatLongMap1 = new MutableFloatLongMap(0, 1, null), map = mutableFloatLongMap1; int $i$a$-also-FloatLongMapKt$mutableFloatLongMapOf$5 = 0;
/* 218 */     map.set(key1, value1);
/* 219 */     map.set(key2, value2);
/* 220 */     map.set(key3, value3);
/* 221 */     map.set(key4, value4);
/* 222 */     map.set(key5, value5);
/*     */     return mutableFloatLongMap1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\FloatLongMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */