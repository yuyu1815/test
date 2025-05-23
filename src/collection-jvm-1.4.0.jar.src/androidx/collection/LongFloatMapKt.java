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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\020\007\n\002\b\n\032\006\020\002\032\0020\003\032\006\020\004\032\0020\003\032\026\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b\032&\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b\0326\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b\032F\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b\032V\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b2\006\020\017\032\0020\0062\006\020\020\032\0020\b\032\006\020\021\032\0020\001\032\026\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b\032&\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b\0326\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b\032F\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b\032V\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b2\006\020\017\032\0020\0062\006\020\020\032\0020\b\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\022"}, d2 = {"EmptyLongFloatMap", "Landroidx/collection/MutableLongFloatMap;", "emptyLongFloatMap", "Landroidx/collection/LongFloatMap;", "longFloatMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableLongFloatMapOf", "collection"})
/*     */ public final class LongFloatMapKt
/*     */ {
/*     */   @NotNull
/*  40 */   private static final MutableLongFloatMap EmptyLongFloatMap = new MutableLongFloatMap(0);
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final LongFloatMap emptyLongFloatMap() {
/*  45 */     return EmptyLongFloatMap;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final LongFloatMap longFloatMapOf() {
/*  50 */     return EmptyLongFloatMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final LongFloatMap longFloatMapOf(long key1, float value1) {
/*  58 */     MutableLongFloatMap mutableLongFloatMap1 = new MutableLongFloatMap(0, 1, null), map = mutableLongFloatMap1; int $i$a$-also-LongFloatMapKt$longFloatMapOf$1 = 0;
/*  59 */     map.set(key1, value1);
/*     */     return mutableLongFloatMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final LongFloatMap longFloatMapOf(long key1, float value1, long key2, float value2) {
/*  71 */     MutableLongFloatMap mutableLongFloatMap1 = new MutableLongFloatMap(0, 1, null), map = mutableLongFloatMap1; int $i$a$-also-LongFloatMapKt$longFloatMapOf$2 = 0;
/*  72 */     map.set(key1, value1);
/*  73 */     map.set(key2, value2);
/*     */     return mutableLongFloatMap1;
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
/*     */   public static final LongFloatMap longFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3) {
/*  87 */     MutableLongFloatMap mutableLongFloatMap1 = new MutableLongFloatMap(0, 1, null), map = mutableLongFloatMap1; int $i$a$-also-LongFloatMapKt$longFloatMapOf$3 = 0;
/*  88 */     map.set(key1, value1);
/*  89 */     map.set(key2, value2);
/*  90 */     map.set(key3, value3);
/*     */     return mutableLongFloatMap1;
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
/*     */   public static final LongFloatMap longFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3, long key4, float value4) {
/* 106 */     MutableLongFloatMap mutableLongFloatMap1 = new MutableLongFloatMap(0, 1, null), map = mutableLongFloatMap1; int $i$a$-also-LongFloatMapKt$longFloatMapOf$4 = 0;
/* 107 */     map.set(key1, value1);
/* 108 */     map.set(key2, value2);
/* 109 */     map.set(key3, value3);
/* 110 */     map.set(key4, value4);
/*     */     return mutableLongFloatMap1;
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
/*     */   public static final LongFloatMap longFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3, long key4, float value4, long key5, float value5) {
/* 128 */     MutableLongFloatMap mutableLongFloatMap1 = new MutableLongFloatMap(0, 1, null), map = mutableLongFloatMap1; int $i$a$-also-LongFloatMapKt$longFloatMapOf$5 = 0;
/* 129 */     map.set(key1, value1);
/* 130 */     map.set(key2, value2);
/* 131 */     map.set(key3, value3);
/* 132 */     map.set(key4, value4);
/* 133 */     map.set(key5, value5);
/*     */     return mutableLongFloatMap1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final MutableLongFloatMap mutableLongFloatMapOf() {
/* 139 */     return new MutableLongFloatMap(0, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableLongFloatMap mutableLongFloatMapOf(long key1, float value1) {
/* 147 */     MutableLongFloatMap mutableLongFloatMap1 = new MutableLongFloatMap(0, 1, null), map = mutableLongFloatMap1; int $i$a$-also-LongFloatMapKt$mutableLongFloatMapOf$1 = 0;
/* 148 */     map.set(key1, value1);
/*     */     return mutableLongFloatMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableLongFloatMap mutableLongFloatMapOf(long key1, float value1, long key2, float value2) {
/* 160 */     MutableLongFloatMap mutableLongFloatMap1 = new MutableLongFloatMap(0, 1, null), map = mutableLongFloatMap1; int $i$a$-also-LongFloatMapKt$mutableLongFloatMapOf$2 = 0;
/* 161 */     map.set(key1, value1);
/* 162 */     map.set(key2, value2);
/*     */     return mutableLongFloatMap1;
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
/*     */   public static final MutableLongFloatMap mutableLongFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3) {
/* 176 */     MutableLongFloatMap mutableLongFloatMap1 = new MutableLongFloatMap(0, 1, null), map = mutableLongFloatMap1; int $i$a$-also-LongFloatMapKt$mutableLongFloatMapOf$3 = 0;
/* 177 */     map.set(key1, value1);
/* 178 */     map.set(key2, value2);
/* 179 */     map.set(key3, value3);
/*     */     return mutableLongFloatMap1;
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
/*     */   public static final MutableLongFloatMap mutableLongFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3, long key4, float value4) {
/* 195 */     MutableLongFloatMap mutableLongFloatMap1 = new MutableLongFloatMap(0, 1, null), map = mutableLongFloatMap1; int $i$a$-also-LongFloatMapKt$mutableLongFloatMapOf$4 = 0;
/* 196 */     map.set(key1, value1);
/* 197 */     map.set(key2, value2);
/* 198 */     map.set(key3, value3);
/* 199 */     map.set(key4, value4);
/*     */     return mutableLongFloatMap1;
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
/*     */   public static final MutableLongFloatMap mutableLongFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3, long key4, float value4, long key5, float value5) {
/* 217 */     MutableLongFloatMap mutableLongFloatMap1 = new MutableLongFloatMap(0, 1, null), map = mutableLongFloatMap1; int $i$a$-also-LongFloatMapKt$mutableLongFloatMapOf$5 = 0;
/* 218 */     map.set(key1, value1);
/* 219 */     map.set(key2, value2);
/* 220 */     map.set(key3, value3);
/* 221 */     map.set(key4, value4);
/* 222 */     map.set(key5, value5);
/*     */     return mutableLongFloatMap1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\LongFloatMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */