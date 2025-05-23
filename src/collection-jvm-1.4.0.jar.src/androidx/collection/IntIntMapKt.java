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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\013\032\006\020\002\032\0020\003\032\006\020\004\032\0020\003\032\026\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\006\032&\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\006\0326\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\006\032F\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\0062\006\020\r\032\0020\006\032V\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\0062\006\020\r\032\0020\0062\006\020\016\032\0020\0062\006\020\017\032\0020\006\032\006\020\020\032\0020\001\032\026\020\020\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\006\032&\020\020\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\006\0326\020\020\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\006\032F\020\020\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\0062\006\020\r\032\0020\006\032V\020\020\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\0062\006\020\b\032\0020\0062\006\020\t\032\0020\0062\006\020\n\032\0020\0062\006\020\013\032\0020\0062\006\020\f\032\0020\0062\006\020\r\032\0020\0062\006\020\016\032\0020\0062\006\020\017\032\0020\006\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\021"}, d2 = {"EmptyIntIntMap", "Landroidx/collection/MutableIntIntMap;", "emptyIntIntMap", "Landroidx/collection/IntIntMap;", "intIntMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableIntIntMapOf", "collection"})
/*     */ public final class IntIntMapKt
/*     */ {
/*     */   @NotNull
/*  40 */   private static final MutableIntIntMap EmptyIntIntMap = new MutableIntIntMap(0);
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final IntIntMap emptyIntIntMap() {
/*  45 */     return EmptyIntIntMap;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final IntIntMap intIntMapOf() {
/*  50 */     return EmptyIntIntMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final IntIntMap intIntMapOf(int key1, int value1) {
/*  58 */     MutableIntIntMap mutableIntIntMap1 = new MutableIntIntMap(0, 1, null), map = mutableIntIntMap1; int $i$a$-also-IntIntMapKt$intIntMapOf$1 = 0;
/*  59 */     map.set(key1, value1);
/*     */     return mutableIntIntMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final IntIntMap intIntMapOf(int key1, int value1, int key2, int value2) {
/*  71 */     MutableIntIntMap mutableIntIntMap1 = new MutableIntIntMap(0, 1, null), map = mutableIntIntMap1; int $i$a$-also-IntIntMapKt$intIntMapOf$2 = 0;
/*  72 */     map.set(key1, value1);
/*  73 */     map.set(key2, value2);
/*     */     return mutableIntIntMap1;
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
/*     */   public static final IntIntMap intIntMapOf(int key1, int value1, int key2, int value2, int key3, int value3) {
/*  87 */     MutableIntIntMap mutableIntIntMap1 = new MutableIntIntMap(0, 1, null), map = mutableIntIntMap1; int $i$a$-also-IntIntMapKt$intIntMapOf$3 = 0;
/*  88 */     map.set(key1, value1);
/*  89 */     map.set(key2, value2);
/*  90 */     map.set(key3, value3);
/*     */     return mutableIntIntMap1;
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
/*     */   public static final IntIntMap intIntMapOf(int key1, int value1, int key2, int value2, int key3, int value3, int key4, int value4) {
/* 106 */     MutableIntIntMap mutableIntIntMap1 = new MutableIntIntMap(0, 1, null), map = mutableIntIntMap1; int $i$a$-also-IntIntMapKt$intIntMapOf$4 = 0;
/* 107 */     map.set(key1, value1);
/* 108 */     map.set(key2, value2);
/* 109 */     map.set(key3, value3);
/* 110 */     map.set(key4, value4);
/*     */     return mutableIntIntMap1;
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
/*     */   public static final IntIntMap intIntMapOf(int key1, int value1, int key2, int value2, int key3, int value3, int key4, int value4, int key5, int value5) {
/* 128 */     MutableIntIntMap mutableIntIntMap1 = new MutableIntIntMap(0, 1, null), map = mutableIntIntMap1; int $i$a$-also-IntIntMapKt$intIntMapOf$5 = 0;
/* 129 */     map.set(key1, value1);
/* 130 */     map.set(key2, value2);
/* 131 */     map.set(key3, value3);
/* 132 */     map.set(key4, value4);
/* 133 */     map.set(key5, value5);
/*     */     return mutableIntIntMap1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final MutableIntIntMap mutableIntIntMapOf() {
/* 139 */     return new MutableIntIntMap(0, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableIntIntMap mutableIntIntMapOf(int key1, int value1) {
/* 147 */     MutableIntIntMap mutableIntIntMap1 = new MutableIntIntMap(0, 1, null), map = mutableIntIntMap1; int $i$a$-also-IntIntMapKt$mutableIntIntMapOf$1 = 0;
/* 148 */     map.set(key1, value1);
/*     */     return mutableIntIntMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableIntIntMap mutableIntIntMapOf(int key1, int value1, int key2, int value2) {
/* 160 */     MutableIntIntMap mutableIntIntMap1 = new MutableIntIntMap(0, 1, null), map = mutableIntIntMap1; int $i$a$-also-IntIntMapKt$mutableIntIntMapOf$2 = 0;
/* 161 */     map.set(key1, value1);
/* 162 */     map.set(key2, value2);
/*     */     return mutableIntIntMap1;
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
/*     */   public static final MutableIntIntMap mutableIntIntMapOf(int key1, int value1, int key2, int value2, int key3, int value3) {
/* 176 */     MutableIntIntMap mutableIntIntMap1 = new MutableIntIntMap(0, 1, null), map = mutableIntIntMap1; int $i$a$-also-IntIntMapKt$mutableIntIntMapOf$3 = 0;
/* 177 */     map.set(key1, value1);
/* 178 */     map.set(key2, value2);
/* 179 */     map.set(key3, value3);
/*     */     return mutableIntIntMap1;
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
/*     */   public static final MutableIntIntMap mutableIntIntMapOf(int key1, int value1, int key2, int value2, int key3, int value3, int key4, int value4) {
/* 195 */     MutableIntIntMap mutableIntIntMap1 = new MutableIntIntMap(0, 1, null), map = mutableIntIntMap1; int $i$a$-also-IntIntMapKt$mutableIntIntMapOf$4 = 0;
/* 196 */     map.set(key1, value1);
/* 197 */     map.set(key2, value2);
/* 198 */     map.set(key3, value3);
/* 199 */     map.set(key4, value4);
/*     */     return mutableIntIntMap1;
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
/*     */   public static final MutableIntIntMap mutableIntIntMapOf(int key1, int value1, int key2, int value2, int key3, int value3, int key4, int value4, int key5, int value5) {
/* 217 */     MutableIntIntMap mutableIntIntMap1 = new MutableIntIntMap(0, 1, null), map = mutableIntIntMap1; int $i$a$-also-IntIntMapKt$mutableIntIntMapOf$5 = 0;
/* 218 */     map.set(key1, value1);
/* 219 */     map.set(key2, value2);
/* 220 */     map.set(key3, value3);
/* 221 */     map.set(key4, value4);
/* 222 */     map.set(key5, value5);
/*     */     return mutableIntIntMap1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\IntIntMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */