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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020\t\n\002\b\n\032\006\020\002\032\0020\003\032\006\020\004\032\0020\003\032\026\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b\032&\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b\0326\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b\032F\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b\032V\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b2\006\020\017\032\0020\0062\006\020\020\032\0020\b\032\006\020\021\032\0020\001\032\026\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b\032&\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b\0326\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b\032F\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b\032V\020\021\032\0020\0012\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b2\006\020\013\032\0020\0062\006\020\f\032\0020\b2\006\020\r\032\0020\0062\006\020\016\032\0020\b2\006\020\017\032\0020\0062\006\020\020\032\0020\b\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\022"}, d2 = {"EmptyIntLongMap", "Landroidx/collection/MutableIntLongMap;", "emptyIntLongMap", "Landroidx/collection/IntLongMap;", "intLongMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableIntLongMapOf", "collection"})
/*     */ public final class IntLongMapKt
/*     */ {
/*     */   @NotNull
/*  40 */   private static final MutableIntLongMap EmptyIntLongMap = new MutableIntLongMap(0);
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final IntLongMap emptyIntLongMap() {
/*  45 */     return EmptyIntLongMap;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final IntLongMap intLongMapOf() {
/*  50 */     return EmptyIntLongMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final IntLongMap intLongMapOf(int key1, long value1) {
/*  58 */     MutableIntLongMap mutableIntLongMap1 = new MutableIntLongMap(0, 1, null), map = mutableIntLongMap1; int $i$a$-also-IntLongMapKt$intLongMapOf$1 = 0;
/*  59 */     map.set(key1, value1);
/*     */     return mutableIntLongMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final IntLongMap intLongMapOf(int key1, long value1, int key2, long value2) {
/*  71 */     MutableIntLongMap mutableIntLongMap1 = new MutableIntLongMap(0, 1, null), map = mutableIntLongMap1; int $i$a$-also-IntLongMapKt$intLongMapOf$2 = 0;
/*  72 */     map.set(key1, value1);
/*  73 */     map.set(key2, value2);
/*     */     return mutableIntLongMap1;
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
/*     */   public static final IntLongMap intLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3) {
/*  87 */     MutableIntLongMap mutableIntLongMap1 = new MutableIntLongMap(0, 1, null), map = mutableIntLongMap1; int $i$a$-also-IntLongMapKt$intLongMapOf$3 = 0;
/*  88 */     map.set(key1, value1);
/*  89 */     map.set(key2, value2);
/*  90 */     map.set(key3, value3);
/*     */     return mutableIntLongMap1;
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
/*     */   public static final IntLongMap intLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3, int key4, long value4) {
/* 106 */     MutableIntLongMap mutableIntLongMap1 = new MutableIntLongMap(0, 1, null), map = mutableIntLongMap1; int $i$a$-also-IntLongMapKt$intLongMapOf$4 = 0;
/* 107 */     map.set(key1, value1);
/* 108 */     map.set(key2, value2);
/* 109 */     map.set(key3, value3);
/* 110 */     map.set(key4, value4);
/*     */     return mutableIntLongMap1;
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
/*     */   public static final IntLongMap intLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3, int key4, long value4, int key5, long value5) {
/* 128 */     MutableIntLongMap mutableIntLongMap1 = new MutableIntLongMap(0, 1, null), map = mutableIntLongMap1; int $i$a$-also-IntLongMapKt$intLongMapOf$5 = 0;
/* 129 */     map.set(key1, value1);
/* 130 */     map.set(key2, value2);
/* 131 */     map.set(key3, value3);
/* 132 */     map.set(key4, value4);
/* 133 */     map.set(key5, value5);
/*     */     return mutableIntLongMap1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final MutableIntLongMap mutableIntLongMapOf() {
/* 139 */     return new MutableIntLongMap(0, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableIntLongMap mutableIntLongMapOf(int key1, long value1) {
/* 147 */     MutableIntLongMap mutableIntLongMap1 = new MutableIntLongMap(0, 1, null), map = mutableIntLongMap1; int $i$a$-also-IntLongMapKt$mutableIntLongMapOf$1 = 0;
/* 148 */     map.set(key1, value1);
/*     */     return mutableIntLongMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final MutableIntLongMap mutableIntLongMapOf(int key1, long value1, int key2, long value2) {
/* 160 */     MutableIntLongMap mutableIntLongMap1 = new MutableIntLongMap(0, 1, null), map = mutableIntLongMap1; int $i$a$-also-IntLongMapKt$mutableIntLongMapOf$2 = 0;
/* 161 */     map.set(key1, value1);
/* 162 */     map.set(key2, value2);
/*     */     return mutableIntLongMap1;
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
/*     */   public static final MutableIntLongMap mutableIntLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3) {
/* 176 */     MutableIntLongMap mutableIntLongMap1 = new MutableIntLongMap(0, 1, null), map = mutableIntLongMap1; int $i$a$-also-IntLongMapKt$mutableIntLongMapOf$3 = 0;
/* 177 */     map.set(key1, value1);
/* 178 */     map.set(key2, value2);
/* 179 */     map.set(key3, value3);
/*     */     return mutableIntLongMap1;
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
/*     */   public static final MutableIntLongMap mutableIntLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3, int key4, long value4) {
/* 195 */     MutableIntLongMap mutableIntLongMap1 = new MutableIntLongMap(0, 1, null), map = mutableIntLongMap1; int $i$a$-also-IntLongMapKt$mutableIntLongMapOf$4 = 0;
/* 196 */     map.set(key1, value1);
/* 197 */     map.set(key2, value2);
/* 198 */     map.set(key3, value3);
/* 199 */     map.set(key4, value4);
/*     */     return mutableIntLongMap1;
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
/*     */   public static final MutableIntLongMap mutableIntLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3, int key4, long value4, int key5, long value5) {
/* 217 */     MutableIntLongMap mutableIntLongMap1 = new MutableIntLongMap(0, 1, null), map = mutableIntLongMap1; int $i$a$-also-IntLongMapKt$mutableIntLongMapOf$5 = 0;
/* 218 */     map.set(key1, value1);
/* 219 */     map.set(key2, value2);
/* 220 */     map.set(key3, value3);
/* 221 */     map.set(key4, value4);
/* 222 */     map.set(key5, value5);
/*     */     return mutableIntLongMap1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\IntLongMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */