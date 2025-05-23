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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020\007\n\002\b\n\032\006\020\002\032\0020\003\032\006\020\004\032\0020\003\032\026\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b\032&\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b\0326\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b\032F\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b\032V\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b2\006\020\017\032\0020\0062\006\020\020\032\0020\b\032\006\020\021\032\0020\001\032\026\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b\032&\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b\0326\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b\032F\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b\032V\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b2\006\020\017\032\0020\0062\006\020\020\032\0020\b\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\022"}, d2 = {"EmptyIntFloatMap", "Landroidx/collection/MutableIntFloatMap;", "emptyIntFloatMap", "Landroidx/collection/IntFloatMap;", "intFloatMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableIntFloatMapOf", "collection"})
/*     */ public final class IntFloatMapKt
/*     */ {
/*     */   @NotNull
/*  40 */   private static final MutableIntFloatMap EmptyIntFloatMap = new MutableIntFloatMap(0);
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final IntFloatMap emptyIntFloatMap() {
/*  45 */     return EmptyIntFloatMap;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final IntFloatMap intFloatMapOf() {
/*  50 */     return EmptyIntFloatMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final IntFloatMap intFloatMapOf(int key1, float value1) {
/*  58 */     MutableIntFloatMap mutableIntFloatMap1 = new MutableIntFloatMap(0, 1, null), map = mutableIntFloatMap1; int $i$a$-also-IntFloatMapKt$intFloatMapOf$1 = 0;
/*  59 */     map.set(key1, value1);
/*     */     return mutableIntFloatMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final IntFloatMap intFloatMapOf(int key1, float value1, int key2, float value2) {
/*  71 */     MutableIntFloatMap mutableIntFloatMap1 = new MutableIntFloatMap(0, 1, null), map = mutableIntFloatMap1; int $i$a$-also-IntFloatMapKt$intFloatMapOf$2 = 0;
/*  72 */     map.set(key1, value1);
/*  73 */     map.set(key2, value2);
/*     */     return mutableIntFloatMap1;
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
/*     */   public static final IntFloatMap intFloatMapOf(int key1, float value1, int key2, float value2, int key3, float value3) {
/*  87 */     MutableIntFloatMap mutableIntFloatMap1 = new MutableIntFloatMap(0, 1, null), map = mutableIntFloatMap1; int $i$a$-also-IntFloatMapKt$intFloatMapOf$3 = 0;
/*  88 */     map.set(key1, value1);
/*  89 */     map.set(key2, value2);
/*  90 */     map.set(key3, value3);
/*     */     return mutableIntFloatMap1;
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
/*     */   public static final IntFloatMap intFloatMapOf(int key1, float value1, int key2, float value2, int key3, float value3, int key4, float value4) {
/* 106 */     MutableIntFloatMap mutableIntFloatMap1 = new MutableIntFloatMap(0, 1, null), map = mutableIntFloatMap1; int $i$a$-also-IntFloatMapKt$intFloatMapOf$4 = 0;
/* 107 */     map.set(key1, value1);
/* 108 */     map.set(key2, value2);
/* 109 */     map.set(key3, value3);
/* 110 */     map.set(key4, value4);
/*     */     return mutableIntFloatMap1;
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
/*     */   public static final IntFloatMap intFloatMapOf(int key1, float value1, int key2, float value2, int key3, float value3, int key4, float value4, int key5, float value5) {
/* 128 */     MutableIntFloatMap mutableIntFloatMap1 = new MutableIntFloatMap(0, 1, null), map = mutableIntFloatMap1; int $i$a$-also-IntFloatMapKt$intFloatMapOf$5 = 0;
/* 129 */     map.set(key1, value1);
/* 130 */     map.set(key2, value2);
/* 131 */     map.set(key3, value3);
/* 132 */     map.set(key4, value4);
/* 133 */     map.set(key5, value5);
/*     */     return mutableIntFloatMap1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final MutableIntFloatMap mutableIntFloatMapOf() {
/* 139 */     return new MutableIntFloatMap(0, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableIntFloatMap mutableIntFloatMapOf(int key1, float value1) {
/* 147 */     MutableIntFloatMap mutableIntFloatMap1 = new MutableIntFloatMap(0, 1, null), map = mutableIntFloatMap1; int $i$a$-also-IntFloatMapKt$mutableIntFloatMapOf$1 = 0;
/* 148 */     map.set(key1, value1);
/*     */     return mutableIntFloatMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableIntFloatMap mutableIntFloatMapOf(int key1, float value1, int key2, float value2) {
/* 160 */     MutableIntFloatMap mutableIntFloatMap1 = new MutableIntFloatMap(0, 1, null), map = mutableIntFloatMap1; int $i$a$-also-IntFloatMapKt$mutableIntFloatMapOf$2 = 0;
/* 161 */     map.set(key1, value1);
/* 162 */     map.set(key2, value2);
/*     */     return mutableIntFloatMap1;
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
/*     */   public static final MutableIntFloatMap mutableIntFloatMapOf(int key1, float value1, int key2, float value2, int key3, float value3) {
/* 176 */     MutableIntFloatMap mutableIntFloatMap1 = new MutableIntFloatMap(0, 1, null), map = mutableIntFloatMap1; int $i$a$-also-IntFloatMapKt$mutableIntFloatMapOf$3 = 0;
/* 177 */     map.set(key1, value1);
/* 178 */     map.set(key2, value2);
/* 179 */     map.set(key3, value3);
/*     */     return mutableIntFloatMap1;
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
/*     */   public static final MutableIntFloatMap mutableIntFloatMapOf(int key1, float value1, int key2, float value2, int key3, float value3, int key4, float value4) {
/* 195 */     MutableIntFloatMap mutableIntFloatMap1 = new MutableIntFloatMap(0, 1, null), map = mutableIntFloatMap1; int $i$a$-also-IntFloatMapKt$mutableIntFloatMapOf$4 = 0;
/* 196 */     map.set(key1, value1);
/* 197 */     map.set(key2, value2);
/* 198 */     map.set(key3, value3);
/* 199 */     map.set(key4, value4);
/*     */     return mutableIntFloatMap1;
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
/*     */   public static final MutableIntFloatMap mutableIntFloatMapOf(int key1, float value1, int key2, float value2, int key3, float value3, int key4, float value4, int key5, float value5) {
/* 217 */     MutableIntFloatMap mutableIntFloatMap1 = new MutableIntFloatMap(0, 1, null), map = mutableIntFloatMap1; int $i$a$-also-IntFloatMapKt$mutableIntFloatMapOf$5 = 0;
/* 218 */     map.set(key1, value1);
/* 219 */     map.set(key2, value2);
/* 220 */     map.set(key3, value3);
/* 221 */     map.set(key4, value4);
/* 222 */     map.set(key5, value5);
/*     */     return mutableIntFloatMap1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\IntFloatMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */